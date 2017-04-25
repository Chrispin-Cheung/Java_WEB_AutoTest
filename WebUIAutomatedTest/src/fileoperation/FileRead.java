package fileoperation;

import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {
	public static void main(String[] args) throws IOException
	{
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
				while((str = br.readLine())!= null)
				{	
					//换行输出文件中每行的内容
					//System.out.println(str);
					String str1 = str.trim();
					String array[] = str1.split(" ");
					for(int i = 0; i < array.length; i ++) 
					{
						System.out.println(array[i]);
					}
					for(int i = 0; i< array.length/2;i ++)
					{
						System.out.printf("Username is %s;Password is %s\n", array[i], array[i+1]);
					}
				}
				br.close();
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
	}
}	
