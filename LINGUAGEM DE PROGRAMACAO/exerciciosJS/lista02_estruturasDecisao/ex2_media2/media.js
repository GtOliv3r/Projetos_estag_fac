var btn = document.getElementById("btnCalcular")
btn.addEventListener('click',calcularMedia)

function calcularMedia(){
    let n1 = Number(document.getElementById('n1').value)
    let n2 = Number(document.getElementById('n2').value)
    
   let aprov = " APROVADO!!!"
   let repr = " REPROVADO!!!"
   let rec = " RECUPERAÇÃO!!!"

  let = res = 0


res = (n1+n2)/2

if(res>=6){
   document.getElementById('result').innerText = res+aprov
}

if (res>=5 && res<6){
    document.getElementById('result').innerText = res+rec
}
if (res<5){
document.getElementById('result').innerText = res+repr
}

}