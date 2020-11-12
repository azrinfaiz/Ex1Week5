public class ArrayTest
{
	public static void passByReference(String a[])
	{
		a[0] = "Changed";
	}
	public static void main(String args[])
	{
		String []b={"Apple","Mango","Orange"};
		// System.out.println("Before Function Call "+b[0]);
		for (String v: b)
			System.out.println(v);
		ArrayTest.passByReference(b);
		// System.out.println("After Function Call "+b[0]);
		for (String v: b)
			System.out.println(v);
	}
}
