import java.util.*;
interface StringTemplate
{
	void setString(String input);
	int getResult();
}
class ExtractDigit implements StringTemplate
{
		private String input;
	public void setString(String input)
	{
		this.input=input;
	}
	public int getResult()
	{
		return num_Sum(input);
	}
	public static int num_Sum(String str)
	{
		int sum=0,num=0;
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch>='0' && ch<='9')
			{
				num=num*10+ch-'0';
			}
			else
			{
				sum=sum+num;
				num=0;
			}
		}
		sum=sum+num;
		return sum;
	}
}
class CountVowel implements StringTemplate
{
		private String input;
		
	public void setString(String input)
	{
		this.input=input;
	}
	public int getResult()
	{
		return countVowel(input);
	}
	
	public static int countVowel(String str)
	{
			int count=0;
			String vowels="AEIOUaeiou";
			for(int i=0;i<str.length();i++)
			{
				char ch=str.charAt(i);
				if(vowels.indexOf(ch)!=-1)
				{
					count++;
				}
			}
			return count;
	}
}

class StringHelper
{
	public static void processString(StringTemplate obj,String str)
	{
		obj.setString(str);
		System.out.println("Result: "+obj.getResult());
	}
}
public class StringWithDynamicPolyApp
{
	public static void main(String x[])
	{
		Scanner xyz=new Scanner(System.in);
		System.out.println("Enter a string");
			String userInput=xyz.nextLine();
			
			StringTemplate obj1=new ExtractDigit();
			StringTemplate obj2=new CountVowel();
			
			System.out.println("Extracting and sum digit: ");
			StringHelper.processString(obj1,userInput);
			
			System.out.println("Count vowel: ");
			StringHelper.processString(obj2,userInput);
	}
}