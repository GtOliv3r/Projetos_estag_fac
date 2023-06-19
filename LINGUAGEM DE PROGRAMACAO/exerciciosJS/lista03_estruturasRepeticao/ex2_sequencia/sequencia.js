var btn = document.getElementById('btnCalcular')
btn.addEventListener('click', contar)

function contar(){
    let n1 = Number.parseInt(document.getElementById('n1').value)
    let n2 = Number.parseInt(document.getElementById('n2').value)

let resultado = 'Resultado = '

if(n1<n2){
    while(n1<n2){
        document.getElementById('result').innerText = resultado
        resultado+= n1+ ', '
        n1++
        document.getElementById('result').innerText = resultado
    }
    
    resultado+= n1
    document.getElementById('result').innerText = resultado
}

if(n1>n2){
    while(n1>n2){
        document.getElementById('result').innerText = resultado
        resultado+= n1+ ', '
        n1--
        document.getElementById('result').innerText = resultado
    }
    
    resultado+= n1
    document.getElementById('result').innerText = resultado
}
}