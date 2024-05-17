package java101.arrays;

import java.util.Arrays;

public class PTekrarEdenCiftElemanlar {
	static boolean isFind(int[] arr,int value) {
		for(int i:arr) {
			if(i==value) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,1,5,1,1,9,8,7,5,3,4,4,9,7,8,6,8};
		int[] duplicate = new int[arr.length];
		int starIndex = 0;
		
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				if((i!=j)&& (arr[i]==arr[j])&&(arr[i]%2==0)) {
					
					if(!isFind(duplicate,arr[i])) {
						duplicate[starIndex++] = arr[i];
						
					}
					break;
					
				}
			}
		}
		for(int i:duplicate) {
			if(i!=0) {
				System.out.print(i+" ");
			}
		}
		

	}

}
