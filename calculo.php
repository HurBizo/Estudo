<?php
	$n1 = $_GET ['v1'];
	$n2 = $_GET ['v2'];
	
	$op = $_GET ['op'];
	
		
	switch(op){
		case 'Somar':
			$soma = n1 + n2;
			echo"$soma";
			
			break;
			
		case 'Multiplicacao':
			$mult = n1 * n2;
			echo"$mult";
			
			break;
			
		case 'Dividisao':
			$div = n1 / n2;
			echo"$div";
			
			break;
			
		case 'Subtracao':
			$sub = n1 - n2;
			echo"$sub";
			
			break;
			
		case 'RaizQuadrada':
			$raiz = sqrt($v1);
			echo"$raiz";
			
			break;
				
		case 'Exponenciacao':
			$exponen = pow($v1, $v2);
			echo"exponen";
			
			break;
		
		case 'Resto':
			$resto = $v1 % $v2;
			echo"resto";
			
			break;
			
		
		default:
	}
?>
