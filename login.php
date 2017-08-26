<?php
$usuario = $_POST ['usuario'];
$senha = $_POST ['senha'];

$user = administrador;
$senha = 1234;

if($usuario == $user){
	echo "Olá marilene! ";
}else{
	echo "Login inválido";
}



?>
