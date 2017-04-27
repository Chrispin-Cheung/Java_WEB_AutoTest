/*
 * 常用通用类
 */
package cn;

public class Tools {
	public void mySleep(int time)//自定义等待函数
	{
		try {
			Thread.sleep(time); //单位 毫米ms
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
