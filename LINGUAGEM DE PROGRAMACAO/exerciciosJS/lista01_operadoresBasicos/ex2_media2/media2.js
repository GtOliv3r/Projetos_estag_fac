var btn = document.getElementById("btnCalcular")
btn.addEventListener('click',calcularMedia)

function calcularMedia(){
    let n1 = Number(document.getElementById('n1').value)
    let n2 = Number(document.getElementById('n2').value)
    
    
document.getElementById('result').innerText = (n1+(n2*2))/3
}