package intern;

public class SmallestInArray {

	public static void main(String[] args) {
		int[] arr= {45,76,87,43,98,2};
		int min=arr[0];
		for(int a=1;a<arr.length;a++)
		{
			if(min>arr[a])
			{
				min=arr[a];
			}
			else continue;
		}
		System.out.println(min);

	}

}
