package classoperation;

public class TestStruct {
	public static void main(String[] args)
	{
		int a = (int) (Math.random()*100+1);
		int b = (int) (Math.random()*100+1);
		Struct sr = new Struct();
		Struct st = new Struct(a,b);
		Struct sc = new Struct(a,b,"Sum");
		// 不同的实例化，调用public，protect方法有不同的结果
		sr.Sum();
		st.Sum();
		sc.Sum();
		sr.MySum();
		st.MySum();
		sc.MySum();
		
	}
}
