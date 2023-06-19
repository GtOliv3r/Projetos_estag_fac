var btn = document.getElementById("btnCalcular")
btn.addEventListener('click',executar)



function executar()
{
    let n1 = parseInt(document.getElementById('n1').value)
    let n2 = parseInt(document.getElementById('n2').value)
    var result = document.getElementById('result')
    

    if(n1>n2)
    {
        result.innerText = mdc(n1,n2)
    }
    else
    {
        result.innerText = mdc(n2,n1)
    }
}

/*
Algoritmo de Euclides

O MDC entre dois números não se altera quando comparado
entre o MDC entre o menor numero e o resto da divisão 
entre os dois numeros originais

*/

function mdc(maior,menor)
{
while(menor!=0){
    let aux = maior
    maior = menor
    menor = (aux%menor)
}
return maior
}



