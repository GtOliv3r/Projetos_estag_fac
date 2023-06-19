package exercicio;
import java.util.Random;

//Escreva um programa que preencha uma matriz 
//3x3 com números inteiros e exiba o maior número
//encontrado na matriz.

public class Exercicio7 {
	
	public static void main(String[] args) {
		int [][] matriz = {{2,3,5},
						   {8,2,4},
						   {13,6,7}};
		int aux = matriz[0][0];
		
		
		for(int linha = 0;linha<matriz.length;linha++) {
			for(int coluna = 0;coluna<matriz[linha].length;coluna++) {
				if(matriz[linha][coluna]>aux)
				aux = matriz[linha][coluna];
			}
		}
		System.out.println(aux);

	}
}
