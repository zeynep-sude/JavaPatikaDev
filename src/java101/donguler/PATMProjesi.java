package java101.donguler;

import java.util.Scanner;

public class PATMProjesi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName,password;
		int rightTry = 3,select,balance = 1500;
		Scanner input = new Scanner(System.in);
	
		
		while(rightTry>0) {
			System.out.println("Kullanıcı Adınızı Giriniz: ");
			userName = input.nextLine();
			System.out.println("Şifrenizi Giriniz: ");
			password = input.nextLine();
			
			if(userName.equals("zsk") && password.equals("1234")) {
				System.out.println("Java Bankamatiğe  Hoşgeldiniz");
				
				do {
                    System.out.println("1-Para yatırma\n" +
                            "2-Para Çekme\n" +
                            "3-Bakiye Sorgula\n" +
                            "4-Çıkış Yap");
                    System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz : ");
                    select = input.nextInt();
                    
                    switch(select) {
                    
                    case 1 ->
                    {System.out.print("Para miktarı : ");
                    int price = input.nextInt();
                    balance += price;
                    System.out.println("Bakiyeniz : "+ balance);}
                    
                    case 2 -> 
                    {System.out.print("Para miktarı : ");
                    int price = input.nextInt();
                    if (price > balance) {
                        System.out.println("Bakiye yetersiz.");
                    } else {
                        balance -= price;
                        System.out.println("Bakiyeniz : "+ balance);
                    }}
                    
                    case 3-> System.out.println("Bakiyeniz : " + balance);
                    
                             
                    }
				}while(select!=4);
				System.out.println("Tekrar görüşmek üzere.");
                break;
				
			}else {
				rightTry--;
				System.out.println("Kullanı adı veya şifre yanlış. Tekrar Deneyiniz");
				switch(rightTry) {
				case 0 -> System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz");
				case 2,1 -> System.out.println("Kalan Hakkınız: " + rightTry);
				}
			}
			
		}
		
		

	}

}
