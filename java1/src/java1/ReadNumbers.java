package java1;

import java.util.Scanner;

public class ReadNumbers {
	public static void main(String[] args){
		int a=0,b=0,c=0;
		
		Scanner in=new Scanner(System.in);
		System.out.print("Enter a Number :");
		a=in.nextInt();
		System.out.print("Enter a Number :");
		b=in.nextInt();
		
		c=a+b;
		System.out.println(c);
		c=a-b;
		System.out.println(c);
		c=a*b;
		System.out.println(c);
		c=a/b;
		System.out.println(c);
		c=a%b;
		System.out.println(c);
		
	}

}
