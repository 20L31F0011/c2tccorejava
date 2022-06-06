package com.first.core;
// program uses class Scanner-------1
import java.util.Scanner;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter First number: ");
		
		//read first number from user---3
		String num1 = input.nextLine();
		
		System.out.printf("number is %s %n",num1);
	}

}
