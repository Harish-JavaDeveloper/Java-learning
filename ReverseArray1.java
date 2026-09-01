package practce;

import java.util.Arrays;

public class ReverseArray1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr=new int[] {11,22,33,44,55,66,77,88,99};
		int[] arrNew= new int[arr.length];
		int size=0;
		for(int i=arr.length-1;i>-1;i--) {
			arrNew[size] = arr[i];
			size++;
			
		}
		System.out.println(arrNew.length);
		System.out.println(Arrays.toString(arrNew));
		
		
	}

}
