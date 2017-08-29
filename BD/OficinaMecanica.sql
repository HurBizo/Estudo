
-- usando o bd master 
USE master; 
GO


-- Apagando o bd Oficina Mecanica
DROP DATABASE OficinaMecanica;
GO


-- criaçao do banco de dados Oficina Mecanica --
CREATE DATABASE OficinaMecanica;
GO

-- usando o bd OficinaMecanica
USE OficinaMecanica;
Go

-- Criação de schema
CREATE SCHEMA Atendimento;
GO

CREATE SCHEMA Oficina;
GO


--Criação da tabela 
CREATE TABLE Atendimento.Cliente(
		CodCliente INT NOT NULL IDENTITY,
		Nome VARCHAR(30) NOT NULL,
		Endereço VARCHAR(100) NOT NULL,
		Telefone CHAR(11),
		Cnh CHAR(11) NOT NULL
);
GO

--Criação da chave primaria na tabela cliente 
ALTER TABLE Atendimento.cliente
	ADD CONSTRAINT PK_Cliente PRIMARY KEY(codcliente);
GO
--Criação da tabela 
CREATE TABLE Atendimento.Veiculo(
		Placa CHAR(7) NOT NULL,
		CodCliente INT, 
		Marca VARCHAR(30) NOT NULL,
		Modelo VARCHAR(30) NOT NULL,
		Ano CHAR(4),
		Renavam CHAR(9) NOT NULL
);
GO

-- Criação da chave primaria em Veiculo 
ALTER TABLE Atendimento.Veiculo
		ADD CONSTRAINT PK_Veiculo PRIMARY KEY(Placa);
GO

--Criaçao da chve estrangeira de cliente para veiculo
 ALTER TABLE Atendimento.Veiculo
		ADD CONSTRAINT FK_Cliente_Veiculo
		FOREIGN KEY (codCliente) REFERENCES Atendimento.Cliente(CodCliente);
GO

-- CRIAÇÃO DA TABELA MECÂNICA
CREATE TABLE Oficina.Mecanica(
		CREA CHAR(5) NOT NULL,
		Nome VARCHAR(30) NOT NULL,
		Endereço VARCHAR(50) NOT NULL,
		Celualar CHAR(11),
		CPF VARCHAR(11) NOT NULL
);
GO

-- CRIAÇÃO DA CHAVE PRIMÉRIA 
ALTER TABLE Oficina.Mecanica
		ADD CONSTRAINT PK_Mecanico PRIMARY KEY(CREA);
GO 

--CRIAÇÃO DA TABELA REVISÃO
CREATE TABLE Oficina.Revisao(
		CodRevisao INT NOT NULL IDENTITY,
		Placa CHAR(7),
		CREA CHAR(5),
		DataHoraRevisao DATETIME NOT NULL,
		ValorRevisao MONEY,
		Relatorio VARCHAR(500),
		TrocaPeca BIT		
); 
GO

--Criação da chave Primária 
ALTER TABLE Oficina.Revisao
		ADD CONSTRAINT  PK_Revisao PRIMARY KEY(CodRevisao);
GO

-- Parte 1 Relação N:N 
-- Criação da chave estrangeira Mecanico --> revisão
ALTER TABLE Oficina.Revisao
		ADD CONSTRAINT PK_Mecanica_Revisao
		FOREIGN KEY(CREA) 
			REFERENCES Oficina.Mecanica(CREA);
GO

--Parte 2
--Criação da chave estrangeira Veiculo ==> revisão
ALTER TABLE Oficina.Revisao
		ADD CONSTRAINT FK_Veiculo_Revisao
		FOREIGN KEY(Placa)
				REFERENCES Atendimento.Veiculo(Placa);
