package methodoverloading;

public class B extends A{

	void m1()
	
	{
		System.out.println("m1--b");
	}
	
	void m3()
	{
		System.out.println("m3--b");
	}
	
	public static void main(String[] args) {
		A a=new B();
		a.m1();
		a.m2();
		int b='c';
		String c=null;
		System.out.println(b);
		String s=new String("5");
		System.out.println(s);
		System.out.println(c);
//		System.out.println(null);
		
	}
}
