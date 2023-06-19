package exercicio;

public class Exercicio6 {
	
	public static void main(String[] args) {
		int [][] matriz = {{1,2,3},
						   {4,5,6},
						   {7,8,9}};
		
		
		for(int coluna = 0; coluna<matriz[0].length;coluna++) {
			for(int linha=matriz.length-1;linha>=0;linha--) {
				System.out.println(matriz [linha][coluna]);
			}
		}

	}

	
}

//1,2,3 
//4,5,6 MATRIZ ORIGINAL
//7,8,9


//7,4,1
//8,5,2 EXIBIR DESSA MANEIRA, COMO SE ELA TIVESSE GIRADO 90º horário
//9,6,3
	

