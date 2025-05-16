package Array;

import java.util.Scanner;

/*10. Merge Two Arrays
Description: Merge two arrays into one.


Input: [1, 2, 3], [4, 5, 6]


Output: [1, 2, 3, 4, 5, 6]
*/
public class MargeArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Element in array");
		int a[]=new int[3];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter Element in array");
		int b[]=new int[3];
		
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		
		int result[]=new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
		{
			result[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			result[a.length+i]=b[i];
		}
		System.out.println("Merged Array");
		for(int i=0;i<result.length;i++)
		{
			System.out.print(result[i]);
		}
	}

}
