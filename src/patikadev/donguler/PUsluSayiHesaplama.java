package patikadev.donguler;

import java.util.Scanner;

public class PUsluSayiHesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,us,result=1;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Üssü Alınacak Sayıyı Giriniz:");
		num = input.nextInt();
		
		System.out.println("Sayı Giriniz:");
		us = input.nextInt();
		
		for(int i=1;i<=us;i++) {
			result *= num;
		}
		System.out.println("Sonuç: " + result);

	}

}
