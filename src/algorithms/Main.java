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
		// recursiveMethod(4);
		/*
		 * int[] scores = new int[10]; scores = new int[3]; scores = new int[]{215, 234,
		 * 218, 189, 221, 290};
		 * 
		 * for (int score : scores) { System.out.print(score + "  "); }
		 */
	

		int num = 4;
		int mult = 1;
		if (num >= 1 && num <= 18) {
			for (int i = num; i > 0; i--) {
				mult *= i;

			}
		}
		System.out.println(mult);

		int a = 4;

		System.out.print((a >> 1) + (a << 2));

	}

}
