package patikadev.ch03;
import java.util.Scanner;

public class PTaksimetre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int km ;
		Scanner input = new Scanner(System.in);
		System.out.println("Kilometre Değerini Giriniz: ");
		km = input.nextInt();
		
		double acılısUcret = 10.0;
		double kmTutar = km*2.20,toplam;
		toplam = acılısUcret + kmTutar;
		double min = (toplam<20)? 20:toplam;
		System.out.println("Toplam Tutar: " + min);
		
		

	}

}
