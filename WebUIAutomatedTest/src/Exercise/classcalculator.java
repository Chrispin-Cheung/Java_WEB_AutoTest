package Exercise;

public class classcalculator {
	public void sum(int a, int b)
	{
		int result = a + b;
		System.out.print("所得和为：\n");
		System.out.print(a+"+"+b+"="+result);
	}
	public void sub(int a, int b)
	{
		int result;
		if (a > b)
		{
			result = a - b;
			System.out.print("所得差为：\n");
			System.out.print(a+"-"+b+"="+result);
		}
		else
		{
			result = b - a;
			System.out.print("所得差为：\n");
			System.out.print(b+"-"+a+"="+result);
		}
	}
	public void mul(int a, int b)
	{
		double result = a * b;
		System.out.print("所得积为：\n");
		System.out.print(a+"*"+b+"="+result);
	}
	public void div(int a, int b)
	{
		if (b != 0)
		{
			int result = a / b;
			System.out.print("所得商为：\n");
			System.out.print(a+"/"+b+"="+result);
		}
	}
	public void modulo(int a, int b)//以什么为模，求模运算
	{
		if(b != 0)
		{
			int result = a % b;
			System.out.print("所得余为：\n");
			System.out.print(a+"%"+b+"="+result);
		}
	}
}
