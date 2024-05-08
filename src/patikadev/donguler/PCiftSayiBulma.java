package patikadev.donguler;

import java.util.Scanner;

public class PCiftSayiBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num, count = 0, sum = 0;
		double average=0;
		Scanner input = new Scanner(System.in);

		System.out.println("Lütfen Bir Sayı Giriniz: ");
		num = input.nextInt();

		for (int i = 0; i <= num; i++) {

			/*
			 * if (i % 2 == 0) { Çift Sayı Bulma System.out.print(i + ","); }
			 */
			// Ödev 3 ve 4'e tam bölünen sayıların ortalaması
			if (i % 3 == 0 && i % 4 == 0) {
				if (i != 0) {
					sum += i;
					count++;
					}
				}
			}
		average = sum / count;
		System.out.println(sum);
		System.out.println(count);
		System.out.println(average);

	}

}
