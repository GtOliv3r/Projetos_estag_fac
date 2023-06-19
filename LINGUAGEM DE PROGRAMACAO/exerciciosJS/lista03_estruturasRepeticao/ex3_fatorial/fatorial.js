var btn = document.getElementById('btnCalcular')
btn.addEventListener('click', executar)


//SOLUÇÃO EM RECURSIVIDADE DE FUNÇÃO - MINHA VERSÃO

/*
function executar()
{

            let n1 = Number.parseInt(document.getElementById('n1').value)
            

            if(n1>1)
            {
             document.getElementById('result').innerText = fatorial(n1,(n1-1))
            }
                
                else
                {
                    document.getElementById('result').innerText = 1
                }
}


function fatorial(num,fat)
{

    if(fat==1)
{
return num
}

return fatorial ((num*=fat),(fat-1))

}


*/

//SOLUÇÃO COM RECURSIVIDADE - PROFESSOR CAINÃ
function executar()
{

            let n1 = Number.parseInt(document.getElementById('n1').value)
            let result = document.getElementById('result')
            result.innerText = fatorial(n1)
            
}


function fatorial(n)
{
    if(n==1)
{
return 1
}

return n*fatorial(n-1)

}


/*

function executar(){
    let n1 = Number.parseInt(document.getElementById('n1').value)
    let resultado = n1


//SOLUÇÃO EM WHILE

if(n1>0){
while(n1>=1){
       n1--
       resultado *= n1
}
}

else{
resultado = 1}
    
document.getElementById('result').innerText = resultado

}

//n * (n-1)! <---- DICA para recursividade */

/*
//SOLUÇÃO EM FOR 

for(let i = n1;i>=0;i--){
    resultado = resultado * i
}
resultado.innerText = resultado
*/