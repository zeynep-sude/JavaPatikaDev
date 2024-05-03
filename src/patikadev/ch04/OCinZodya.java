package patikadev.ch04;
import java.util.Scanner;

public class OCinZodya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int yearOfBirth,cinZodyak;
		String burc = null;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Doğum Yılınızı Giriniz");
		yearOfBirth = input.nextInt();
		cinZodyak = yearOfBirth%12;
		
		switch(cinZodyak) {
		case 0 -> burc = "Maymun";
		case 1 -> burc = "Horoz";
		case 2 -> burc = "Köpek";
		case 3 -> burc = "Domuz";
		case 4 -> burc = "Fare";
		case 5 -> burc = "Öküz";
		case 6 -> burc = "Kaplan";
		case 7 -> burc = "Tavşan";
		case 8 -> burc = "Ejderha";
		case 9 -> burc = "Yılan";
		case 10 -> burc = "At";
		case 11 -> burc = "Koyun";
		
		}
		System.out.println("Çin Zodyağı Burcunuz :" + burc);

	}

}
