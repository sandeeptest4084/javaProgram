package javaProject;

import java.util.Scanner;

public class EvenNumbers {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the number");
		
		int number = sc.nextInt();
		
		if (number%2==0)
		{
			System.out.println("given number is even");
		}
		else
		{
			System.out.println("given number is odd");
		}

	}

}
