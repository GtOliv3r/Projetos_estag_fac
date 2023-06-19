/*Array - VETOR ( MATRIZ 1D) - Linha
                (MATRIZ 2D) - Linha e Coluna
                (MATRIZ 3D) - Linha, Coluna e Camada


                Armazena uma sequencia de valores
                No mesmo array armazenar diferentes valores

                Sintaxe: []

*/

//Declaração 



const nomes = ["rafael Mattos",1,"vitor","renan","Aguinaldo","Samuel","Lucas",65,"Gabriel","Johnatan",
 "Amabile",8,"Camila","Gabriel Teodoro","Gabriel Cavalcanti",5,"Kelvin","Erick","Diego","Giovanni",
  "Rafael Rodrigues","Ana Julia","Guilherme Neves", "Karina", "Sergio", "Kauan",86, "Vinicius Antunes",
   "Leticia", "Vinicius de Morais",24,"Gabriel Henrique","Lucas Matos", "Misael", "Thiago", "Kayke",
    "Matheus",12,"Vincenzo","Andre", "Victor","Gustavo","Guilherme Leal","Luana",75,"Carlos","Felipe","Talia"]

    const numeros = []


/*Acessando array
    forma 1: Acessar pela posição do ITEM
[0] -> tras o primeiro item do array

    forma 2:Acessar pelo valor do ITEM
    ["1"] -> Busca e retorna o valor com o nome.

*/

//Iterar (Passar Por) cada nome e mostrar o nome na tela.

//1º Atributo - length - comprimento do array



//2º Adicionando itens .push()

//nomes.push("valor manual")

/*3º Removendo itens .pop(ultimo)
                     .shift(primeiro)
                     .splice(posição de inicio,quantidade de itens)

*/

//nomes.splice(0,1)

console.log(nomes.length)
nomes.push("valor manual")

//Passa por cada aluno dentro da lista NOMES
for(aluno=0; aluno<=nomes.length;aluno++){
    //Iterou e mostrou o nome de cada aluno

if(typeof nomes[aluno] == 'string'){
    console.log("É aluno!")
}
else{
    numeros.push(nomes[aluno])
    nomes.splice(aluno,1)
    
}
}

console.log(nomes)
console.log(numeros)