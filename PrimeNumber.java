package intern;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 12,count=0;
		for(int i=2;i<=num/2;i++)
		{
			if(num%2==0)
			{
				count++;
			}
		}
			if(count==0)
			{
				System.out.println("Given number is a Prime number");
			}
			else System.out.println("Given number is not a Prime number");
	}

}
