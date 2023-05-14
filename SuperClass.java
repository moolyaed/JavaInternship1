package intern;

class SuperC{
	void add(int a,int b)
	{
		System.out.println(a+b);
	}
}

class subClass extends SuperC{
	void sub(int a,int b)
	{
		System.out.println(a-b);
	}
}

public class SuperClass {

	public static void main(String[] args) {
		subClass sub = new subClass();
		sub.add(5, 6);
		sub.sub(6, 1);

	}

}
