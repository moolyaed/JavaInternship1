package intern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the string:");
		String str = br.readLine();
		StringBuffer str1 = new StringBuffer(str);
		int length = str1.length();
		int count=0;
		for(int i=0 , j=length-1;i<length&&j>=0;i++,j--)
		{
			if(str1.charAt(i)!=str1.charAt(j))
			{
				count++;
			}
			else continue;
		}
		if(count>0)
		{
			System.out.println("String is not a Palindrome");
		}
		else
		{
			System.out.println("String is a Palindrome");
		}

	}

}
