/*

var n1 = 10;
var n2 = 5;

var n3 = n1+n2
var media = n3/2
console.log(media)

if(media>=7){
    console.log("Aluno passou! Parabéns!! ")
}

else if(media>=5){
    console.log("Aluno em recuperação!! CORRE ATRAS Q DA! )")
}

else{
    console.log("Aluno reprovado!! TENTE DNV, HOTWHEELS! (PISTA DO TUBARÃO)")
}


var n=2

switch(n){
        case 1:console.log("o valor é 1")
    break
        case 2:console.log("o valor é 2")
    break
    default:
        console.log("QUALQUER COISA")

} 

*/


/* Exercicio 1


var data = new Date()
var dia = data.getDay()
var hora = data.getHours()
console.log(dia)
console.log(hora)

switch (dia)
{
    case 0:
        console.log("Domingo")
        break;
    case 1:
        console.log("Segunda")
        break;
    case 2:
        console.log("Terca")
        break;
    case 3:
        console.log("Quarta")
        break;
    case 4:
        console.log("Quinta")
        break;
    case 5:
        console.log("Sexta")
        break;
    case 6:
        console.log("Sabado")
        break;
    
}



/*
0 - domingo
1 - segunda
2 - terça

...

6 - sabado


//exercicio 2 - 

var dataManual = (new Date())
var hora = dataManual.getHours();

console.log(dataManual.toLocaleTimeString('pt-br', { timeZone: 'America/Sao_Paulo'}))
console.log(hora)


if(hora < 12) {
    console.log("Bom dia flor do dia")
}
else if(hora<18){
    console.log("Boa Tarde")
}
else{
    console.log("Boa noite")
}

*/


// INSS

var salario = 6000
var i_nss = 0
var i_nssRed = 0
var dependentes = 1

if(salario<=1302.00){
    i_nss  = salario * 0.075
    i_nssRed = parseFloat(i_nss.toFixed(2));
    }
    
    else if(salario>=1302.01 && salario<=2571.29){
    i_nss  = salario * 0.09
    i_nssRed = parseFloat(i_nss.toFixed(2));
    }
    
    else if(salario>=2571.30 && salario<=3856.94){
    i_nss  = salario * 0.12
    i_nssRed = parseFloat(i_nss.toFixed(2));
    }
    
    else if(salario>=3856.95 && salario<=7507.49){
        i_nss = salario * 0.14
        i_nssRed = parseFloat(i_nss.toFixed(2));
    }
    
    else{
        i_nss = 7507.50 * 0.14
        i_nssRed = parseFloat(i_nss.toFixed(2));
    }

    

    console.log("INSS é: " + i_nssRed)

    var salarioBase = (salario-i_nssRed)-(189.59*dependentes)

    console.log("Salario Base é: " + salarioBase)

    


    //irrf = (salario base * aliquota - parcela a deduzir de cada salario base)
    
    var i_rrf = 0;
    var i_rrfRed = 0

    if(salarioBase<=1903.98)
    {
        console.log("Não Paga")
    }

    else if(salarioBase>=1903.99 && salarioBase<=2826.65)
    {
    i_rrf = ((salarioBase*0.075)-142.8)
    i_rrfRed = parseFloat(i_rrf.toFixed(2));
    if(i_rrfRed<=0){
        console.log("IRRF é: " + 0)
        }
    console.log("IRRF é: " + i_rrfRed)
    }

    else if(salarioBase>=2826.66 && salarioBase<=3751.05)
    {
    i_rrf = ((salarioBase*0.15)-354.80)
    i_rrfRed = parseFloat(i_rrf.toFixed(2));
    if(i_rrfRed<=0){
        console.log("IRRF é: " + 0)
        }
    console.log("IRRF é: " + i_rrfRed)
}

    else if(salarioBase>=3751.06 && salarioBase<=4664.68)
    {
        i_rrf = ((salarioBase*0.225)-636.13)
        i_rrfRed = parseFloat(i_rrf.toFixed(2));
        if(i_rrfRed<=0){
        console.log("IRRF é: " + 0)
        }
        console.log("IRRF é: " + i_rrfRed)
    }

    else 
    {
            i_rrf = ((salarioBase*0.275)-869.36)
            i_rrfRed = parseFloat(i_rrf.toFixed(2));
            if(i_rrfRed<=0){
                console.log("IRRF é: " + 0)
                }
            console.log("IRRF é: " + i_rrfRed)
        }








    