<?php
	$frequencia = @_GET ['frequencia'];
	
	$nota1 = @_GET ['nota1'];
	$nota2 = @_GET ['nota2'];
	$nota3 = @_GET ['nota3'];
	
	$nota = ($nota1 + $nota2 + $nota3) / 3;
	
	if($nota < 5 && $frequencia < 75){
		echo"Reprovado";
	}else if($nota < 7 && $frequencia < 75){
		echo"Recuperação";
	}else if($nota >= 7 && $frequencia < 75){
		echo"Aprovado";
	}else{
			echo" Reprovado !" ;
	}




?>
