package edu.wit.cs.comp1000;

import java.util.Scanner;

// TODO: document this class
public class PA1a {

	// TODO: document this function
	public static void main(String[] args) {
		// TODO: write your code here
Scanner input = new Scanner(System.in);
		
		int yards; 
		System.out.printf("Enter yards:%n");
		yards=input.nextInt(); 
		
		int feet; 
		System.out.printf("Enter feet:%n");
		feet =input.nextInt(); 
		
	
		int inches; 
		System.out.printf("Enter inches:%n");
		inches=input.nextInt(); 
		
int SUM = yards * 36 + feet *12 + inches ; 

System.out.printf("The total inches is %d%n",  + SUM); 
	}
	

}
