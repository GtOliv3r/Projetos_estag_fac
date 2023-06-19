/*var p = window.document.getElementsByTagName('p')[1]
window.alert(p.innerHTML)*/

/*var p = window.document.getElementsByClassName()[0]
window.document.write(p.innerHTML)*/

/*var p = window.document.querySelector('p#p1')
window.document.write(p.InnerText)*/


var box = window.document.getElementById("click")

box.addEventListener("mouserenter",entrar)
box.addEventListener("mouseruot",sair)
box.addEventListener("click",clicar)



function entrar(){
    
    box.style.background="yellow"
}

    function sair(){
        
        box.style.background="white"
    }

    function clicar(){
        box.innerText="CLICOU!!"
    }






