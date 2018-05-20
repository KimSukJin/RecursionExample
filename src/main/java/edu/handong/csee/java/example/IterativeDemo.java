package edu.handong.csee.java.example;

import java.util.ArrayList;
import java.util.Scanner;

public class IterativeDemo {

	public static void main(String[] args) {
		IterativeDemo demonstrator = new IterativeDemo();
		demonstrator.run();
	}

	private void run() {
		System.out.println("Enter a integer: ");
		Scanner keyboard = new Scanner(System.in);
		int number = keyboard.nextInt();
		System.out.println("The digits in the number are: ");
		displayAsWords(number);
		System.out.println();
		
		System.out.println("If you add ten to that number, ");
		System.out.println("the digits in the new number are: ");
		number = number + 10;
		displayAsWords(number);
		System.out.println();
		
		keyboard.close();
	}

	public void displayAsWords(int number) {
		ArrayList<Integer> digits = new ArrayList<Integer>();
		int currentNumber = number;
		
		while(true) {			
			if(currentNumber <10) {
				digits.add(0,currentNumber);
				break;
			}
			int lastDigit = currentNumber%10;
			currentNumber = currentNumber/10;
			digits.add(0,lastDigit);
		}
		
		for(Integer digit:digits) {
			System.out.print(getWordFromDigit(digit) + " ");
		}
	}

	private String getWordFromDigit(int digit) {
		String result = null;

		switch(digit) {
		case 0: result = "zero"; break;
		case 1: result = "one"; break;
		case 2: result = "two"; break;
		case 3: result = "three"; break;
		case 4: result = "four"; break;
		case 5: result = "five"; break;
		case 6: result = "six"; break;
		case 7: result = "seven"; break;
		case 8: result = "eight"; break;
		case 9: result = "nine"; break;
		default:
			System.out.println("Fatal Error");
			System.exit(0);
		}
		return result;
	}
}
