package intern;

class one{
	one(){
		System.out.println("This is inside constructor");
	}
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
	void sub(int a,int b)
	{
		System.out.println(a-b);
	}
}
public class Constructor {

	public static void main(String[] args) {
		one o = new one();
		o.add(9, 5);
		o.sub(6, 4);

	}

}
