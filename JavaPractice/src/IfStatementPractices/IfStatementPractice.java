package IfStatementPractices;
import java.util.Scanner;

public class IfStatementPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isContinue = true;  //��ʼ�����ڿ���do-whileѭ������������
		double numberInput;  //����double����������������ֵ
		
		//��console��ʾ������ֵ
		do {
			System.out.print("Please enter a number:");
			Scanner sc = new Scanner(System.in);
		
			//ʹ��try-catch������ܳ��ֵ���������ֵ��쳣
		try {
			numberInput = sc.nextDouble();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("���������к��з�����ֵ�������ԣ�");
			continue;
		}
		
		
		//�ж�������ֵ������0
		if (numberInput < 0.0){
			System.out.println("The number input is negative!");
		}
		if(numberInput >0.0) {
			System.out.println("THe number input is positive!");
		}
		if(numberInput == 0.0){
			System.out.println("THe number input is zero!");
		}
		
		if(Math.abs(numberInput) < 1.0) {
			System.out.println("The number input is small");
		}
			
			if(Math.abs(numberInput) >1000000) {
				System.out.println("The number input is large");
		}
		
		//��ʾ�Ƿ���Ҫ�ٴ��������֣����ѡ��Ϊno������do-whileѭ��
		System.out.println("Do you want to continue? yes/no");
		String conditionQuit = sc.next();  
		if(conditionQuit.equals("no")) {
			isContinue = false;
		}
		
		}while(isContinue);
	}

}
