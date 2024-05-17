package java101.ch03;
import java.util.Scanner;

public class PNotOrtalama {
	
	public static void main(String[] args) {
	int matematik,fizik,kimya,turkce,tarih,muzik;
	
	Scanner input = new Scanner(System.in);
	
	System.out.println("Matematik Notunuzu Giriniz: ");
	matematik = input.nextInt();
	
	System.out.println("Fizik Notunuzu Giriniz: ");
	fizik = input.nextInt();
	
	System.out.println("Kimya Notunuzu Giriniz: ");
	kimya = input.nextInt();
	
	System.out.println("Türkçe Notunuzu Giriniz: ");
	turkce = input.nextInt();
	
	System.out.println("Tarih Notunuzu Giriniz: ");
	tarih= input.nextInt();
	
	System.out.println("Müzik Notunuzu Giriniz: ");
	muzik = input.nextInt();
	
	double ortalama = (matematik+fizik+kimya+turkce+tarih+muzik)/6;
	
	System.out.println("Dönem Ortalamanız: "+ ortalama);
	
	String durum = (ortalama>60)? "Sınıf Geçti" :"Sınıfta Kaldı";
	
	System.out.println(durum);
	
	}

}
