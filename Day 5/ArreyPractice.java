package practce;

public class ArreyPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= new int[5];
		float[] arr1= new float[] {1.1f,2.2f,3.3f,4.4f,5.5f};
		String[] word= new String[5] ;
		System.out.println(java.util.Arrays.toString(arr));
		System.out.println(java.util.Arrays.toString(arr1));
		System.out.println(arr1.length);
		System.out.println(arr1[0]+arr1[1]);
		// travels through the array
		word[0]="Hi";
		word[1]="dude";
		word[2]="i'm";
		word[3]="Harish";
		word[4]="Baskaran";
		System.out.println(java.util.Arrays.toString(word));
		for(int  i= 0; i<word.length;i++) {
			System.out.println(arr1[i]);
		}
		
	}

}
