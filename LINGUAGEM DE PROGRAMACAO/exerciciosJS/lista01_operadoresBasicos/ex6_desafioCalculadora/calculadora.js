var btnSomar = document.getElementById("btnSomar")
btnSomar.addEventListener('click',somar)

function somar(){
    let n1 = Number(document.getElementById('n1').value)
    let n2 = Number(document.getElementById('n2').value)
    
    
    
document.getElementById('result').innerText = (n1+n2)
}

var btnSub = document.getElementById("btnSub")
btnSub.addEventListener('click',subtrair)

function subtrair(){
    let n1 = Number(document.getElementById('n1').value)
    let n2 = Number(document.getElementById('n2').value)
    
    
    
document.getElementById('result').innerText = (n1-n2)
}

var btnMult = document.getElementById("btnMult")
btnMult.addEventListener('click',multiplicar)

function multiplicar(){
    let n1 = Number(document.getElementById('n1').value)
    let n2 = Number(document.getElementById('n2').value)
    
    
    
document.getElementById('result').innerText = (n1*n2)
}

var btnDiv = document.getElementById("btnDiv")
btnDiv.addEventListener('click',dividir)

function dividir(){
    let n1 = Number(document.getElementById('n1').value)
    let n2 = Number(document.getElementById('n2').value)
    
    
    
document.getElementById('result').innerText = (n1/n2)
}