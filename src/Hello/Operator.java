package Hello;

import com.sun.jdi.Value;

public class Operator 
{ 
	int d=10;
	static int c=20;
	public static void main(String[] args)
	{
	  int a=50, b=30;
	 int add=a+b,sub=a-b,mul=a*b,div=a/b;
	 
		
		System.out.println("Addition of two number is="+add);
		System.out.println("Substraction of two number is="+sub);
		System.out.println("Multiplication of two number is="+mul);
		System.out.println("Division of two number is="+div);
		System.out.println("value of c is="+c);	
		System.out.println("Addition of three number is="+(a+b+c));
		 Operator a1=new Operator();
		System.out.println(" value of d is="+(a1.d));
		
	}
		}

