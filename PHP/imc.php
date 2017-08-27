<?php

  $alto = @_GET ['altura'];
	$pes = @_GET ['peso'];
	
	$peso = pes / (alto * alto);
	
	if($peso < 17){
    echo"IMC: $peso";
		echo"Condição: Muito abaixo do peso! ";
	}else if($peso < 18.49){
    echo"IMC: $peso";
		echo"Abaixo do peso! ";
	}else if$peso < 24.99){
    echo"IMC: $peso";
		echo"Peso normal :-)";
	}else if($peso < 29.99){
    echo"IMC: $peso";
		echo"acima do peso! ";
	}else if($peso < 34.99){
    echo"IMC: $peso";
		echo"Obesidade I";
	}else if($peso < 39.99){
    echo"IMC: $peso";
		echo"Obesidade II (severa)";
	}else{
    echo"IMC: $peso";
    echo"Obesidade III (mórbida)";
  }
  
?>
