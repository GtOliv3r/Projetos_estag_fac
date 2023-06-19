var btn = document.getElementById("btnCalcular")
btn.addEventListener('click',calcularMdc)

function calcularMdc(){
    let n1 = parseInt(document.getElementById('n1').value)
    let n2 = parseInt(document.getElementById('n2').value)
    let resultado = document.getElementById('result')
    

    if(n1>n2){
for(let contr=n2;contr>=1;contr--){
    if(n1%contr==0 && n2%contr==0){
        resultado.innerText = contr
        break
    }    
}

    }else{
        for(let contr=n1;contr>=1;contr--){
            if(n1%contr==0 && n2%contr==0){
                resultado.innerText = contr
                break
            }    

    }
}
}