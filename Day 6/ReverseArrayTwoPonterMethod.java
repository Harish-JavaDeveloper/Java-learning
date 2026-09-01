package practce;

import java.util.Arrays;

public class ReverseArrayTwoPonterMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[] {11,22,33,44,55,66,77,88,99};
		int start=0;
		int end = arr.length-1;
		for(int i =0; start<end;i++) {
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
			
		}
		
		System.out.println(Arrays.toString(arr));
	}

}
