package algorithms;

public class Main {
	
	  static void recursiveMethod(int num) {
	        num--;
	        if (num == 0)
	            return;
	        System.out.print(num + ",");
	        recursiveMethod(num);
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		recursiveMethod(4);
		


		

	}

}
