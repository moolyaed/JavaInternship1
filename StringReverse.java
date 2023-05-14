package intern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringReverse {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String:");
		String str = br.readLine();
		StringBuffer str1 = new StringBuffer(str);
		String reverse="";
		for(int i=str1.length()-1;i>=0;i--)
		{
			reverse =reverse+str1.charAt(i);
		}
		System.out.println(reverse);
		System.out.println(reverse.toUpperCase());

	}

}
