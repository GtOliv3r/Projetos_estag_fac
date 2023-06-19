package exercicio;

//Escreva um programa que preencha uma matriz 4x4 
//com números inteiros e exiba a soma dos elementos
//de cada linha da matriz.


public class Exercicio9 {

	
	public static void main(String[] args) {
		int [][] matriz = {{2,3,5,8},
						   {8,2,4,6},
						   {13,6,7,1},
						   {1,5,2,7}};
		int aux = 0;
		
		
		for(int linha = 0;linha<matriz.length;linha++) {
			aux=0;
			for(int coluna = 0;coluna<matriz[linha].length;coluna++) {
				aux += matriz[linha][coluna];	
			}
			System.out.println(aux);
		}
		

	
}
}