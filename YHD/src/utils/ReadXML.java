package utils;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.NodeList;

public class ReadXML {
	public String readxml() throws Exception{
		String result=null;//定义一个返回值
		File f=new File("src/data/yhd.xml");//指定文件路径
		//利用格式化工厂实例化文件解析方法
		DocumentBuilderFactory df=DocumentBuilderFactory.newInstance();
		//DocumentBuilderFactory是接口，不能直接实例化 可用newInstance()来实现实例化
		//获取计算机打开文件xml文件的方法（调用了一个解析文件接口DocumentBuilder）
		DocumentBuilder bf=df.newDocumentBuilder();
		//打开文件
		Document doc=bf.parse(f);
		//打开一级标签
		NodeList n1=doc.getElementsByTagName("login");
		for(int i=0;i<n1.getLength();i++){
			//通过输入二级标签名称获得二级标签的值
			String username=doc.getElementsByTagName("username").item(i).getFirstChild().getNodeValue();
			String password=doc.getElementsByTagName("password").item(i).getFirstChild().getTextContent();
//			String password=doc.getElementsByTagName("password").item(i).getFirstChild().getNodeValue();
			String expect=doc.getElementsByTagName("expect").item(i).getFirstChild().getNodeValue();
			result = username+" "+password+" "+expect;
		}
		return result;
	} 
}
