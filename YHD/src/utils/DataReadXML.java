package utils;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;


import org.w3c.dom.Document;
//import org.w3c.dom.Element;
import org.w3c.dom.NodeList;


public class DataReadXML {
	public String dataReadXML(String Path,String FirstTagName,String SecondTagName) throws Exception
	{
		//定义一个返回值
		String result = null;
		//指定数据文件路径
		File f = new File(Path);
		//利用格式化工厂，实例化DocumentBuilderFactory
		DocumentBuilderFactory df = DocumentBuilderFactory.newInstance();
		//获取计算机打开xml文件的方法(调用了解析文件接口DocumentBuilder)
		DocumentBuilder bf = df.newDocumentBuilder();
		//打开文件
		Document doc = bf.parse(f);
		
		NodeList n1 = doc.getElementsByTagName(FirstTagName);
		
		for (int i = 0; i < n1.getLength(); i++ )
		{
			//访问item的节点的节点值，如果节点的内容为空，会返回null，输入的时候，会导致代码报错，或跳过
			//result = doc.getElementsByTagName(SecondTagName).item(i).getFirstChild().getNodeValue();
			result = doc.getElementsByTagName(SecondTagName).item(i).getTextContent();
		}
		//树形结构来读取访问各个元素值
//		Element root=doc.getDocumentElement();
//      //
//		NodeList childnode = root.getElementsByTagName(FirstTagName);
//		NodeList resnode = childnode.item(0).getChildNodes();
//		for(int i=0;i<resnode.getLength();i++)
//		{
//			if(resnode.item(i).getNodeName().equals(SecondTagName))
//			{
//				result=resnode.item(i).getTextContent();
//				break;
//			}
//		}
		return result;
	}
	
}
