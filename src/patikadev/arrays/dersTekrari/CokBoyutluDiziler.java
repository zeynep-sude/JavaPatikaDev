package patikadev.arrays.dersTekrari;

public class CokBoyutluDiziler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*1 2 3 4 
		 *5 6 7 8
		 *9 10 11 12*/
		
		int[][] array = new int[3][4];
		System.out.println("Satır Sayısı: " + array.length);
		System.out.println("Sütun Sayısı: " + array[0].length);
		
		int number=1;
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++) {
				array[i][j] = number++;
			}
		}
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<array[0].length;j++) {
				System.out.print(array[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("==========ForEach Kullanarak Yazdırma==========");
		
		for(int[] row:array) {
			for(int col: row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}

	}

}
