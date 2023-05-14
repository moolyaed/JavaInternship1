package intern;

public class Fibonacci {

	public static void main(String[] args) {
		int res=1,prev=0;
		for(int j=1;j<10;j++)
		{
			System.out.println(res);
			prev = res-prev;
			res = res+prev;
		}

	}

}
