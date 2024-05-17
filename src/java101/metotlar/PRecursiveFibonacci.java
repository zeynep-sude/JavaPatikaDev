package java101.metotlar;

public class PRecursiveFibonacci {
	
	static int fibonacci(int n) {
		if(n==1 || n==2) {
			return 1;
		}
	
		
		return fibonacci(n-1) + fibonacci(n-2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int fibo1  = fibonacci(6);
		System.out.println(fibo1);
		

	}

}
