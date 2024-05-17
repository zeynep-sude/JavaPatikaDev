package java101.ch04;
import java.util.Scanner;

public class PSayiSiralama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b,c;
		Scanner input = new Scanner(System.in);
		
		System.out.println("a Sayısını Giriniz: ");
		a =input.nextInt();
		
		System.out.println("b Sayısını Giriniz: ");
		b =input.nextInt();
		
		System.out.println("c Sayısını Giriniz: ");
		c =input.nextInt();
		
		if(a<b && a<c) {
			if(b<c) {
				System.out.println("a<b<c");
			}else {
				System.out.println("a<c<b");
			}
		}else if(b<a && b<c) {
			if(a<c) {
				System.out.println("b<a<c");
			}else {
				System.out.println("b<c<a");
			}
		}else {
			if(a<b) {
				System.out.println("c<a<b");
			}else {
				System.out.println("c<b<a");
			}
		}
	}

}
