package edu.handong.csee.java.example;

import java.util.Scanner;

public class RecursionDemo2 {

	public static void main(String[] args) {
		RecursionDemo2 demonstrator = new RecursionDemo2();
		demonstrator.run();
	}

	private void run() {
		System.out.println("Enter a nonnegative integer: ");
		Scanner keyboard = new Scanner(System.in);
		int number = keyboard.nextInt();
		System.out.println(number + " contains " +
							getNumberOfZeros(number) + " zeros.");
		
		keyboard.close();
	}

	private int getNumberOfZeros(int n) {
		
		int result;
		if (n == 0)
			result = 1;
		else if (n < 10)
			result = 0;
		else if (n % 10 == 0)
			result = getNumberOfZeros(n/10) + 1;
		else
			result = getNumberOfZeros(n/10);
		return result;
	}
}
