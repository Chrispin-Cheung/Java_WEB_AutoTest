package sort;

public class bubblesort1 
{
	public static void main(String[] args)
	{
		int sortnumber[] = {3,89,73,26,32,56};
		for (int i = 0;i < sortnumber.length - 1; i++)
		{
			for(int j = 0;j < sortnumber.length - i - 1; j++)
			{
				if(sortnumber[j] < sortnumber[j+1])//确定是升序，还是降序
				{
					int temp = sortnumber[j];
					sortnumber[j] = sortnumber[j+1];
					sortnumber[j+1] = temp;
				}
				System.out.print("第"+ (i + 1)+ "次排序结果：");
				for( int index = 0;index < sortnumber.length; index++)
				{
					System.out.print(sortnumber[index] + "\t");
				}
				System.out.println("");
			}		
		}
		System.out.print("最终排序结果：");
		for(int i = 0; i < sortnumber.length; i++){
			                 System.out.print(sortnumber[i] + "\t");
        }
	}
}
