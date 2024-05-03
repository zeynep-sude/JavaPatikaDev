package patikadev.ch04;
import java.util.Scanner;

public class PHavaEtkinlik {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int degree;
		Scanner input = new Scanner(System.in); 
		System.out.println("Lütfen Sıcaklık Değerini Giriniz: ");
		degree = input.nextInt();
		
		if(degree < 5) {
			System.out.println("Bugün Kayak Yapabilirsiniz");
		}else if(degree >= 5 && degree <= 25) {
			if(degree >= 5 && degree <= 10) {
				System.out.println("Bugün Sinemeya Gidebilirsiniz");
			}else if(degree>=10 && degree <= 15) {
				System.out.println("Bugün Siemeya Gidebilirsiniz");
				System.out.println("Bugün Pikniğe Gidebilirsiniz");
			}else {
				System.out.println("Bugün Pikniğe Gidebilirsiniz");
			}
		}else {
			System.out.println("Bugün Yüzmeye Gidebilirsiniz");
		}
		

	}

}
