var btn = document.getElementById("btnCalcular")
btn.addEventListener('click',imparPar)

function imparPar(){
    let n1 = Number(document.getElementById('n1').value)
    
    let resto=n1%2
    if(resto==0){
document.getElementById('result').innerText = "É Par"}
    else{
    document.getElementById('result').innerText = "É impar"}
}