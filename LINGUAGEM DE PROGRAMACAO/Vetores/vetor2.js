//Ordenar o vetor em ordem crescente sem usar.sort
var n1 = [10,6,1,7,9,4,1]
var aux = 0

for(var i=0;i<2;i++){
    if(n[i]>n[i+1]){
        while(n[i]>n[i+1]){
aux = n1[i+1]
n1[i+1] = n[i]
n[i] = aux
        }
    }
    
}


//