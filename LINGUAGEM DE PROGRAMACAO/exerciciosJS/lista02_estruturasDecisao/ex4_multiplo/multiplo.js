var btn = document.getElementById("btnCalcular")
btn.addEventListener('click',multiplo)

function multiplo(){
    let n1 = Number(document.getElementById('n1').value)
    
    let mult= n1%n2
    if(mult==0){
document.getElementById('result').innerText = "É multiplo"}
    else{
    document.getElementById('result').innerText = "Não é multiplo"}
}