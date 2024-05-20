package java101.ekKonular;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class PSayiTahminOyunu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Random random = new Random();
		int number = random.nextInt(100);

		Scanner input = new Scanner(System.in);
		int forecast;
		int right = 0;
		int[] wrong = new int[5];
		boolean isWin = false;
		boolean isWrong = false;

		while (right < 5) {
			
			System.out.println("Lütfen bir sayı giriniz : ");
			forecast = input.nextInt();

			if (forecast < 0 || forecast > 100) {

				System.out.println("Lütfen 0 - 100 Arasında bir değer giriniz!!!");
				if(!isWrong) {
					isWrong = true;
					System.out.println("Bir daha hatalı girişinizde hakkınızdan düşülecektir.\n");
				}else {
					right++;
					System.out.println("Çok fazla hatalı giriş yaptınız. Kalan hak : " + (5 - right) + "\n");
				}
				continue;
			}

			if (number == forecast) {

				System.out.println("Tebrikler Doğru Tahmin :)");
				isWin = true;
				break;
			} else {
				System.out.println("Yanlış Tahmin!!!");

				if (forecast > number) {
					System.out.println("Tahmininiz Gizli Sayıdan Büyüktür");
				} else {
					System.out.println("Tahmininiz Gizli Sayıdan Küçüktür");
				}
				
				wrong[right] = forecast;
				right++;
				System.out.println("Kalan Hakkınız : " + (5 - right) +" \n");

			}

		}
		
		if(!isWin) {
			System.out.println("Oyunu Kaybettiniz");
			System.out.println("Gizli Sayı : " + number);
			System.out.println("Tahminleriniz : " + Arrays.toString(wrong));
		}
		

	}

}
