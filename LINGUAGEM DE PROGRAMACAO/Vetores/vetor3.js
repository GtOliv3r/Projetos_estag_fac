//crie um vetor com numeros diversos e verifique se existe e em qual posição
//esta um determinado numero neste vetor

var num = [2,51,2,3,4,6,334,23,432,43,12]
var n = 6665
pos = 0

//resposta esperada: numero 7 não encontrado

for(i=0;i<num.length;i++){
    if(n==num[i]){
        console.log("posição do elemento 'n' dentro do vetor é: " + num.indexOf(n))
    }
}    
    if(num.indexOf(n)==-1)
    console.log("posição do elemento 'n' dentro do vetor não foi encotrado")


// Resposta esperada: numero 2 nas posições : 0,2


//PRECISO FAZER PERCORRER O VETOR INTEIRO SE TIVER MAIS REPETICÇOES DO n