package patikadev.ch05;

import java.util.Scanner;

public class PIkininKuvvetleri {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lütfen Bir Sayı Giriniz: ");
		num = input.nextInt();
		
		for(int i = 1 ;i<=num;i*=2) {
			
			System.out.println(i);
			
		}
		System.out.println("---------------2------------------");
		
        for(int i = 1 ;i<=num;i*=4) {
			
			System.out.println(i);
			
		}
        System.out.println("------------------4---------------");
		
      for(int i = 1 ;i<=num;i*=5) {
			
			System.out.println(i);
			
		}
      System.out.println("---------5----------------");
	}

}
