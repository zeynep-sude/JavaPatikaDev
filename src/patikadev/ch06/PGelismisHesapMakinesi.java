package patikadev.ch06;

import java.util.Scanner;

public class PGelismisHesapMakinesi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int process;
		Scanner input = new Scanner(System.in);

		String menu = "1- Toplama İşlemi\r\n" + "2- Çıkarma İşlemi\r\n" + "3- Çarpma İşlemi\r\n" + "4- Bölme işlemi\r\n"
				+ "5- Üslü Sayı Hesaplama\r\n" + "6- Faktoriyel Hesaplama\r\n" + "7- Mod Alma\r\n"
				+ "8- Dikdörtgen Alan ve Çevre Hesabı";

		do {

			System.out.println("Yapmak İstdiğiniz işlemi Seçiniz :\n" + menu);
			process = input.nextInt();
			System.out.println("------------------------------------------------");
			switch(process) {
			case 1 ->plus();
			case 2 ->minus();
			case 3 ->multi();
			case 4 -> part();
			case 5 ->power();
			case 6 ->factoriel();
			case 7 ->mod();
			case 8 ->rectangle();
			
			}

		} while (process >= 1 && process <= 8);
		System.out.println("Böyle bir işlem bulunamamaktadır");

	}

	static void plus() {
		int counter, number, result = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Kaç Sayı ile işlem yacağınızı seçiniz :");
		counter = input.nextInt();

		for (int i = 1; i <= counter; i++) {
			System.out.print("sayı giriniz :");
			number = input.nextInt();
			System.out.println(i + ". Sayı: " + number);
			result += number;
		}
		System.out.println("Sonuç: " + result);
		System.out.println("------------------------------------------------");

	}
	
	static void minus() {
		int counter, number, result = 0;
		Scanner input = new Scanner(System.in);

		System.out.print("Kaç Sayı ile işlem yacağınızı seçiniz :");
		counter = input.nextInt();

		for (int i = 1; i <= counter; i++) {
			System.out.print("sayı giriniz :");
			number = input.nextInt();
			System.out.println(i + ". Sayı: " + number);
			if(i==1) {
				result += number;
				continue;
			}
			
			result -= number ;
		}
		System.out.println("Sonuç: " + result);
		System.out.println("------------------------------------------------");

		
	}
	
	
	static void multi() {
		int counter, number, result = 1;
		Scanner input = new Scanner(System.in);

		System.out.print("Kaç Sayı ile işlem yacağınızı seçiniz :");
		counter = input.nextInt();

		for (int i = 1; i <= counter; i++) {
			System.out.print("sayı giriniz :");
			number = input.nextInt();
			System.out.println(i + ". Sayı: " + number);
			
			result *= number ;
		}
		System.out.println("Sonuç: " + result);
		System.out.println("------------------------------------------------");
	}
	
	static void part() {
		int  number1,number2, result = 1;
		Scanner input = new Scanner(System.in);

		System.out.print("sayı giriniz :");
		number1 = input.nextInt();
		System.out.print("sayı giriniz :");
		number2 = input.nextInt();
		
		if(number1 ==0 ||number2==0) {
			System.out.println("İşlem tanımsız");
		}else {
			result = number1/number2;
		}
		
		System.out.println("Sonuç: " + result);
		System.out.println("------------------------------------------------");
	}
	
	static void power() {
		Scanner input = new Scanner(System.in);
		System.out.print("sayı giriniz :");
		int base =input.nextInt();
		System.out.print("sayı giriniz :");
		int exponent = input.nextInt();
		int result =1;
		for(int i=1;i<=exponent;i++) {
			result *=base;
		}
		System.out.println("Sonuç: " + result);
		System.out.println("------------------------------------------------");
	}
	
	static void factoriel() {
		Scanner input = new Scanner(System.in);
		System.out.print("sayı giriniz :");
		int number = input.nextInt();
		
		int result =1;
		
		for(int i=1;i<=number;i++) {
			result *=i;
		}
		System.out.println("Sonuç: " + result);
		System.out.println("------------------------------------------------");
	}
	
	static void mod() {
		Scanner input = new Scanner(System.in);
		System.out.print("sayı giriniz :");
		int num1 =input.nextInt();
		System.out.print("sayı giriniz :");
		int num2 = input.nextInt();
		
		int result = num1 % num2;
		System.out.println("Sonuç: " + result);
		System.out.println("------------------------------------------------");
	}
	
	static void rectangle() {
		Scanner input = new Scanner(System.in);
		System.out.print("Kenar değerini giriniz :");
		int edge1 =input.nextInt();
		System.out.print("Kenar değerini giriniz :");
		int edge2 = input.nextInt();
		
		int alan,cevre;
		alan = edge1 * edge2;
		cevre =(edge1 + edge2)*2;
		
		System.out.println("Alan: " + alan);
		System.out.println("Çevre: " + cevre);
		System.out.println("------------------------------------------------");
		
	}
	

}
