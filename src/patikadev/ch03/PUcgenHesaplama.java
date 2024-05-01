package patikadev.ch03;
import java.util.Scanner;

public class PUcgenHesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* Hipotenüs Değeri Hesaplama
		int a,b ;
		double c ;
		Scanner input = new Scanner(System.in);
		System.out.println("Kenarları Giriniz: ");
		a = input.nextInt();
		b = input.nextInt();
		
		c = Math.sqrt((a*a) + (b*b));
		System.out.print("Hipotenüs Değeri : " + c);
		*/
		
		//Üçgen çevre - alan hesabı
		int a,b,c;
		double cevre, alan,u;
		Scanner input = new Scanner(System.in);
		System.out.println("Kenarları Giriniz: ");
		a = input.nextInt();
		b = input.nextInt();
		c = input.nextInt();
		
		cevre = a + b + c;
		u = cevre/2;
		
		alan =Math.sqrt(u*(u-a)*(u-b)*(u-c)) ;
		
		System.out.println("Çevre: " + cevre);
		System.out.println("Alan: " + alan);
		
		
		
	}

}
