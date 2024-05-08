package patikadev.donguler;

import java.util.Scanner;

public class OFibonacciSerisi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lütfen bir sayı giriniz: ");
		num = input.nextInt();
		
		int f1 =0,f2 =1,f3;
		
		for(int i=0;i<=num;i++) {
			f3 = f1 + f2;
			System.out.print(" " + f3);
			f1 = f2;
			f2 = f3;
		}
	}

}
