package patikadev.ch05;

import java.util.Scanner;

public class OHackerRank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lütfen bir sayı giriniz: ");
		num = input.nextInt();
		
		int result =1;
		if(num>=2 && num<=20) {
			for(int i=1;i<=10;i++) {
				result = num*i;
				System.out.println(num +"x" +i+"="+result);
			}
		}

	}

}
