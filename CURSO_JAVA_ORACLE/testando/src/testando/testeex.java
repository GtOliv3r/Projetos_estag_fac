package testando;

public class testeex {

	public static void main(String[] args) {
		
		int [] arr = {5, 4, 2, 1, 0};
		for (int i = 1; i < arr.length; i++)
		{
		arr[i - 1] += arr[i];
		System.out.println(arr[i]);
		}

}
}


