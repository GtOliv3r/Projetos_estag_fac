package tratamentoDeErros;

import java.util.*;

public class ExercicioErrorTester {
public static void main(String[] args) {	
		
		int [] senhas = {1,2,3,4,5};
		int i = 0;
		Scanner in = new Scanner(System.in);
		System.out.println("Digite a senha que gostaria de ter acesso (1-4, 5 reservado para ADM): ");

		do {		
		try {
			
			System.out.println("Informe a posição da senha que deseja mostrar: ");		
			i = in.nextInt();
			if(i>=4 && i<=6) {
				throw new Exception();
			}
			System.out.println(senhas[i]);
		}
		catch(InputMismatchException e){
			in.nextLine();	//LIMPA O CACHE		
			System.out.println("Entrada invalida, tente novamente.");
			//java.util.InputMismatchException
		}
		catch(ArrayIndexOutOfBoundsException e){
			in.nextLine();	//LIMPA O CACHE		
			System.out.println("Senha inexistente, tente novamente.");
			//java.lang.ArrayIndexOutOfBoundsException
		}
		catch(Exception e) {
			System.out.println("Senha restrita!");   
		}
		}while(i>=0);
		
		
		
		
		
		
}
}
