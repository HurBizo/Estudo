
--Script para alterações no BD
USE master;
GO

DROP DATABASE OficinaMecanica;
GO



--Criação do banco de dados
CREATE DATABASE OficinaMecanica;
GO

-- Usando o banco de dados Oficina Mecanica
USE OficinaMecanica;
GO

-- Criação dos esquemas necessários
CREATE SCHEMA Oficina;
GO

CREATE SCHEMA Atendimento;
GO

--Criação da tabela Cliente
CREATE TABLE Atendimento.Cliente(
	CodCliente INT NOT NULL IDENTITY,
	Nome VARCHAR(30) NOT NULL,
	Endereco VARCHAR(100) NOT NULL,
	Telefone CHAR(11),
	CNH CHAR(11) NOT NULL
);
GO

-- Criação de um índice simples que permite repetição
CREATE INDEX IDX_Nome ON
	Atendimento.Cliente(Nome);

--Criação da chave primária da tabela Cliente
ALTER TABLE Atendimento.Cliente ADD
	CONSTRAINT PK_Cliente PRIMARY KEY(CodCliente);
GO

--Criação da tabela Mecanico
CREATE TABLE Oficina.Mecanico(
	CREA CHAR(5) NOT NULL,
	Nome VARCHAR(30) NOT NULL,
	Endereco VARCHAR(100) NOT NULL,
	Celular CHAR(11),
	CPF CHAR(11) NOT NULL
);
GO

--Criação da chave primária na tabela Mecanico
ALTER TABLE Oficina.Mecanico ADD
	CONSTRAINT PK_Mecanico PRIMARY KEY(CREA);
GO

-- Criação de um índice único no campo CPF
CREATE UNIQUE INDEX IDX_CPF ON
	Oficina.Mecanico(CPF);
GO

--Criação da tabela Veiculo
CREATE TABLE Atendimento.Veiculo(
	Placa CHAR(7) NOT NULL,
	CodCliente INT,
	Marca VARCHAR(20) NOT NULL,
	Modelo VARCHAR(20) NOT NULL,
	Ano CHAR(4),
	RENAVAM CHAR(9)
);
GO

--Criação da chave primária da tabela Veiculo
ALTER TABLE Atendimento.Veiculo ADD
	CONSTRAINT PK_Veiculo PRIMARY KEY(Placa);
GO

-- Criação de um índice para dois campos
CREATE INDEX IDX_Modelo_Renavam ON
	Atendimento.Veiculo(Modelo, RENAVAM);
GO

--Criação da tabela Veiculo Pesado
CREATE TABLE Oficina.VeiculoPesado(
	Placa CHAR(7) NOT NULL,
	ComprimentoMetros DECIMAL(5,2),
	NumeroEixos TINYINT,
	PesoToneladas DECIMAL(8,2)
);
GO

--Criação da chave primária da tabela Veiculo Pesado
ALTER TABLE Oficina.VeiculoPesado ADD
	CONSTRAINT PK_VeiculoPesado PRIMARY KEY(Placa);
GO

--Criação da tabela Revisao
CREATE TABLE Oficina.Revisao(
	CodRevisao INT NOT NULL IDENTITY,
	Placa CHAR(7),
	CREA CHAR(5),
	DataHoraRevisao DATETIME NOT NULL,
	ValorRevisao MONEY,
	Relatorio VARCHAR(1000),
	TrocaPecas BIT
);
GO

--Criação da chave primária da tabela Revisão
ALTER TABLE Oficina.Revisao ADD
	CONSTRAINT PK_Revisao PRIMARY KEY(CodRevisao);

--Criação de um índice no campo DataHora ordenado de forma descrescente
CREATE INDEX IDX_DataHora ON
	Oficina.Revisao(DataHoraRevisao DESC);

--Criação dos relacionamento entre as tabelas através das chaves estrangeiras

--Criação da chave estrangeira para relacionar (1:N) Cliente a Veiculo
ALTER TABLE Atendimento.Veiculo ADD
	 CONSTRAINT FK_Cliente_Veiculo FOREIGN KEY(CodCliente)
	 REFERENCES Atendimento.Cliente;
GO

--Criação da chave estrangeira para relacionar (N:N) Mecanico - Revisao - Veiculo
--1ª Parte (1:N) Mecanico - Revisão
ALTER TABLE Oficina.Revisao ADD
	CONSTRAINT FK_Mecanico_Revisao FOREIGN KEY(CREA)
	REFERENCES Oficina.Mecanico;
GO

--2ª Parte (1:N) Veiculo - Revisão
ALTER TABLE Oficina.Revisao ADD
	CONSTRAINT FK_Veiculo_Revisao FOREIGN KEY(Placa)
	REFERENCES Atendimento.Veiculo;
GO

--Criação do relacionamento 1:1 entre Veiculo - Veiculo Pesado
ALTER TABLE Oficina.VeiculoPesado ADD
	CONSTRAINT FK_Veiculo_VeiculoPesado FOREIGN KEY(Placa)
	REFERENCES Atendimento.Veiculo;
GO

