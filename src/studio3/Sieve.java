package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main (String[]args) {
		 Scanner in = new Scanner(System.in); 
			System.out.println ("give me n");
			int n = 0; in.nextInt();

			boolean[]boolArray = new boolean[n];
			for (int i = 2; i < boolArray.length; i++) {
				System.out.println();
				boolArray[i]=true; 
			}
			for (int i = 2; i < boolArray.length; i++) {
				for (int j = i * 2; j < boolArray.length; j = j + i) {
				boolArray [j] = false;
				}
	}
			for (int i = 2; i < boolArray.length; i++ ) {
				if (boolArray [i] == true) {
						System.out.println (i);
				}
	}
}
}