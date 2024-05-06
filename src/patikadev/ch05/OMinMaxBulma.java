package patikadev.ch05;

import java.util.Scanner;

public class OMinMaxBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,num,i=1,max=0,min =0;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kaç tane sayı gireceksiniz:");
		n = input.nextInt();
		
		while(n>0) {
			System.out.println(i + ". Sayıyı Giriniz:");
			num = input.nextInt();
			if(i==1) {
				max =num;
				min=num;
			}
			if(num>max) {
				max = num;
			}
			
			if(num<min) {
				min = num;
			}
			i++;
			n--;	
		}
		System.out.println("En Büyük Sayı: " + max);
		System.out.println("En Küçük Sayı: " + min);
		
	}
	

}
