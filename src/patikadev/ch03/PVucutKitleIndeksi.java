package patikadev.ch03;
import java.util.Scanner;

public class PVucutKitleIndeksi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double kilo,boy,indeks;
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen boy ölçünüzü giriniz(metre cinsinden): ");
		boy = input.nextDouble();
		System.out.println("Lütfen kilonuzu giriniz: ");
		kilo = input.nextDouble();
		
		indeks = kilo / (boy * boy);
		
		System.out.println("Vücut Kitle İndeksiniz: " + indeks);
		
		

	}

}
