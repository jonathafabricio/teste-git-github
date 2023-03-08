package Program;

import java.util.Locale;
import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas linhas vai ter sua matriz? ");
		int m = sc.nextInt();
		System.out.print("Quantas colunas vai ter sua matriz? ");
		int n = sc.nextInt();
		
		int[][] mat = new int[m][n];
		
		for(int i=0; i<mat.length; i++) {
			for(int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.print("Qual numero você vai querer saber as posicoes? ");
		int x = sc.nextInt();
		
		for(int i=0; i<mat.length; i++) {     //n == mat.length;
			for(int j=0; j<mat[i].length; j++) { //m == mat[i].length;
				if(mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Left: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Right: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Down: " + mat[i+1][j]);
					}
				}
			}
		}
		
		
		
		
		
		
		
		sc.close();
	}

}
