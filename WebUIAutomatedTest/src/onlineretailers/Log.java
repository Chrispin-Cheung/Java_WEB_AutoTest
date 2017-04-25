package onlineretailers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Log {
	
	public void login()
	{
		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String uName = sc.next();
		System.out.println("请输入密码：");
		String uPwd = sc.next();
		
		File fp = new File("/Users/poptest/JavaProject/HelloWorld/src/fileoperation/users.txt");
		if (fp.exists())
		{
			System.out.println("文件已存在");
			try {
				//打开文件（FileReader类），放入内存缓冲区 
				//注意FileReader只能一个字符一个字符的读，而BufferedReader却存在一个按行读的方法
				BufferedReader br = new BufferedReader(new FileReader(fp));
				String str;
				//把读出的字符串赋值，判断当前行是否为空
				try {
						while((str = br.readLine())!= null)
						{	
							//换行输出文件中每行的内容
							String str1 = str.trim();
							String array[] = str1.split(" ");
							if ((array[0].equals(uName)) && (array[1].equals(uPwd)))
							{
								flag = true;
								break;//检索成功，退出
							}
						}
						if (!flag)
						{
							System.out.println("登录失败！");
						}else
						{
							System.out.println("登录成功！");
						}
						br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					System.out.println("文件读入内存缓冲区失败");
					e.printStackTrace();
			}
		}
		else
		{
			System.out.println("文件不存在");
		}
		sc.close();
	}
	public void logout()
	{
		
	}
}
