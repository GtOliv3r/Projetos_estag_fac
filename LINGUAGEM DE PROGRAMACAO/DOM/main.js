//VAR: Escopo global
//Qualquer um acesso a variavel

/*
 getElementById - Pega um elemento por ID.

 getElementByClass - Pega um elemento por Classe

 querySelector - Pega um objeto por classe, id.

 querySelectorAll - Pega todos os objetos daquela id/classe


*/

//Coletar e armazenar a informação






//Eventos...
/*
    Quando algum evento acontecer, faz uma tarefa

    addEventListener('evento', o que fazer)
*/

//Botão Submit
var botao_submit = document.getElementById('submit')
var botao_limpar = document.querySelector('#limpar')
document.querySelector('#submit').addEventListener

//chamando o evento para o botao submit
botao_submit.addEventListener('click',coleta_dados)
botao_limpar.addEventListener('click',limpa_dados)

//Função - JavaScript

/*
    É um conjunto de tarefas/instruções que servirão com um propósito específico para cada tarefa.
ex: O código é sobre cozinhar um bolo, uma função, pode ser o ato de ligar o forno.
    Não tem como ligar o fogão, se eu não chamar o passo de ligar o forno. (ELA NÃO SE EXECUTA SOZINHA)
*/

// Comando Nome. Parametros
//Essa função irá coletar os dados digitados e mostrar no console
function coleta_dados(){

    var nome = document.querySelector("#nome").value //coleta de nome que esta na tela
var endereco = document.getElementById("endereco").value //coleta de endereço que esta na tela
var nascimento = document.querySelector("#nascimento").value //coleta de data de nascimento que nsta na tela
    var nome_coletado = nome
    var ende_coletado = endereco
    var nasc_coletado = nascimento

   console.log(nome_coletado)
   console.log(ende_coletado)
   console.log(nasc_coletado)
}

//Maneiras de chamar função
/*
function mostra_texto(){
    console.log("Ola mundo")
}

forma 1:

mostra_texto()
---> "Ola mundo"

*chama somente o resultado final

forma 2:

mostra_texto
---> F mostra_texto()

*chama todas as etapas da função
*/

function limpa_dados(){
    document.getElementById('nome').value = ""
    document.getElementById('endereco').value = ""
    document.getElementById('nascimento').value = ""

    return "deu certo"
}




