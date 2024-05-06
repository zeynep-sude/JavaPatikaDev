package patikadev.ch05;

import java.util.Scanner;

public class PEbobEkok {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2;
		int ebob = 0 ,ekok;
		Scanner input = new Scanner(System.in);

		System.out.println("Sayı Giriniz: ");
		num1 = input.nextInt();
		
		System.out.println("Sayı Giriniz: ");
		num2 = input.nextInt();
		
		if(num2>num1) {
			int x = num1;
			while(x>=1) {
				if(num1%x==0 && num2%x==0) {
					ebob = x;
					System.out.println("EBOB Değerimiz: " + ebob);
					break;
				}
				x--;
			}
		}else {
			int x = num2;
			while(x>=1) {
				if(num1%x==0 && num2%x==0) {
					ebob = x;
					System.out.println("EBOB Değerimiz: " + ebob);
					break;
				}
				x--;
			}
		}
		ekok = (num1*num2)/ebob;
		System.out.println("EKOK Değerimiz: " + ekok);


		
		
	}

}
