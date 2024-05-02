package patikadev.ch04;
import java.util.Scanner;

public class PHesapMakinesi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int s1,s2,operator;
		Scanner input = new Scanner(System.in);
		System.out.println("İlk Sayıyı Giriniz: ");
		s1 = input.nextInt();
		System.out.println("İkinci Sayıyı Giriniz: ");
		s2 = input.nextInt();
		System.out.println("1)Toplama\n2)Çıkarma\n3)Çarpma\n4)Bölme");
		System.out.print("Yapmak İstediğiniz işlemi Seçiniz: ");
		operator = input.nextInt();
		
		
		switch(operator) {
		case 1-> System.out.println("Toplama: "+ (s1+s2));
		case 2 ->System.out.println("Çıkarma : "+(s1-s2));
		case 3 ->System.out.println("Çarpma: " + (s1*s2));
		case 4 ->System.out.println("Bölme: " + (s1/s2));
		default -> System.out.println("İşlem Bulunamadı!!");
		}
		
	}

}
