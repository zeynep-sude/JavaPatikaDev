package java101.ch04;
import java.util.Scanner;

public class OArtikYil {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Yıl Giriniz: ");
		year = input.nextInt();
		
		if(year%100==0 && year%400==0) {
			System.out.println(year + "  Bir artık yıldır!");
		}else if(year%100!=0 && year%4 == 0) {
			System.out.println(year + "  Bir artık yıldır!");
		}else {
			System.out.println(year + "  Bir artık yıl değildir!");
		}
		

	}

}
