package Array;

import java.util.Scanner;

/*9. Find the Common Elements in Two Arrays
Description: Find the common elements between two arrays.


Input: [1, 2, 3, 4], [3, 4, 5, 6]


Output: [3, 4]
*/
public class CommonEleInArr {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Element in array");
		int a[]=new int[4];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter Element in array");
		int b[]=new int[4];
		
		for(int i=0;i<b.length;i++)
		{
			b[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				if(a[i]==b[j])
				{
					System.out.print(a[i]+", ");
				}
			}
		}
	}

}
