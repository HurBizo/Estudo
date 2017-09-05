<?php
	$n1 = $_GET ['v1'];
	$n2 = $_GET ['v2'];
	
	$op = $_GET ['op'];
	
		
	switch($op){
		case 'Somar':
			$soma = $n1 + $n2;
			echo"$soma";
			
			break;
			
		case 'Multiplicacao':
			$mult = $n1 * $n2;
			echo"$mult";
			
			break;
			
		case 'Divisao':
			$div = $n1 / $n2;
			echo"$div";
			
			break;
			
		case 'Subtracao':
			$sub = $n1 - $n2;
			echo"$sub";
			
			break;
			
		case 'RaizQuadrada':
			$raiz = sqrt($n1);
			echo"$raiz";
			
			break;
				
		case 'Exponenciacao':
			$exponen = pow($n1, $n2);
			echo"exponen";
			
			break;
		
		case 'Resto':
			$resto = $n1 % $n2;
			echo"resto";
			
			break;
			
		
		default:
	}
?>
