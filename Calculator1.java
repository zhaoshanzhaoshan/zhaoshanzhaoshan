import java.util.Scanner;
public class Calculator1 {
	
	private static int result;
	public void add(int n){		//�ӷ�����
		result = result + n;
	}
	public void sub(int n){		//��������
		result = result - 1;
	}
	public void mul(int n){		//�˷�����
		result = result * n;
	}
	public void div(int n){		//��������
		result = result / n;
	}
	public void square(int n){	//�˷�����
		result = n * n;
	}
	public void cobk(int n){	//��������
		result = 1 / n;
	}
	public void clear(){		//�������
		result = 0;
	}
	public int getResult(){
		return result;
	}
	public static void main(String args[]){
		Calculator1 cal = new Calculator1();
		System.out.println("������result��ʼ���");
		Scanner input = new Scanner(System.in);
		cal.result=input.nextInt();
		cal.add(5);
		System.out.println(result);
		
	}
}
