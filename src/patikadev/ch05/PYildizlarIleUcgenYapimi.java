package patikadev.ch05;

import java.util.Scanner;

public class PYildizlarIleUcgenYapimi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner klavye = new Scanner(System.in);
	        System.out.println("Bir Sayı Giriniz :");
	        int n = klavye.nextInt();

	        for (int i = 0; i < n ; i++) {
	            for (int j = 0; j < (n - i); j++) {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= (2 * i + 1); k++) {
	                System.out.print("*");
	            }
	            System.out.println(" ");
	            
	        }
	        for(int i=n; i>1;i--) {
	        	for(int j=0;j<(n-i)+2;j++) {
	        		System.out.print(" ");
	        	}
	        	 for (int k = 1; k <= (2 * i - 3); k++) {
		                System.out.print("*");
		            }
		            System.out.println(" ");
	        }
	        

	}

}
