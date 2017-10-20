<?php 
/*
	função date() - CAPTURA A DATA E HORA DO SISTEMA PARAMETROS:
	d - Dia do mês com 2 digitos
	D - Representação textual do dia
	(tres letras: Mon até Son)
	m - Representação numérica do mês com 2 dígitos 
	M - Representação textual do mÊs 
	(três letras: Jan e Dec)
	y - Representação do anocom 2 digitos 
	Y - Representação do ano com 4 dígitos 
	l ('L' minúsculo) - Descrição do dia da semana
	(Sunday até Saturday)
	h - Formato em 12horas 
	H - Formato em 24 horas 
	i - Minutos com 2 digitos
	s - Segundos com 2 digitos 
	A - AM ou PM
	
	No MySQL:
	O formato de entrada de um campo DATE é AAAA-MM-DD
	DATETIME é AAAA-MM-DD HH:MM:SS
	
	FORMATAÇÃO NUMÉRICA:
	
	PADRÃO:
	number_format (valor ou variavel)
	CONTROLE DE CASAS DECIMAIS :
	number_format(valor ou variável),casas decimais)
	BRASILEIRO:
	number_format(valor ou variável, 2, ',', '.')
	FUNÇÃO ROUND:
	Arredonda um número, podendo adicionar quantidade de casas decimais.
	round(valor ou variável, casas decimais):
	
	
?>
