package Program;

import java.util.Locale;
import java.util.Scanner;

public class Product {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		System.out.print("Quantos numeros voce vai digitar? ");
		int n = sc.nextInt();
		
		int [][] mat = new int[n][n];
		
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < n; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal: ");
		for(int i=0; i<mat.length; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		int cont = 0;
		for(int i = 0; i < mat.length; i++) {
			for(int j = 0; j < n; j++) {
				if(mat[i][j] < 0) {
					cont++;
				}
			}
		}
		
		System.out.println();
		System.out.println("Negative numbers = " + cont);		
		
		sc.close();
	}

}
