var btn = document.getElementById("btnCalcular")
btn.addEventListener('click',calcularMedia)

function calcularMedia(){
    let n1 = Number(document.getElementById('n1').value)
    let n2 = Number(document.getElementById('n2').value)
    
   let aprov = " APROVADO!!!"
   let repr = " REPROVADO!!!"
  let  res = 0
res = (n1+n2)/2

if(res>=5){
   document.getElementById('result').innerText = res+aprov
}
else{
document.getElementById('result').innerText = res+repr}

}


