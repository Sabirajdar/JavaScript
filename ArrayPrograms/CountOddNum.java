package Array;

import java.util.Scanner;

/*5. Count Odd Numbers in Array
Description: Count how many odd numbers are in an array.


Input: [1, 2, 3, 4, 5, 6]


Output: 3
*/
public class CountOddNum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of array");
		int size=sc.nextInt();
		System.out.println("Enter Element in array");
		int a[]=new int[size];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int count=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				count++;
			}
		}
		System.out.println(count);

	}

}
