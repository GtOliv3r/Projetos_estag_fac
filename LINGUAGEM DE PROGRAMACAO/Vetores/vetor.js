let n1 = [4,1,5,9]
// n1 = [9,5,1,4,3]
let aux


for(let i=0;i<n1.length/2;i++){
    aux = n1[n1.length-1-i]
    n1[n1.length-1-i] = n1[i]
    n1[i] = aux
}


//ada  lovelace

//grace hopper
//carol shaw




console.log(n1)
