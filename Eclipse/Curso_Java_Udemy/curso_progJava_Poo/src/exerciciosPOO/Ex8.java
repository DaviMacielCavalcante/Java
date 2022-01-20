package exerciciosPOO;

import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Integer n = sc.nextInt();
		Integer m = sc.nextInt();
		Integer[][] mat = new Integer[n][m];
		
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		int x = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				System.out.print(mat[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if ( x == mat[i][j]) {
					System.out.println("Position: " + i + "," + j);
					if (j > 0) {
						System.out.println("Left: "+ mat[i][j - 1]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Right: " + mat[i][j + 1]);
					}					 
					if (i < mat.length - 1) {
						System.out.println("Down: " + mat[i + 1][j]);
					}
					if ( i > 0) {
						System.out.println("Up: " + mat[i-1][j]);
					}					
				}
			}
			System.out.println();
		}
		
		
		
		sc.close();
	}

}
