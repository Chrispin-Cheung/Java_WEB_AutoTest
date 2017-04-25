package fileoperation;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWrite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f = new File("/Users/poptest/Java_WEB_AutoTest/WebUIAutomatedTest/src/fileoperation/users.txt");
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入用户名：");
		String uName = sc.next();
		System.out.println("请输入密码：");
		String pwd = sc.next();
		//按规定格式拼接字符串，注意添加回车符
		String userInfo = uName + " " + pwd +"\n";
		//格式化字符串
		String userInfofm = String.format("%s %s \n", uName,pwd);
		System.out.print(userInfofm);
		//以追加方式（true）打开方式，不加true为覆盖方式打开
		try {
			FileWriter fw = new FileWriter(f,true);
			fw.write(userInfo);
			fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		sc.close();
		
		
		
	}

}
