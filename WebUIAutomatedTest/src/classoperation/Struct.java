package classoperation;

public class Struct {
	int a;
	int b;
	String c;
	
	public Struct(){
		System.out.println("Struct Class");
	}
	public Struct(int rvx,int rvy)
	{
		a = rvx;
		b = rvy;
//		System.out.println("Sum = "+a+"+"+b+"="+(a+b));
	}
	public Struct(int rvx,int rvy,String rvz)
	{
		a = rvx;
		b = rvy;
		c = rvz;
//		System.out.println("Sum = "+a+"+"+b+"="+(a+b));
	}
	public void Sum()
	{
		System.out.println(c + " = "+a+"+"+b+"="+(a+b));
	}
	protected void MySum()
	{
		System.out.println( "和 = "+a+"+"+b+"="+(a+b));
	}
}
