var btn = document.getElementById("btnCalcular")
btn.addEventListener('click',calcularMdc)

function calcularMdc(){
    let n1 = parseInt(document.getElementById('n1').value)
    let n2 = parseInt(document.getElementById('n2').value)
    let result = document.getElementById("result")
    console.log(n1)
    if(n1==n2){
        result.innerText = n1
        console.log(n1)
    }
    else{
        let contr
        
        if(n1>n2){
        contr = n2
        while(n1%contr!=0 || n2%contr!=0){
            contr--
            console.log(contr)
            result.innerText = contr
        }
        }

        else{
            contr = n1
            while(n1%contr!=0 || n2%contr!=0){
                contr--
                console.log(contr)
                result.innerText = contr
            }
        }
    }
    
}