package testcase;

import utils.DataReadXML;
import utils.ReadXML;

public class TestReadXML {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ReadXML rd = new ReadXML();
		DataReadXML rdxml = new DataReadXML();
		String result = rd.readxml();
		String results[] = result.split(" ");
		for (int i = 0; i < 3; i++)
		{
			System.out.println(results[i]);
		}
		System.out.println(result);
		String rs = rdxml.dataReadXML("src/data/yhd.xml", "login", "password");
		System.out.println(rs);
	}

}
