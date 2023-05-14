package intern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FirstRepeated {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String:");
		String str = br.readLine();
		StringBuffer str1 = new StringBuffer(str);
		for(int i=0;i<str1.length()-2;i++)
		{
			for(int j=i+1;j<str1.length()-1;j++)
			{
				if(str1.charAt(i)==str1.charAt(j))
				{
					System.out.println("First repeated character:"+str1.charAt(i));
				}
				else continue;
			}
		}

	}

}
