package patikadev.donguler;

import java.util.Scanner;

public class PTekSayilarinToplami {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Tek Sayıların Toplamı ");
		int num, sum1 = 0,sum2=0;
		Scanner input = new Scanner(System.in);

		do {
			System.out.println("Sayı Giriniz: ");
			num = input.nextInt();
			if (num % 2 == 1) {
				sum1 += num;

			}
		} while (num > 0);
		System.out.println("Toplam: " + sum1);
		System.out.println("-------------------------------------------");
		System.out.println("Ödev:Çift ve 4'ün katı olan sayıların toplamı ");
		
		do {
			System.out.println("Sayı Giriniz: ");
			num = input.nextInt();	
			
			if(num%2==0 && num%4==0) {
				sum2 += num;
			}
			
		}while(num%2==0);
		System.out.println("Toplam: " + sum2);

	}

}
