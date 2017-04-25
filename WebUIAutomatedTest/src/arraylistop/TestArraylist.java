package arraylistop;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArraylist {
	public static void main(String[] args)
	{
		ArrayList<Dog> array = new ArrayList<Dog>();
		Dog dog1 = new Dog("Yellow","Samoyed","萨摩耶","James");
		Dog dog2 = new Dog("Brown","Poodle","贵妇犬","Joy");
		Dog dog3 = new Dog("white","Chihuahua","吉娃娃","Julie");
		array.add(dog1);
		array.add(dog2);
		array.add(dog3);
		//array.remove(2);//delete the dog2 in the collection array
//		//for   循环访问集合元素
//		for (int i = 0 ; i < array.size(); i++)
//		{
//			//System.out.println(array.get(i));//获取元素存储的地址
//			System.out.println("The color of "+array.get(i).owner+"'s dog is "+array.get(i).color);
//		}
		//while  循环，以迭代的方式访问集合元素
		//将数组式集合 转换成 链表式集合 用以迭代式访问集合元素 
		//通过这个方法将集合从list集合转换成迭代式集合 edited by ZhaoQiaohua
		Iterator<Dog> dog = array.iterator();
		
		//当前位置是否存在元素，为空是跳出循环
		//判断迭代式集合中当前地址是否有内容 edited by ZhaoQiaohua
		while(dog.hasNext())
		{
			//构建一个临时变量，指向集合中的下一个元素；
			//定义一个临时引用变量,用于存取引用变量里的内容 edited by ZhaoQiaohua
			Dog tmp = dog.next();
			//访问临时变量的值；
			//读取内容并进行输出 edited by ZhaoQiaohua
			System.out.println(tmp.getColor() +" "+ tmp.getKind() +" "+ tmp.getName() +" "+ tmp.getOwner());
		}
	}
	
}
