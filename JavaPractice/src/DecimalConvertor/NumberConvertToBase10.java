package DecimalConvertor;

public class NumberConvertToBase10 {
	public String numberConvert(String numberToConvert, double format) {
		String numberBase10String;  //�����ַ�������������ת��Ϊ10���Ƶ���ֵ
		String integerPart, decimalPart; //���������ַ������������ڴ����������ֺ�С��������ֵ
		
		//���������ֵ�ַ�����"."�ָ�Ϊ����������С������,���������ֵ�ַ�����û��".",��decimalPart����Ϊ0
		if (!numberToConvert.contains(".")) {
			integerPart = numberToConvert;
			decimalPart = "0";
			
		}
		
		else {
		String[] partStrings = numberToConvert.toUpperCase().split("\\.");  //��������ֵת��Ϊ��д����С����Ϊ�߻�������������С������
	    integerPart = partStrings[0];
	    decimalPart = partStrings[1];}
	    	    
	    //������뽫��������ת��Ϊ10����
	    //����������ת��ΪStringBuilder�����Ա����reverse����
		StringBuilder sbNumber =  new StringBuilder(integerPart);
		String sbNumbernew = sbNumber.reverse().toString();
		int numberInteger  = 0;  //��ʼ����������
		for (int i = 0; i < integerPart.length(); i++) {
			int numberNow;
			
			switch (sbNumbernew.charAt(i)) {
			case 'A': {				
				numberNow = 10;
			}
			case 'B': {				
				numberNow = 11;
			}
			case 'C': {				
				numberNow = 10;
			}
			case 'D': {				
				numberNow = 10;
			}
			case 'E': {				
				numberNow = 10;
			}
			case 'F': {				
				numberNow = 10;
			}
			default:
				numberNow = Character.getNumericValue(sbNumbernew.charAt(i));
			}
			numberInteger += numberNow*(int)Math.pow(format, i);
		}
		
		
		//������뽫С������ת��Ϊ10����
		double numberDecimal  = 0.0;  //��ʼ����������
		for (int i = 0; i < decimalPart.length(); i++) {
			int numberNow;
			
			switch (decimalPart.charAt(i)) {
			case 'A': {				
				numberNow = 10;
			}
			case 'B': {				
				numberNow = 11;
			}
			case 'C': {				
				numberNow = 10;
			}
			case 'D': {				
				numberNow = 10;
			}
			case 'E': {				
				numberNow = 10;
			}
			case 'F': {				
				numberNow = 10;
			}
			default:
				numberNow = Character.getNumericValue(decimalPart.charAt(i));
			}
			numberDecimal += numberNow*Math.pow(format, -(i+1));
		}
		
		return numberBase10String = numberInteger +numberDecimal + "";
	}
}
