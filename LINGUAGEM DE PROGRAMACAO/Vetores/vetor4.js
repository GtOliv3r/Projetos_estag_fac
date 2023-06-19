//crie um vetor com numeros diversos e verifique se existe e em qual posição
//esta um determinado numero neste vetor



//METODO DESENSOLVIDO POR MIM - GUSTA
var num = [2,51,2,3,4,6,334,23,432,43,12,2,2] //vetor com numeros aleatorios
var n = 2 //numero a ser veriricado dentro do vetor
var pos = [] //Salva as posiçoes do n dentro do vetor "num"
var cont = 0 //contador para auxiliar o salvamento das pocições do n dentro de num

/*
for(i=0;i<num.length;i++){
    if(n==num[i]){
    pos [cont] = i
    cont++
    }
}    
    if(cont==0)
    console.log("posição de " + n + " não encontrada")//resposta esperada: posição de "n" não encontrada

    else
    console.log("posição de " + n + " dentro do vetor é: " + pos)//respota esperada: posição de n dentro do vetor é: n,n,...
*/

// Resposta esperada: numero 2 nas posições : 0,2



//METODO PROFESSOR

console.log(pesquisar(23))

function pesquisar(n){

    

for(let i=0;i<num.length;i++){
if(num[i]==n)

return `O numero ${n} foi encontrado na posição ${i}`
}
return `O numero ${n} não foi encontrado` // OUTRO MÉTODO DE CONCATENAÇÃO ALGO ${variavel} COISA`
}