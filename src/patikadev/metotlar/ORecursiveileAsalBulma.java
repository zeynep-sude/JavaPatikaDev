package patikadev.metotlar;

import java.util.Scanner;

public class ORecursiveileAsalBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  Scanner scanner = new Scanner(System.in);
	        System.out.print("Bir sayı girin: ");
	        int sayi = scanner.nextInt();
	        scanner.close();

	        if (isAsal(sayi, 2)) {
	            System.out.println(sayi + " asal bir sayıdır.");
	        } else {
	            System.out.println(sayi + " asal bir sayı değildir.");
	        }

	}
	
	 public static boolean isAsal(int sayi, int bolen) {
	        // Sayının kendisine kadar olan sayılara kadar böldüğümüzde tam bölünmüyorsa asaldır.
	        if (sayi <= 2) {
	            return (sayi == 2) ? true : false;
	        }
	        if (sayi % bolen == 0) {
	            return false;
	        }
	        if (bolen * bolen > sayi) {
	            return true;
	        }
	        return isAsal(sayi, bolen + 1);
	    }
	}
	









