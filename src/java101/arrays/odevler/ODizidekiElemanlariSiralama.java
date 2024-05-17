package java101.arrays.odevler;

import java.util.Arrays;
import java.util.Scanner;

public class ODizidekiElemanlariSiralama {
	static void sorting(int[]arr) {
		int value;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if((i!=j) && arr[i]<arr[j]) {
					value = arr[i];
					arr[i] =arr[j];
					arr[j]=value;
					
				}
			}
			
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num;
		Scanner input  =new Scanner(System.in);
		
		System.out.println("Dizinin boyutu n : " );
		num = input.nextInt();
		
		System.out.println("Dizinin elemanlarını giriniz :");
		int[] array = new int[num];
		for(int i =0;i<num;i++) {
			array[i] = input.nextInt();
			System.out.println((i+1) + ".Elamanı : " + array[i]);
		}
		System.out.println("Dizi :" + Arrays.toString(array));
		System.out.println("Uzun Yöntem Sıralama Sonucu : ");
		sorting(array);
		System.out.println("Kısa Yöntem Sıralama Sonucu : ");
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		
		
		
	}

}
