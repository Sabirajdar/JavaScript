package Array;

import java.util.Scanner;

/*12. Find the Duplicate Elements in Array
Description: Find all the duplicate elements in an array.


Input: [1, 2, 3, 4, 5, 1, 3]


Output: [1, 3]
*/
public class DuplicateArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Element in array");
		int a[] = new int[7];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}

		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if (a[i] == a[j]) {
					System.out.print(a[i]+" ");
				}

			}
		}
	}

}
