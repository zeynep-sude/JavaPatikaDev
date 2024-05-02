package patikadev.ch04;
import java.util.Scanner;

public class PKullaniciGiris {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String userName,password,newPassword,parolaSifirla;
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Kullanıcı Adını Giriniz: ");
		userName = input.nextLine();
		System.out.println("Şifrenizi Giriniz: ");
		password = input.nextLine();
		
		if(userName.equals("zsk")) {
			if(password.equals("Java101")) {
				System.out.println("Giriş Başarılı");
			}else {
				System.out.println("Şifre yanlış!Sıfırlansın mı ?");
				parolaSifirla = input.nextLine();
				if(parolaSifirla.equals("evet")) {
					System.out.println("Yeni Şifre Giriniz: ");
					newPassword = input.nextLine();
					if(newPassword.equals("Java101")) {
						System.out.println("Eski şifrenizi kullanamazsınız!! ");
						System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz.");
						newPassword = input.nextLine();
					}
					System.out.println("Yeni Şifreniz oluşturuldu");
					
				}
			}
		}else {
			System.out.println("Bilgileriniz  Yanlış!! Tekrar Deneyin.");
		}
		

	}

}
