package patikadev.donguler;

import java.util.Scanner;

public class OMukemmelSayi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num,total = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Bir sayı giriniz: ");
		num = input.nextInt();
		
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				total += i;
			}
		}
		//System.out.print(total);
		if(num == total) {
			System.out.print(num + " Mükemmel Sayıdır");
		}else {
			System.out.print(num + " Mükemmel Sayı Değildir");
		}
	}

}
