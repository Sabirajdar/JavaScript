package Array;

import java.util.Scanner;

public class RotateArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size = sc.nextInt();
		System.out.println("Enter element in array");
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		System.out.println("Enter no of rotation");
		int n = sc.nextInt();

		while (n >= 1) {
			int last = a[a.length - 1];
			for (int i = a.length-1; i > 0; i--) {
				a[i] = a[i-1];
			}
			a[0] = last;
			n--;
		}
		System.out.println("After Rotating Array");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}	

	}

}
