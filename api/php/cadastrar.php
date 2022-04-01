<?php

//Incluir conexao
include("conexao.php");

//Obter dados
$obterDados= file_get_contents("php://input");

//Extrair os dados do JSON
$extrair = json_decode();

//separar os dados do json
$nomeCurso = $extrair->cursos->nomeCurso;
$valorCurso= $extrair->cursos->valorCurso;

//SQL
$sql = "INSERT INTO cursos(nomeCurso, valorCurso) VALUES ('$nomeCurso', $valorCurso)";
mysqli_query($conexao, $sql);

//exportar os dados cadastrador

$curso = [
    'nomeCurso' => $nomeCurso,
    'valorCurso'=> $valorCurso

]
json_encode(['curso']=>$curso);
?>
