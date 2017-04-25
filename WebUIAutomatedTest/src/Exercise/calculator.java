/*
 * calculator calling the static function
 */

package Exercise;

import java.util.Scanner;

public class calculator {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个数\n");
		int a = sc.nextInt();
		System.out.print("请输入一个运算符\n");
		String op = sc.next();
		System.out.print("请输入另一个数\n");
		int b = sc.nextInt();
		
		if (op.equals("+"))
		{
			sum(a,b);
		}
		else if(op.equals("-"))
		{
			sub(a,b);
		}
		else if(op.equals("*"))
		{	
			mul(a,b);			
		}
		else if(op.equals("/"))
		{	
			div(a,b);
		}
		else if(op.equals("%"))
		{	
			modulo(a,b);
		}
		else
		{
			System.out.print("请输入正确的运算符：＋ — ＊ ／ ％");
		}
		sc.close();
	}
	static void sum(int a, int b)
	{
		int result = a + b;
		System.out.print("所得和为：\n");
		System.out.print(a+"+"+b+"="+result);
	}
	static void sub(int a, int b)
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
	static void mul(int a, int b)
	{
		double result = a * b;
		System.out.print("所得积为：\n");
		System.out.print(a+"*"+b+"="+result);
	}
	static void div(int a, int b)
	{
		if (b != 0)
		{
			int result = a / b;
			System.out.print("所得商为：\n");
			System.out.print(a+"/"+b+"="+result);
		}
	}
	static void modulo(int a, int b)//以什么为模，求模运算
	{
		if(b != 0)
		{
			int result = a % b;
			System.out.print("所得余为：\n");
			System.out.print(a+"%"+b+"="+result);
		}
	}
}
