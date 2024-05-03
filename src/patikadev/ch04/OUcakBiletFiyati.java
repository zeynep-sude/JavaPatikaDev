package patikadev.ch04;
import java.util.Scanner;

public class OUcakBiletFiyati {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int km,age,type;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Mesafeyi km türünden giriniz:");
		km = input.nextInt();
		System.out.println("Yaşınızı giriniz :");
		age = input.nextInt();
		System.out.println("Yolculuk tipini giriniz (1 => Tek Yön , 2 => Gidiş Dönüş ):");
		type = input.nextInt();

		double discount=0,discountPrice = 0;
		
		if(km>0 && age>0 && (type ==1 || type==2)) {
			discountPrice= km * 0.10;
			if(age<12) {
				discount = discountPrice*0.50;
				discountPrice = discountPrice - discount;
				
				
			}else if(age>=12 && age<=24) {
				discount = discountPrice*0.10;
				discountPrice =discountPrice - discount;
				
			}else if(age>=65) {
				discount = discountPrice*0.30;
				discountPrice =discountPrice - discount;
				
			}
			if(type==2) {
				discount = discountPrice*0.20;
				discountPrice = (discountPrice-discount)*2;
				}
			
			
			System.out.println("Toplam Tutar: "+ discountPrice + " TL");
			
			
			
			
		}else {
			System.out.println("Hatalı Veri Girdiniz !");
		}
		
	}

}
