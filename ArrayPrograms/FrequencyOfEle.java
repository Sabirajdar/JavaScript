package Array;

import java.util.Scanner;

/*7. Find the Frequency of an Element in Array
Description: Find how many times an element appears in an array.


Input: [1, 2, 2, 3, 4, 2, 5], element 2


Output: 3*/
public class FrequencyOfEle {

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
		System.out.println("Enter target");
		int target=sc.nextInt();
		for(int i=0;i<a.length;i++)
		{
			if(target==a[i])
			{
				count++;
			}
		}
		System.out.println("Output"+count);
		
	}

}
