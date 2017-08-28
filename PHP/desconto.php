<?php
      $nome = $_POST ['nome'];
      $compra = $_POST ['compra'];
      
      $total = $compra - $desconto;
      $osma = ',00';
      
      if($compra <= 200){
        $desconto = $compra * 0.1;
        echo"<h2>Olá $nome, sua compra de R$ $compra$osma sofreu desconto de R$$desconto$osma!</h2> <br/>";
        echo"<h1>O valor da compra será: R$$total$osma !</h1>";
      }else if($compra < 500){
        $desconto = $compra * 0.15;
        echo"<h2>Olá $nome, sua compra de R$ $compra$osma sofreu desconto de R$$desconto$osma!</h2> <br/>";
        echo"<h1>O valor da compra será: R$$total$osma !</h1>";
      }else if($compra > 500){
        $desconto = $compra * 0.2;
        echo"<h2>Olá $nome, sua compra de R$ $compra$osma sofreu desconto de R$$desconto$osma!</h2> <br/>";
        echo"<h1>O valor da compra será: R$$total$osma !</h1>";
      }
?>
