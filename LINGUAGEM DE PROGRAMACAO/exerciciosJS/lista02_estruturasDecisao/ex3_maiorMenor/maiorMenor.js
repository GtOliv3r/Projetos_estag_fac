var btn = document.getElementById("btnCalcular")
btn.addEventListener('click',maiorMenor)

function maiorMenor(){
    let n1 = Number(document.getElementById('n1').value)
    let n2 = Number(document.getElementById('n2').value)
    
    if(n1>n2){
document.getElementById('result').innerText = n1}
    else{
    document.getElementById('result').innerText = n2}
}