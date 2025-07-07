package Array;
/*Description: Write a program to find all pairs in an array whose sum equals a given target.


Input: [1, 4, 5, 3, 2], target 6


Output: [(4, 2), (5, 1)]*/
import java.util.Scanner;

public class SumOfPair {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Element in array");
		int a[]=new int[5];
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		System.out.println("Enter target");
		int target=sc.nextInt();
		
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]+a[j]==target)
				{
					System.out.println("["+a[i]+","+a[j]+"]");
					break;
				}
			}
		}
	}

}
