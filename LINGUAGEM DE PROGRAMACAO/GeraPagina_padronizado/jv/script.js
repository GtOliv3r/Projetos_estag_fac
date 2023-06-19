var btn = document.getElementById('run')
btn.addEventListener('click', inserir)

function inserir(){ 

    //oculta pg1 e exibe pg2
    let p1 = document.getElementById('page1')
    let p2 = document.getElementById('page2')

    p1.style.display = "none"
    p2.style.display = "flex"

    //insere code em html
    let codeHtml = document.getElementById('codeHtml').value
    p2.innerHTML = codeHtml

    //insere code em js
    let codeJs = document.getElementById('codeJs').value
    
    var tagScript = document.createElement("script")
    tagScript.setAttribute("type", "text/javascript")

    var textScript = document.createTextNode(codeJs)

    tagScript.appendChild(textScript)
    document.body.appendChild(tagScript)

}