package practce;

public class IfElse {

	public static void main(String[] args) {
		
		int a=20;
		int b = 40;
		float num1= 10;
		double num2 = 20.0;
		byte c;
		String name = "Harish";
		char letter = 'B';
	
		
		if(a<b)
		{
			
			System.out.println("A is lessthen B: "+(a<b));
			System.out.println("Before Increment a:"+a);
			System.out.println(a);
			a++; 
			System.out.println("After increment a: "+a);
			
		}
		else if(a>b) {
			System.out.println("A is greaterthen B: "+(a>b));
			System.out.println("Before Increment b:"+b);
			b +=1;
			System.out.println("After Increment b: "+ b);
		}
		else if (a==b) {
			System.out.println("A is Equal to B: "+(a==b));
			System.out.println("Before decrement a:"+a);
			System.out.println(a);
			a--; 
			System.out.println("After decrement a: "+a);
		}
		else if(a!=b) {
			System.out.println("A is not equal to B: "+(a!=b));
			System.out.println("Before decrement a:"+b);
			System.out.println(b);
			b--; 
			System.out.println("After decrement a: "+b);
		}
		c=(byte) -126;
		System.out.println("checking byte range :"+c);
		System.out.println("addition of two number :"+(num2+(num1/2)));
	if (letter =='B') {
		System.out.println("First name : "+name+"  "+letter);
	}
		
	}

}
