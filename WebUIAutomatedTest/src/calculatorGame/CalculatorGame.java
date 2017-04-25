package calculatorGame;

public class CalculatorGame {
	public static void main(String[] args)
	{
		System.out.println("趣味0～100位四则运算");
		int a = (int) (Math.random()*100 + 1);
		int b = (int) (Math.random()*100 + 1);
		
		for (int i = 0; i < 10; i ++)
		{
			int opindex = (int) (Math.random()*4);
			System.out.println(opindex);
		}
	}
}
