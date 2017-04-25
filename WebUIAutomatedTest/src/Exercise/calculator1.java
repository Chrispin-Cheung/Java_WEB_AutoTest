/*
 * function: simple calculator
 * 
 */

package Exercise;

import java.util.Scanner;

public class calculator1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个数\n");
		int a = sc.nextInt();
		System.out.print("请输入一个运算符\n");
		String op = sc.next();
		System.out.print("请输入另一个数\n");
		int b = sc.nextInt();
		int result;
		if (op.equals("+"))
		{
			result = a + b;
			System.out.print("所得和为：\n");
			System.out.print(a+op+b+"="+result);
		}
		else if(op.equals("-"))
		{
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
		else if(op.equals("*"))
		{	
			result = a * b;
			System.out.print("所得积为：\n");
			System.out.print(a+op+b+"="+result);
			
		}
		else if(op.equals("/"))
		{	
			if (b!=0)
			{
				result = a / b;
				System.out.print("所得商为：\n");
				System.out.print(a+op+b+"="+result);
			}			
		}
		else if(op.equals("%"))
		{	
			result = a % b;
			System.out.print("所得余为：\n");
			System.out.print(a+op+b+"="+result);
			
		}
		else
		{
			System.out.print("请输入正确的运算符：＋ — ＊ ／ ％");
		}
		sc.close();
	}
}
