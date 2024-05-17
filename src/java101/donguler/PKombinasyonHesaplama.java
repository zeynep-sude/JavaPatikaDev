package java101.donguler;

import java.util.Scanner;

public class PKombinasyonHesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,r,faktoriyel=1,faktoriyelR=1,faktoriyelF=1;
		double kombinasyon;
		Scanner input =new Scanner(System.in);
		
		System.out.println("Sayı Giriniz: ");
		num = input.nextInt();
		
		System.out.println("Sayı Giriniz: ");
		r = input.nextInt();
		
		for(int i=1;i<=num;i++) {
			faktoriyel *= i;
		}
		System.out.println("Sonuç: " + faktoriyel);
		
		for(int i=1;i<=r;i++) {
			faktoriyelR *= i;
		}
		System.out.println("Sonuç: " + faktoriyelR);
		
		for(int i=(num-r);i>=1;i--) {
			faktoriyelF *= i;
		}
		System.out.println("Sonuç: " + faktoriyelF);
		
		kombinasyon = faktoriyel/(faktoriyelR*faktoriyelF);
		
		System.out.println("Kombinasyon Sonucu: " + kombinasyon);
		

	}

}
