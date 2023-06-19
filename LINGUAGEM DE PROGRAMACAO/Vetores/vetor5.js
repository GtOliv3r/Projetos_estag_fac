//crie um vetor com numeros diversos e verifique se existe e em qual posição
//esta um determinado numero neste vetor


//VERSÃO PROFESSOR CAINÃ - OTIMIZADA

var num = [2,51,2,3,4,6,334,23,432,43,12,2,2] //vetor com numeros aleatorios

console.log(pesquisar(2))

function pesquisar(n){

let aux= []

for(let i=0;i<num.length;i++){
if(num[i]==n){
aux.push(i)
}
}
if(aux.length==0){
    return `O numero ${n} não foi encontrado`
}
return `O numero ${n} foi encontrado na(s) posição(ões) ${aux}`
}