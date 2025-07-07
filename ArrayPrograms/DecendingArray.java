package Array;

import java.util.Scanner;

/*14. Sort Array in Descending Order
Description: Sort the elements of the array in descending order.


Input: [10, 2, 30, 4, 5]


Output: [30, 10, 5, 4, 2]
*/
public class DecendingArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Element");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		
		System.out.println("After sorting Descending order");
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}
	}

}
