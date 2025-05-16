package Array;

import java.util.Scanner;
/*8. Find the Second Largest Element in Array
Description: Find the second largest element in an array.


Input: [10, 20, 30, 40, 50]


Output: 40*/
public class SecondLargestEleArray {

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
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			
		}
		System.out.println("After sorting: ");
		for( int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		int count=0;
		boolean flag=false;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]!=a[i+1])
			{
				count++;// 1 2
			}
			if(count==2)//2==2
			{
				flag=true;
				System.out.println("SecondLargest Value: "+a[i]);//40
			}
		}
		if(!flag)
		{
			System.out.println("No SecondLargest number");
		}
	}

}
