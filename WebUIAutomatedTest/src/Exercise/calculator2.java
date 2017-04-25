/*
 * function:calcultor invoking method of a class
 * 
 * 
 * 
 */
package Exercise;

import java.util.Scanner;

public class calculator2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		classcalculator calculator = new classcalculator();
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个数\n");
		int a = sc.nextInt();
		System.out.print("请输入一个运算符\n");
		String op = sc.next();
		System.out.print("请输入另一个数\n");
		int b = sc.nextInt();
		
		if (op.equals("+"))
		{
			calculator.sum(a,b);
		}
		else if(op.equals("-"))
		{
			calculator.sub(a,b);
		}
		else if(op.equals("*"))
		{	
			calculator.mul(a,b);			
		}
		else if(op.equals("/"))
		{	
			calculator.div(a,b);
		}
		else if(op.equals("%"))
		{	
			calculator.modulo(a,b);
		}
		else
		{
			System.out.print("请输入正确的运算符：＋ — ＊ ／ ％");
		}
		sc.close();
	}

}
