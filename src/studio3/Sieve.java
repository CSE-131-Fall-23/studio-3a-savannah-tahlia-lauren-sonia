package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);

		System.out.println("What is your maximum?");
		int n = in.nextInt();
		int [] list = new int [n];
		for (int i = 0; i<n; i++) {
			list[i] = i+2;
		}
		for (int p=0; p<n; p++) {
			for (int d=2; d<n; d++) {
				if (list[p] % d == 0 && (list[p] != d)) {
					list[p]=0;
				}
			}
		}

		for( int z=0; z<n; z++) {
			if (list[z] != 0 && list[z] <= n) {
				System.out.println(list[z]);
			}
		}
	}
}


