/*
 * calculator using switch...case...
 */

package Exercise;

import java.util.Scanner;

public class calculator3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("请输入一个数\n");
		int a = sc.nextInt();
		System.out.print("请输入一个运算符\n");
		String op = sc.next();
		System.out.print("请输入另一个数\n");
		int b = sc.nextInt();
		classcalculator calculator = new classcalculator();
		switch(op){
		case "+":
			calculator.sum(a, b);
			break;
		case "-":
			calculator.sub(a, b);
			break;
		case "*":
			calculator.mul(a, b);
			break;
		case "/":
			calculator.div(a, b);
			break;
		case "%":
			calculator.modulo(a, b);
			break;
		default:
			System.out.print("请输入正确的运算符：＋ — ＊ ／ ％");
			//break;			
		}		
		sc.close();
	}

}
