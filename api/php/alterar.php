<?php

//Incluir conexao
include("conexao.php");

//Obter dados
$obterDados= file_get_contents("php://input");

//Extrair os dados do JSON
$extrair = json_decode();

//separar os dados do json
$idCurso = $extrair->cursos->idCurso;
$nomeCurso = $extrair->cursos->nomeCurso;
$valorCurso= $extrair->cursos->valorCurso;

//SQL
$sql = "UPDATE cursos SET nomeCurso='$nomeCurso',valorCurso=$valorCurso WHERE idCurso=$idCurso";
mysqli_query($conexao, $sql);

//exportar os dados cadastrador

$curso = [
    'idCurso' => $idCurso,
    'nomeCurso' => $nomeCurso,
    'valorCurso'=> $valorCurso

]
json_encode(['curso']=>$curso);
?>
