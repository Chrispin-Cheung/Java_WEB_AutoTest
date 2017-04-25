package onlineretailers;

import java.util.Scanner;

public class Onlineretailers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("＊＊＊＊登陆（A）＊＊＊＊");
		System.out.println("＊＊＊＊注册（B）＊＊＊＊");
		System.out.println("＊＊＊＊退出（C）＊＊＊＊");
		
		System.out.println("请选择使用模块：登陆(A)、"
									+ "注册(B)、"
									+ "退出(C)");
		String mode = sc.next();
		if(mode.equals("A") || mode.equals("a"))
		{
			System.out.println("＊＊＊＊登陆（A）＊＊＊＊");
			Log login = new Log();
			login.login();
		}else if (mode.equals("B") || mode.equals("b") )
		{
			System.out.println("＊＊＊＊注册（B）＊＊＊＊");
			Reg Register = new Reg();
			
		}else if (mode.equals("C")|| mode.equals("c"))
		{
			System.out.println("＊＊＊＊退出（C）＊＊＊＊");
		}else
		{
			System.out.println("输入非法");
		}
		sc.close();
	}

}
