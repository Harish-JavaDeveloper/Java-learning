package practce;

import java.util.Arrays;

public class MovingZeroToEndOfArray {

	public static void main(String[] args) {
//		 TODO Auto-generated method stub
		int[] arr=new int[] {0,11,0,22,0,33,0,44,0,55,0,66,0,77,0,88,0,99};
		int size=0;
		int start=0,end = arr.length-1;
		int[] arrNew =new int[arr.length];
		
		for(int i=arr.length-1;i>-1;i--) {
			arrNew[size]=arr[i];
			size++;
		}
		
		for(int  i=0; start<end;i++) {
			int temp=arr[i];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		System.out.print(Arrays.toString(arrNew));
		System.out.println("\n");
		System.out.print(Arrays.toString(arr));
		start=0;end=1;
		
		while(end<arr.length)
		{
			if(arr[start]==0 && arr[end]!=0) {
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				start++;
				end++;
			}
			else if (arr[start]==0 && arr[end]==0) {
				end++;
			}
			 else {
			        start++;
				 	end++;
			       
			    }
			
		}
		
		System.out.println("\n");
		System.out.print(Arrays.toString(arr));
	}

}
