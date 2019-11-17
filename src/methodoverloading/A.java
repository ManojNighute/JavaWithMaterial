package methodoverloading;

public class A {

	void m1()
	{
		System.out.println("m1--A");
	}
	void m2()
	{
		m1();
		System.out.println("m2--A");
	}
}
