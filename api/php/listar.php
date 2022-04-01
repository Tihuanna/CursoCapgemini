<?php

//Incluir conexão
include("conexao.php");

//Sql

$sql = "SELECT *FROM cursos";

//executar

$executar = mysqli_query($conexao, $sql);

//vetor

$cursos = [];

//indice

$indice = 0;

//Laço

while ($linha = mysqli_fetch_assoc($executar)){
    $cursos[$indice]['idCurso'] = $linha['idCurso'];
    $cursos[$indice]['nomeCurso'] = $linha['nomeCurso'];
    $cursos[$indice]['valorCurso'] = $linha['valorCurso'];
    $indice++;
}
 

//JSON
json_encode(['cursos'=>$cursos]);

?>