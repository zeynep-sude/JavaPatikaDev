package patikadev.arrays.odevler;

import java.util.Arrays;

public class OMatrisTranspozunuBulma {
	
	static void matrisTranspoz(int[][] array) {
		
		int row,colm;
		row=array.length;
		colm = array[0].length;
		
		int[][] transpoz = new int[colm][row];
		
		System.out.println("Matris: ");
		for(int i=0;i<row;i++) { 
			
			for(int j=0;j<colm;j++) {
				
				transpoz[j][i] = array[i][j];
				System.out.print(array[i][j] +" ");	
				
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("Transpoz: ");
		for(int i=0;i<colm;i++) {
			for(int j=0;j<row;j++) {
				System.out.print(transpoz[i][j] +" ");
			
				
			}
			System.out.println();
		}
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = {{1,2,3},
		             {4,5,6}};
		int[][] b={{2,3,4},
	             {5,6,4}};
		
		//matrisTranspoz(a);
		matrisTranspoz(b);
		
		
	}

}
