package DecimalConvertor;

public class Convertor {
	
	private String numberEnteringString;  //����һ��˽���ַ�����
	private int operator;
	
	//�Զ��幹����
	public Convertor(String numberEnteringString, int operator) {
		this.numberEnteringString = numberEnteringString;
		this.operator = operator;
	}
	public String Convert() {
		String resultStringDecimal = "", resultStringInteger = "";
		int integerPart;
		int	tempNumberInteger;
		double tempNumberDecimal;
		double decimalPart = 0.0;
		
		//�û����������������ᵼ��С������Ϊ�գ��������ݴ������������������������Ὣ���������ת��Ϊdouble�ͣ��Ա�֤���������ܹ�����С��λ��
		//For example, ����û�����1234��ͨ�����渳ֵ�Ὣ�����Ϊ1234.0�����Ա�֤�������ݴ����������д���
		double numberEntering = Double.parseDouble(numberEnteringString); 
		
		
		//��������ֵ��Ϊ����������С������
		String[] partStrings = String.valueOf(numberEntering).split("\\.");  //��С����Ϊ�߻�������������С������
	    integerPart = Integer.parseInt(partStrings[0]);
	    String tempDecimal = "0."+partStrings[1];
	    decimalPart = Double.parseDouble(tempDecimal);
	    
	    //������뽫��������ת��Ϊ��Ӧ����
	    tempNumberInteger = integerPart;
	    do {
	    	switch (tempNumberInteger%operator) {
			case 10: {				
				resultStringInteger = "A" + resultStringInteger;
				break;
			}
			
			case 11: {				
				resultStringInteger = "B" + resultStringInteger;
				break;
			}
			
			case 12: {				
				resultStringInteger = "C" + resultStringInteger;
				break;
			}
			
			case 13: {				
				resultStringInteger = "D" + resultStringInteger;
				break;
			}
			
			case 14: {				
				resultStringInteger = "E" + resultStringInteger;
				break;
			}
			
			case 15: {				
				resultStringInteger = "F" + resultStringInteger;
				break;
			}
			
			default:
				resultStringInteger = (tempNumberInteger%operator) + resultStringInteger;
			}
	    	
	    	tempNumberInteger /=operator; 
			} while (tempNumberInteger>0);
	    
	  //����������С�����ֵĶ�����
	    tempNumberDecimal = decimalPart;
	    int reminder, i=1;
	    do {
			reminder = (int) Math.floor(tempNumberDecimal/(1/Math.pow((double)operator,i)));
			switch (reminder) {
			case 10: {				
				resultStringDecimal = resultStringDecimal+"A";
				break;
			}
			
			case 11: {				
				resultStringDecimal = resultStringDecimal+"B";
				break;
			}
			
			case 12: {				
				resultStringDecimal = resultStringDecimal+"C";
				break;
			}
			
			case 13: {				
				resultStringDecimal = resultStringDecimal+"D";
				break;
			}
			
			case 14: {				
				resultStringDecimal = resultStringDecimal+"E";
				break;
			}
			
			case 15: {				
				resultStringDecimal = resultStringDecimal+"F";
				break;
			}
			
			default:
				resultStringDecimal =resultStringDecimal+reminder;
			}
			
			//��������������Ϊ��һ������Ļ���
			tempNumberDecimal = tempNumberDecimal-(1/Math.pow((double)operator, i))*reminder;
			
			//operator *=operator;  //operator�Գ�һ�Σ�����һ����
			i++; //i���ڿ�������λ�����������һֱ�������Ľ��
			if(i>20) {
				break;
			}
		} while (tempNumberDecimal > 0);
	    
	    //�жϽ����С�������Ƿ�Ϊ0�����Ϊ0��ֱ������������֣������������
	    if (resultStringDecimal.equals("0")) {
	    	return resultStringInteger;
	    }
	    return resultStringInteger + "." + resultStringDecimal; 
	}
}
