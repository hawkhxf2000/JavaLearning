package DecimalConvertor;

public class DecimalToBinary {
	private String numberEntering;
	
	public DecimalToBinary(String numberEntering) {
		this.numberEntering = numberEntering;
	}
	
	public String binaryConvertor() {
		
		String resultStringDecimal = "", resultStringInteger = "";
		int integerPart;
		int	tempNumberInteger;
		double tempNumberDecimal;
		double decimalPart = 0.0;
		
		
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
		
		//�жϽ����С�������Ƿ�Ϊ0�����Ϊ0��ֱ������������֣������������
	    if (resultStringDecimal.equals("0")) {
	    	return resultStringInteger;
	    }
	    return resultStringInteger + "." + resultStringDecimal; 
	}
	
}
