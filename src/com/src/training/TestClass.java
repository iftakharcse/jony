package com.src.training;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int b=129;
		//byte a=(byte)b;
		
		//String x="10";
		//int a=Integer.parseInt(x);
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();

		if (a >= b && a >= c) {
			System.out.print(a);

		} else if (b >= a && b >= c) {
			System.out.print(b);
		} else {
			System.out.print(c);
		}
		
		switch (a) {
		case 1:
			System.out.println("He He " + a);
			break;
		case 3:
			System.out.println("Ho Ho " + a);
			break;

		default:
			System.out.println("Rahul pagul " + a);
			break;
		}
	}

}
