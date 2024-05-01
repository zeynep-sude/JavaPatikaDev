package patikadev.ch03;
import java.util.Scanner;

public class PKDVTutar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double fiyat,kdv1=0.18,kdv2=0.08 ,kdvOran,tutar;
		Scanner input = new Scanner(System.in);
		System.out.println("Fiyatı Giriniz: ");
		fiyat = input.nextDouble();
	    kdvOran = (0<fiyat && fiyat<1000)? fiyat*kdv1:fiyat*kdv2;
		//kdvOran = fiyat*kdv1;
		tutar = fiyat + kdvOran;
		
		System.out.println("KDV'siz Fiyat: " + fiyat);
		//System.out.println("KDV: " + kdv);
		System.out.println("KDV'li Fiyat: " + tutar);
		System.out.println("KDV Oranı: " + kdvOran);
		
		
		

	}

}
