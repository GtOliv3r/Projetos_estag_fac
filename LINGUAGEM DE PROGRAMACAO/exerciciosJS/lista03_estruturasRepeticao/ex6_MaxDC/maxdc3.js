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

function mdc(maior,menor)
{

    for(let contr=menor;contr>=1;contr--)
    {
        if(maior%contr==0 && menor%contr==0)
        {
            return contr //retornará o valor de contr, ou seja, o valor de contr que vai ser utilizado quando a função for chamada
        }    
    }
}