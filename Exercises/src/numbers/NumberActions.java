package numbers;

import java.util.Scanner;

public class NumberActions {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner entry = new Scanner (System.in);
		int cont = 0;
		int op;
		int[] vet = new int[10];
		
		for (int i = 0; i < 10 ; i++){
			System.out.println("Please type a number");
			vet[i] = entry.nextInt();
	
			cont++;		
		}
		
		System.out.println("regular order");
		for (int i = 0; i < 10 ; i++){
				System.out.println(vet[i]);
		}
		
		System.out.println("reverse order");
		for (int i = 9; i >= 0 ; i--){
			System.out.println(vet[i]);
		}
	} 
}