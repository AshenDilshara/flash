package java1;

import java.util.Scanner;

public class ReadNameAndAge {
	public static void main(String[] args){
		String name;
		int age;
		Scanner in=new Scanner(System.in);
		System.out.print("Enter your Name :");
		name=in.nextLine();
		System.out.print("Enter Your Age :");
		age=in.nextInt();
		
		System.out.format("Welcome %s %n", name);
		System.out.format("You are %d Years old.%n",age);
	}

}
