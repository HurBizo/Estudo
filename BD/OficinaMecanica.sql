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

--Criaçao da chve estrangeira
 ALTER TABLE Atendimento.Veiculo
		ADD CONSTRAINT FK_Cliente_Veiculo
		FOREIGN KEY (codCliente) REFERENCES Atendimento.Cliente(CodCliente);
GO

	 

		  

