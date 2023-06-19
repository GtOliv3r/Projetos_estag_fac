package tratamentoDeErros;

import java.util.Scanner;
import java.util.*;

public class ErrorTester {

	public static void main(String[] args) {
		
		// Erros de Sintaxe
		
		// chamando variavel pelo nome es
		// int [] matriz = {1,2,3};
		//System.out.println(matiz);
		
		
		/* atribuindo valores do tipo errado para variavel
		int i ="Erro";
		
		if(5==i) {
	}
	*/
		
		/* Erros de Lógica
		
		// Loop Infinito
		 
		 
		 While(i<100){
		 i--
		 }
		 */
		
		//Loop Infinito 2
		
		/* 
		 int = 5;
		 while(i<100)
		 i++;
		 */

		//Logica incorreta
		/*
		int i = 5;
		for (;i<100;i++);
			i++;
		
		System.out.println(i);*/
		
	//Erros de Exceçoes
		
		//Indice fora do range
		//de indices do meu vetor, 
		//meu vetor vai até a posição 2
		
		/*int [] i = {1,2,3};
		System.out.println(i[3]);*/
		
		//
		
		
		int valor=0;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite um numero INTEIRO: ");

				
		try {
			valor = in.nextInt();
		}
		catch(InputMismatchException e) {
			System.out.println("Voce digitou errado fio!");
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.out.println(valor);
}
	}
