

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		String numberEntering;   //�������ڴ���������ֵ�ı����ַ���
		int integerPart;         //�������ڴ���ӹ��������ֵ�������ֵı���
		int tempNumberInteger;   //����������ʱ�����������㲿�ֵ�����
		double decimalPart =0.0;     //�������ڴ����û�������ֵС�����ֵı���
		double tempNumberDecimal;       //�������ڴ������������ݴ����ݵı���
		// �ֱ����������֡�С�����������ս�����ַ���
		String resultStringInteger, resultStringDecimal;     
		boolean yesQuit = true;  //��ʼ�������ж��Ƿ��˳��������������
		
		//ʹ��do-whileѭ�������ж����ֵ���������
		do {
			//��ÿ��������ֵ���ʼ�����������ַ���
			resultStringDecimal = ""; 
			resultStringInteger = "";
			//resultString = "";
			//Ҫ���û�������ֵ
			System.out.println("Please enter a number:");
			Scanner in =  new Scanner(System.in);
			numberEntering =  in.next();
			
//			//��������ֵ�����жϣ������ֵ����0-1��Χ�ڣ�Ҫ������������
//			if (decimalPart >=1 || decimalPart<=0) {
//				System.out.println("the number is not between 0 and 1, please enter again!");
//				continue;
//			}
			//��������ֵ��Ϊ����������С������
			String[] partStrings = numberEntering.split("\\.");  //��С����Ϊ�߻�������������С������
		    integerPart = Integer.parseInt(partStrings[0]);
		    String tempDecimal = "0."+partStrings[1];
		    decimalPart = Double.parseDouble(tempDecimal);
		    
		    //�����������������ֵĶ�����
		    tempNumberInteger = integerPart;
		    do {
		    	resultStringInteger = (tempNumberInteger%2) + resultStringInteger;
		    	tempNumberInteger /=2; 
 			} while (tempNumberInteger>0);
		    //resultStringInteger = 1+resultStringInteger;
		    
			//����������С�����ֵĶ�����
			//��������ֵ���е�һ�γ�2����
			tempNumberDecimal = decimalPart*2;
			
			//ʹ��whileѭ������ֵ���м��㣬��ü�����
			while(tempNumberDecimal !=0) {  //������ֵ��Ϊ0ʱ����ѭ��������ֹͣѭ��
				if(tempNumberDecimal >=1) {  //����ֵ����1��ȡֵ1���������1����ȡ��С������
					resultStringDecimal +=1;
					tempNumberDecimal -=1;
				}
				else {
					resultStringDecimal +=0; //����ֵС��1ʱ��ȡֵ0����ֱ��ȡ��С������
				}
				//System.out.println(resultString);
				tempNumberDecimal =tempNumberDecimal *2;  //������ֵС�����ּ�������2�Խ�����һ������
			}
			System.out.println(resultStringInteger + "." + resultStringDecimal);
			
			//Ҫ���û�ȷ���Ƿ��������������ֵ
			System.out.println("Do you want to try another number? yes/no");
			Scanner conScanner = new Scanner(System.in);
			String conQuit = conScanner.next();
			if(conQuit.equals("no")) {
				yesQuit = false;
			}
		} while (yesQuit);
	}

}
