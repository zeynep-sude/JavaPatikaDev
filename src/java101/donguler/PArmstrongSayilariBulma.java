package java101.donguler;

import java.util.Scanner;

public class PArmstrongSayilariBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num, numCounter = 0, stepValue, result = 0, stepPow = 1,stepTotal =0;
		Scanner input = new Scanner(System.in);

		System.out.println("Sayıyı Giriniz:");
		num = input.nextInt();
		int tempNumber = num;

		while (tempNumber != 0) {
			tempNumber /= 10;
			numCounter++;

		}
		//System.out.println("Basamak Sayısı: " + numCounter);
		tempNumber = num;
		while (tempNumber != 0) {
			stepValue = tempNumber % 10;
            stepTotal += stepValue;
			//System.out.println(stepValue);
			stepPow = 1;
			for (int i = 1; i <= numCounter; i++) {
				stepPow *= stepValue;
			}
			result += stepPow;
			tempNumber /= 10;

		}
		

		if (num == result) {
			System.out.println(num + " Sayısı Armstrong Bir Sayıdır");
		}else {
			System.out.println(num + " Sayısı Armstrong Bir Sayı Değildir");
		}
		System.out.println("--------------ÖDEV---------------");
		System.out.println("Basamak Sayılarının Toplamı: " + stepTotal);

	}

}
