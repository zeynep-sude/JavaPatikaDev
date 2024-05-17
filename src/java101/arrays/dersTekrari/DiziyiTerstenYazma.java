package java101.arrays.dersTekrari;

public class DiziyiTerstenYazma {

	static void printArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	static int[] reverseArray(int[] array) {
		int[] reverse = new int[array.length];
		for(int i=0, j=array.length-1;i<array.length;i++,j--) {
			reverse[i] = array[j];
		}
		return reverse;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr1 = { 10, 20, 30, 40 };
		int[] newArray = reverseArray(arr1);
		printArray(newArray);

	}

}
