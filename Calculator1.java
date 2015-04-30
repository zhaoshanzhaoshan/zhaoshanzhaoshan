import java.util.Scanner;
public class Calculator1 {
	
	private static int result;
	public void add(int n){		//加法运算
		result = result + n;
	}
	public void sub(int n){		//减法运算
		result = result - 1;
	}
	public void mul(int n){		//乘法运算
		result = result * n;
	}
	public void div(int n){		//除法运算
		result = result / n;
	}
	public void square(int n){	//乘方运算
		result = n * n;
	}
	public void cobk(int n){	//倒数运算
		result = 1 / n;
	}
	public void clear(){		//结果清零
		result = 0;
	}
	public int getResult(){
		return result;
	}
	public static void main(String args[]){
		Calculator1 cal = new Calculator1();
		System.out.println("请输入result初始结果");
		Scanner input = new Scanner(System.in);
		cal.result=input.nextInt();
		cal.add(5);
		System.out.println(result);
		
	}
}
