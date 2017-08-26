<?php
	$n1 = $_GET ['v1'];
	$n2 = $_GET ['v2'];
	
	$op = $_GET ['op'];
	
		
	switch(op){
		case 'Somar':
			$soma = n1 + n2;
			echo"$soma";
			
			break;
			
		case 'Multiplicar':
			$mult = n1 * n2;
			echo"$mult";
			
			break;
			
		case 'Dividir':
			$div = n1 / n2;
			echo"$div";
			
			break;
			
		case 'Subtrair':
			$sub = n1 - n2;
			echo"$sub";
			
			break;
		default:
	}
?>
