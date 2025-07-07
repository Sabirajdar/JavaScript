package Array;
/* Find the Intersection of Two Arrays
Description: Write a program to find the common elements in two arrays.


Input: [1, 2, 2, 1], [2, 2]


Output: [2, 2]*/
import java.util.Scanner;

public class IntersectionArray {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				System.out.println("Enter Element in array");
				int a[]=new int[4];
				for(int i=0;i<a.length;i++)
				{
					a[i]=sc.nextInt();
				}
				System.out.println("Enter Element in array");
				int b[]=new int[2];
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
							System.out.print(a[i]+" ");
							break;
						}
					}
				}
			}
	}


