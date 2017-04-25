/*
 * 累加 accumulation use loop structure for...
 */
package Exercise;

public class accumulation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		//for (变量＝初值；变量<=终值；变量＝变量＋步长)
		//for (初值；终值；步长)
		//for (int i = 1; i <= 10; i ++ )
		for (int i = 1; i <= 10; ++ i)
		{	
			sum = sum + i;			
		}
		System.out.print("0~10的累加值为："+ sum);
	}

}
