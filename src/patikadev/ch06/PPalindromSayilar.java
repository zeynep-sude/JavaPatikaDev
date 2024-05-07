package patikadev.ch06;

public class PPalindromSayilar {

	static boolean isPolindrom(int number) {
		int tempNumber = number,lastNumber,reverseNumber = 0;
		while(tempNumber != 0) {
			lastNumber = tempNumber %10;
			reverseNumber = (reverseNumber*10) + lastNumber;
			tempNumber /= 10;
			
		}
		if(reverseNumber == number) {
			return true;
		}else {
			return false;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean sayi1 = isPolindrom(456);
		System.out.println("Polindrom Sayı Mı? " + sayi1);

	}

}
