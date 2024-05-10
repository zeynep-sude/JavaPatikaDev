package patikadev.arrays;

import java.util.Arrays;

public class PDizideMaxMinBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = { 4, 8, -6, 1, 6, 15, 45 };

		int max = arr[0];
		int min = arr[0];
		int sayi = 8;
		int enYakinKucuk;
		int enYakinBuyuk;

		for (int i : arr) {
			if (i > max) {
				max = i;
			}
			if (i < min) {
				min = i;
			}
			
		}
		enYakinBuyuk = max;
		enYakinKucuk  =min;
		for(int i:arr) {
			if(i<sayi) {
				if(enYakinKucuk<i) {
					enYakinKucuk=i;
				}
			}
			if(i>sayi) {
				if(enYakinBuyuk>i) {
					enYakinBuyuk = i;
				}
			}
		}
		System.out.print("Dizi: " + Arrays.toString(arr) + "\n");
		System.out.println("Girilen Sayı : " + sayi);
		System.out.println("Girilen sayıdan küçük en yakın sayı : " + enYakinKucuk);
		System.out.println("Girilen sayıdan büyük en yakın sayı :" + enYakinBuyuk);
		System.out.println();
		System.out.println("Dizideki Minimum Değer : " + min);
		System.out.println("Dizideki Maksimum Değer : " + max);

		System.out.println("=====Array Sınıf ve Metotları====");
		int[] arr1 = { 4, 8, -6, 1, 6, 15, 45 };
		Arrays.sort(arr1);
		System.out.println(Arrays.toString(arr1));
		System.out.println("Dizideki Minimum Değer : " + arr1[0]);
		System.out.println("Dizideki Maksimum Değer : " + arr1[6]);

	}

}
