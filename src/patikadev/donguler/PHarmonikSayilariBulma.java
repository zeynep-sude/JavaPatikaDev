package patikadev.donguler;

import java.util.Scanner;

public class PHarmonikSayilariBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		double result = 0.0;
		Scanner input = new Scanner(System.in);

		System.out.println("Sayıyı Giriniz:");
		num = input.nextInt();
		
		for(double i=1;i<=num;i++) {
			result += (1/i);
		}
		System.out.println("Sonuç: " + result);

	}

}
