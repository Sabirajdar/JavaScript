package Array;

import java.util.Scanner;

public class MissingElement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of array");
		int size = sc.nextInt();
		System.out.println("Enter element");
		int a[] = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		int min = a[0];
		int max = a[a.length - 1];
		for (int i = min; i < max; i++) {
			boolean flag = false;
			for (int j = 0; j < a.length; j++) {
				if (i == a[j]) {
					flag = true;
					break;
				}
			}
			if (!flag) {
				System.out.println("Missing value:" + i);
			}
		}

	}

}
