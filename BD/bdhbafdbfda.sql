--usando oficna mecanica
USE OficinaMecanica
GO



--atualizando a revizao
UPDATE Oficina.Revisao
SET ValorRevisao = 750.0
WHERE CodRevisao = 4;

UPDATE Oficina.Revisao
SET Relatorio = 'Manutanção do sistema de arrefecimento'
WHERE CodRevisao = 4;
GO

UPDATE Oficina.Revisao
SET TrocaPecas = 1
WHERE CodRevisao = 4;
GO

SELECT *
FROM Oficina.Revisao;
GO

SELECT *
FROM Atendimento.Cliente;
GO


SELECT *
FROM Atendimento.Veiculo;
GO
--Apagando o registro da paula
--DELETE FROM Atendimento.Cliente
--WHERE CodCliente = 2;
--GO
