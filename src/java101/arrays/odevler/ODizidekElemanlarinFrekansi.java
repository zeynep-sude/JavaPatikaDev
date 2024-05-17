package java101.arrays.odevler;

import java.util.Arrays;

public class ODizidekElemanlarinFrekansi {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array  = {10,20,20,10,10,20,5,20};
		int length =array.length;
		boolean[] checked = new boolean[length];
		
		Arrays.fill(checked,false);
		
		for(int i=0;i<length;i++) {
			
			if(checked[i]==true) {
				continue;
			}
			int count =1;
			for(int j=i+1;j<length;j++) {
				if(array[i]==array[j]) {
					checked[j]=true;
					count++;
				}
			}
			if (count >= 1) {
                System.out.println(array[i] + " sayısı " + count+" kere tekrar edildi. ");
            }
		}
 	}

}
