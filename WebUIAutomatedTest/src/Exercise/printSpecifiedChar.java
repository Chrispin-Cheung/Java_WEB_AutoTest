/*
 * 打印特定的字符
 */
package Exercise;

import java.util.Scanner;

public class printSpecifiedChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		printout("请输入分界符：");
		String s = sc.next();
		Triangle();
		delimiter(s);
		Square();
		delimiter(s);
		InvertedTriangle();
		delimiter(s);
		RegularTriangle();
		
		
		
		sc.close();
	}
	static void InvertedTriangle() //打印倒三角
	{
		for (int i = 0; i < 10; i ++)
		{
			for(int j = i; j < 10; j ++)
			{
				printout(" *");
			}
			printout("\n");
		}
	}
	static void Triangle() //打印上三角
	{
		for(int i = 0; i <10 ; i ++)
		{
			for (int j = 0; j <= i; j ++)
			{
				printout(" *");
			}
			printout("\n");
		}
	}
	static void RegularTriangle()// 打印正三角形
	{
		for (int i = 0; i < 10; i++)
		{
			for(int j = 1;j < 10 - i; j ++)
			{
				printout(" ");
			}
			for(int k = 0;k < i; k ++)
			{
				printout(" *");
			}
			printout("\n");
		}
	}
	static void Square()//打印十行十列
	{	
		for (int i = 0; i < 10; i ++)
		{
			for(int j = 0; j < 10; j ++)
			{
				printout(" *");
			}
			printout("\n");
		}		
	}
	static void delimiter(String s) //答应定界符，分隔符
	{	
		s = " "+s;
		for (int i = 0; i < 10; i++)
		{			
			printout(s);
		}
		printout("\n");
	}
	static void printout(String str)//自定义输出函数
	{
		System.out.print(str);
	}
}

