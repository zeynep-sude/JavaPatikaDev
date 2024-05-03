package algorithms;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*System.out.print("Merhaba Dünya");
		byte b = 0;
		int a  = b++;
		int c=-12,d=-5;
		int e = c%d;
		System.out.print(e); 
		boolean a = true, b = false;
		System.out.println((a && b) || (a || b));
		
		int var1 = 5;
		int var2 = 6;
		if ((var2 = 1) == var1)
		    System.out.print(var2);
		else
		    System.out.print(++var2);*/
		int a = 20, b = 10;
		if ((a < b) && (b++ < 25)){
		    System.out.println(a);
		}else{
		    System.out.print(a);
		}
		System.out.println(b);
		int points=6;
		switch(points)
		{
		  case 6: ;
		  case 7: System.out.println("Java");break;
		  case 8: ;
		  case 9: System.out.println("101");break;
		  case 10: System.out.println("Patika"); break;
		  default: System.out.println("Dev");
		}


		

	}

}
