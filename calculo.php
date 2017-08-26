<?php
	$n1 = $_GET ['v1'];
	$n2 = $_GET ['v2'];
	
	$op = $_GET ['op'];
	
	$soma = n1 + n2;
	$mult = n1 * n2;
	$div = n1 / n2;
	$sub = n1 - n2;
	
	
	switch(op){
		case 'Somar':
			echo"$soma";
			
			break;
			
		case 'Multiplicar':
			echo"$mult";
			
			break;
			
		case 'Dividir':
			echo"$div";
			
			break;
			
		case 'Subtrair':
			echo"$sub";
			
			break;
		default:
	}



?>>