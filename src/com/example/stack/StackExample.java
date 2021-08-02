package com.example.stack;

import java.util.Scanner;

public class StackExample {
	static Scanner sc1 = new Scanner(System.in);
	public static void main(String[] args) {
		int choice = 0;
		
		stack1 sc = new stack1();
		System.out.println("*********Stack operations using array*********\n");
		
		while (choice != 4) {
			System.out.println("\n1.Push\n2.Pop\n3.Show\n4.Exit");
			System.out.println("\n Enter your choice \n");
			choice = sc1.nextInt();
			switch (choice) {
			case 1: {
				sc.push();
				break;
			}
			case 2: {
				sc.pop();
				break;
			}
			case 3: {
				sc.show();
				break;
			}
			case 4: {
				System.out.println("Exiting....");
				System.exit(0);
				break;
			}
			default: {
				System.out.println("Please Enter valid choice ");
				break;
			}
			}

		}

	}

}

class stack1 {

	int top;
	int maxSize = 10;
	int[] arr = new int[10];

	stack1() {
		top = -1;
	}

	boolean push() {

		if (top == maxSize - 1) {
			System.out.println("Overflow");

			return false;
		} else {
			Scanner sc = new Scanner(System.in);
			top++;
			System.out.println("Enter the value");
			arr[top] = sc.nextInt();
			System.out.print("Item pushed");
			sc.close();
			return true;
		}

	}

	public void show() {
		for (int i = top; i >= 0; i--) {
			System.out.print(" " + arr[i]);
		}
	}

	public boolean pop() {
		if (top < 0) {
			System.out.println("Underflow");
			return false;
		} else {
			top--;
			System.out.println("Item popped");
			return true;
		}
	}

}