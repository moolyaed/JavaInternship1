package intern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the String:");
		String str1 = br.readLine();
		String str2 = br.readLine();
		if(str1.length()!=str2.length())
		{
			System.out.println("Given strings are not Anagrams");
		}
		else
		{
			char[] ArrayS1 = str1.toLowerCase().toCharArray();  
            char[] ArrayS2 = str2.toLowerCase().toCharArray();  
            Arrays.sort(ArrayS1);  
            Arrays.sort(ArrayS2); 
            if( Arrays.equals(ArrayS1, ArrayS2))
            {
            	System.out.println("Given strings are Anagrams");
            }
            else
            {
            	System.out.println("Given strings are not Anagrams");
            }
		}
		

	}

}
