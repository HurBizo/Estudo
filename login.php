<?php
$usuario = $_POST ['usuario'];
$senha = $_POST ['senha'];

$user = administrador;
$senha1 = 1234;

if($usuario == $user && $senha == $senha1){
	echo "Olá marilene! ";
}else{
	echo "Login inválido";
}



?>
