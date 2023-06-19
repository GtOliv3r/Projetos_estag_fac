package exercicio;

//Escreva um programa que preencha uma matriz 5x5 com 
//números inteiros e exiba a média dos elementos da diagonal
//principal da matriz.


public class Exercicio8 {

	
	public static void main(String[] args) {
		int [][] matriz = {{2,3,5,8,12},
						   {8,20,4,6,24},
						   {13,6,7,1,72},
						   {13,8,9,41,15},
						   {3,4,9,21,2}};
		float media = 0;
		
		for(int linha = 0;linha<matriz.length;linha++) {
			for(int coluna = 0;coluna<1;coluna++) {
				System.out.println(matriz[linha][linha]);
				media += matriz[linha][linha];
			}
			
		}
		media = media/matriz.length;
		System.out.println();
		System.out.println(media);

	
}
}