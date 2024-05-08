package patikadev.ch06;

public class ODeseneGoreMetoTOlusturma {
	
	static int desen(int n) {
		//System.out.print(n);
		int result = n;
		System.out.print(result + " ");
		result = result -5;
		int count = (result>0)? desen(result):result;
		System.out.print(result + " ");
		count=(result<=0 && result!=n)? result+5:result;
		return n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n =5;
		System.out.print(desen(n));
		
		/*result=n;
		while(n>=0) {
			System.out.print(n+" ");
			n=n-5;
		}
		//System.out.print(n);
		while(result!=n) {
			System.out.print(n+" ");
			n=n+5;
			
		}
		System.out.print(n);
		
		System.out.println();*/
		
	
	}

}
