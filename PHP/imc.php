<?php

  $alto = @_GET ['altura'];
	$pes = @_GET ['peso'];
	
	$peso = pes / (alto * alto);
	
	if($peso < 17){
    		echo"IMC: $peso";
		echo"Condição: Muito abaixo do peso! ";
	}else if($peso < 18.49){
    		echo"IMC: $peso";
		echo"Condição: Abaixo do peso! ";
	}else if$peso < 24.99){
    		echo"IMC: $peso";
		echo"Condição: Peso normal :-)";
	}else if($peso < 29.99){
   		echo"IMC: $peso";
		echo"Condição: Acima do peso! ";
	}else if($peso < 34.99){
  		echo"IMC: $peso";
		echo"Condição: Obesidade I";
	}else if($peso < 39.99){
  		echo"IMC: $peso";
		echo"Condição: Obesidade II (severa)";
	}else{
    		echo"IMC: $peso";
    		echo"Condição: Obesidade III (mórbida)";
  }
  
?>
