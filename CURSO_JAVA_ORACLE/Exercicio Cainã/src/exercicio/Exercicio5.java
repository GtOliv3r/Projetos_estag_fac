package exercicio;

public class Exercicio5 {

	public static void main(String[] args) {
		int [][] matriz = {{1,2,3},{4,5,6},{7,8,9}};
		int j = matriz.length-1;
		for (int i = 0 ;i<matriz.length;i++) {
			System.out.println(matriz [i][j]);
			j--;
		}

	}

	
}


