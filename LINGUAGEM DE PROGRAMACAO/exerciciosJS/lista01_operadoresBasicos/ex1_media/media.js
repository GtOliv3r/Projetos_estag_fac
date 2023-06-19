var btn = document.getElementById("btnCalcular")
btn.addEventListener('click',calcularMedia)

function calcularMedia(){
    let n1 = Number(document.getElementById('n1').value)
    let n2 = Number(document.getElementById('n2').value)
    
    let media = (n1+n2)/2
    
document.getElementById('result').innerText = media
}



