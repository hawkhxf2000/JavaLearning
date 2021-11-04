package DecimalConvertor;

public class NumberConvertToBase10 {
	public String numberConvert(String numberToConvert, double format) {
		String numberBase10String;  //定义字符串变量，储存转换为10进制的数值
		String integerPart, decimalPart; //定义两个字符串变量，用于储存整数部分和小数部分数值
		
		//将输入的数值字符串按"."分割为整数部分与小数部分,如果输入数值字符串中没有".",则将decimalPart设置为0
		if (!numberToConvert.contains(".")) {
			integerPart = numberToConvert;
			decimalPart = "0";
			
		}
		
		else {
		String[] partStrings = numberToConvert.toUpperCase().split("\\.");  //将输入数值转换为大写，以小数点为线划分整数部分与小数部分
	    integerPart = partStrings[0];
	    decimalPart = partStrings[1];}
	    	    
	    //下面代码将整数部分转换为10进制
	    //将整数部分转换为StringBuilder对象，以便进行reverse操作
		StringBuilder sbNumber =  new StringBuilder(integerPart);
		String sbNumbernew = sbNumber.reverse().toString();
		int numberInteger  = 0;  //初始化整数部分
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
		
		
		//下面代码将小数部分转换为10进制
		double numberDecimal  = 0.0;  //初始化整数部分
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
