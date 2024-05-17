package java101.ch03;
import java.util.Scanner;

public class PDaireAlanCevre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int r,a;
		double pi = 3.14;
		double alan,cevre,dilimAlan;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Yarıçap Giriniz: ");
		r = input.nextInt();
		System.out.println("a Açısını Giriniz: ");
		a = input.nextInt();
		
		cevre = 2 * Math.PI * r;
		alan = Math.PI * r * r;
		
		System.out.println("Dairenin Çevresi: " + cevre);
		System.out.println("Dairenin Alanı: " + alan);
		
		//Ödev: Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan program
		
		dilimAlan = (pi * (r * r) * a) / 360;
		System.out.println("Daire Diliminin Alanı: " + dilimAlan);
		
		

	}

}
