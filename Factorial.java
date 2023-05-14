package intern;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Factorial {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the number:");
		int num = Integer.parseInt(br.readLine());
		for(int i=num-1;i>0;i--)
		{
			num = num*i;
		}
		System.out.println(num);
	}
}
