package patikadev.ch03;
import java.util.Scanner;

public class PManavKasa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int armut , elma ,domates,muz ,patlıcan;
		double toplam;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Armut Kaç Kilo: ");
		armut = input.nextInt();
		System.out.print("elma Kaç Kilo: ");
		elma = input.nextInt();
		System.out.print("domates Kaç Kilo: ");
		domates = input.nextInt();
		System.out.print("muz Kaç Kilo: ");
		muz = input.nextInt();
		System.out.print("patlıcan Kaç Kilo: ");
		patlıcan = input.nextInt();
		
		toplam = (armut * 2.14) + (elma * 3.67) + (domates * 1.11 )+ (muz * 0.95) + (patlıcan * 5.0) ;
		
		System.out.println("Toplam Tutar: " + toplam);

	}

}
