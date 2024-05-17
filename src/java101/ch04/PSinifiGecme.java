package java101.ch04;
import java.util.Scanner;

public class PSinifiGecme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int matematik,fizik,turkce,kimya,muzik;
		int total  = 0, count = 0 ;
		double average;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Matematik Notunuzu Giriniz: ");
		matematik = input.nextInt();
		
		System.out.println("Fizik Notunuzu Giriniz: ");
		fizik = input.nextInt();
		
		System.out.println("Türkçe Notunuzu Giriniz: ");
		turkce = input.nextInt();
		
		System.out.println("Kimya Notunuzu Giriniz: ");
		kimya = input.nextInt();
		
		System.out.println("Müzik Notunuzu Giriniz: ");
		muzik = input.nextInt();
		
		if(matematik>=0 && matematik<=100) {
			total  +=  matematik;
			count++;
		}
		
		if(fizik>=0 && fizik<=100) {
			total  +=  fizik;
			count++;
		}
		
		if(turkce>=0 && turkce<=100) {
			total  +=  turkce;
			count++;
		}
		
		if(kimya>=0 && kimya<=100) {
			total  +=  kimya;
			count++;
		}
		
		if(muzik>=0 && muzik<=100) {
			total  +=  muzik;
			count++;
		}
		
		
		average = total/count;
		System.out.println(average);
		if(average>=55) {
			System.out.println("Sınıfı Geçtiniz");
		}else {
			System.out.println("Sınıfta Kaldınız");
		}

	}

}
