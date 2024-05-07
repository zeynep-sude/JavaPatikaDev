package patikadev.ch06;

import java.util.Scanner;

public class ORecursiveileUsHesaplama {
	
	static int power(int base,int exponent) {
		if(exponent!=0) {
			return base * power(base,exponent-1);
		}else {
			return 1;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int base ,exponent;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Taban değeri giriniz :");
		base = input.nextInt();
		System.out.println("Üs değeri giriniz :");
		exponent = input.nextInt();
		
		System.out.println("Sonuç: " + power(base,exponent));	
		
		

	}

}
