package patikadev.arrays;

public class PHarmonikOrtalamaHesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr1 = new int[] {1,2,3,4,5};
		double sum =0,average;
		for(int i=0;i<arr1.length;i++) {
			sum +=arr1[i];
		}
		average = sum /arr1.length;
		System.out.println("Dizideki Elemanların Ortalaması : " + average);
		
		double sum1 =0,harmonik;
		for(int i=0;i<arr1.length;i++) {
			sum1 += 1/arr1[i];
		}
		harmonik = arr1.length/sum1;
		System.out.println("Dizideki Elemanların Harmonik Ortalaması : " + harmonik);
		
		
	}

}
