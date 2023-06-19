package estoqueCaina;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ProdutoTesterCaina {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
	
		int tempIdProduto = 0;
		String tempNome = " ";
		double tempPreco = 0.0;
		int tempQuantidade = 0;
		int maxSize = -1;	
		
		
		
		
		
		
		do{
			try {
				System.out.println("\n Insira o número de produtos que gostaria de adicionar:");
				System.out.println("(insira 0 (zero) se não quiser adicionar produtos)");
				maxSize = in.nextInt();
				if(maxSize<0) { //Tratando valores negativos, chama o catch (Exception e)
					throw new Exception();
				}
			}
			
			catch(InputMismatchException e) {
				in.nextLine();
				System.err.println("Tipo incorreto de dado inserido");
			}
			
			catch(Exception e){
				in.nextLine();
				System.err.println("O numéro de produtos não pode ser negativo");
			}
			
			
		}while(maxSize<0);
		
		if(maxSize == 0) {
			System.err.println("Não há produtos!");
		}
		
		else {
		
		ProdutoCaina [] produtos = new ProdutoCaina[maxSize]; 
		
		
		//Criando e definindo atributos para 6 objetos
		for(int i = 0; i<maxSize; i++) {
			tempIdProduto = 0;
			tempNome = " ";
			tempPreco = 0.0;
			tempQuantidade = 0;

			try {
			System.out.println("\n*Estoque do livro " + (i+1) );
			System.out.println("Digite o Id do livro " + (i+1) + " :" );
			tempIdProduto = in.nextInt();
			in.nextLine();
			System.out.println("Digite o nome do livro " + (i+1) + " :" );
			tempNome = in.nextLine();
			System.out.println("Digite o preço do livro " + (i+1) + " :" );
			tempPreco = in.nextDouble();
			System.out.println("Digite a quantidade de livros "+ (i+1) + " :" );
			tempQuantidade = in.nextInt();
			}
			catch(Exception e) {
				System.err.println("Tipo incorreto de dado inserido");
			}
			
			produtos[i] = new ProdutoCaina (tempIdProduto, tempNome, tempPreco, tempQuantidade);
			
		}
		in.close();
		
		//Exibindo os 6 objetos
		System.out.println("%Estoque:\n");
		for(ProdutoCaina p: produtos) {
			System.out.println(p);
		}
	
		}
	}
}
