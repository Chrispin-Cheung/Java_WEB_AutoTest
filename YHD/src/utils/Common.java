package utils;

public class Common {
	public void myWait(int time)
	{
		try {
			Thread.sleep(time); //单位 毫米ms
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
