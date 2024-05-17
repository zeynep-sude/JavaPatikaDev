package java101.donguler;

import java.util.Scanner;

public class OTersUcgenYapma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Basamak SAYISINI giriniz: ");
		num = input.nextInt();
		
		for(int i=num;i>=1;i--) {
			for(int j=0;j<2*i-1;j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
