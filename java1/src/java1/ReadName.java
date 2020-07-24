package java1;

import java.util.Scanner;

public class ReadName {
	public static void main(String[] args){
		String s;
		System.out.print("Enter your name :");
		
		Scanner in=new Scanner(System.in);
		s=in.nextLine();
		
		System.out.println("Welcome " +s);
	}

}
