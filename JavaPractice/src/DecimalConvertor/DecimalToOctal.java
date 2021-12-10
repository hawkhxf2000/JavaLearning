package DecimalConvertor;

public class DecimalToOctal {
	
	private String numberEnteringString;  //����һ��˽���ַ�����
	
	//���幹����
	public DecimalToOctal(String numberEnteringString) {
		this.numberEnteringString = numberEnteringString;
	}
	
	//����ת������
	public String OctalConvertor() {
		String resultStringDecimal = "", resultStringInteger = "";
		int integerPart;
		int	tempNumberInteger;
		double tempNumberDecimal;
		double decimalPart = 0.0;
		double numberEntering = Double.parseDouble(numberEnteringString);
		
		
		//��������ֵ��Ϊ����������С������
		String[] partStrings = String.valueOf(numberEntering).split("\\.");  //��С����Ϊ�߻�������������С������
	    integerPart = Integer.parseInt(partStrings[0]);
	    String tempDecimal = "0."+partStrings[1];
	    decimalPart = Double.parseDouble(tempDecimal);
	    
	    //������뽫��������ת��Ϊ�˽���
	    tempNumberInteger = integerPart;
	    do {
	    	resultStringInteger = (tempNumberInteger%8) + resultStringInteger;
	    	tempNumberInteger /=8; 
			} while (tempNumberInteger>0);
	    
	  //����������С�����ֵĶ�����
	    tempNumberDecimal = decimalPart;
	    int reminder,i=1;
	    do {
			reminder = (int) Math.floor(tempNumberDecimal/(1/Math.pow(8.0, i)));
			tempNumberDecimal = tempNumberDecimal-(1/Math.pow(8.0, i))*reminder;
			resultStringDecimal =resultStringDecimal+reminder;
			i++;
		} while (tempNumberDecimal > 0);
	    
	    //�жϽ����С�������Ƿ�Ϊ0�����Ϊ0��ֱ������������֣������������
	    if (resultStringDecimal.equals("0")) {
	    	return resultStringInteger;
	    }
	    return resultStringInteger + "." + resultStringDecimal; 
	}
	
	

}
