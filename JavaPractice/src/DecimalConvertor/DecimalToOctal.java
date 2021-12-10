package DecimalConvertor;

public class DecimalToOctal {
	
	private String numberEnteringString;  //定义一个私有字符变量
	
	//定义构造器
	public DecimalToOctal(String numberEnteringString) {
		this.numberEnteringString = numberEnteringString;
	}
	
	//定义转换方法
	public String OctalConvertor() {
		String resultStringDecimal = "", resultStringInteger = "";
		int integerPart;
		int	tempNumberInteger;
		double tempNumberDecimal;
		double decimalPart = 0.0;
		double numberEntering = Double.parseDouble(numberEnteringString);
		
		
		//将输入数值分为整数部分与小数部分
		String[] partStrings = String.valueOf(numberEntering).split("\\.");  //以小数点为线划分整数部分与小数部分
	    integerPart = Integer.parseInt(partStrings[0]);
	    String tempDecimal = "0."+partStrings[1];
	    decimalPart = Double.parseDouble(tempDecimal);
	    
	    //下面代码将整数部分转换为八进制
	    tempNumberInteger = integerPart;
	    do {
	    	resultStringInteger = (tempNumberInteger%8) + resultStringInteger;
	    	tempNumberInteger /=8; 
			} while (tempNumberInteger>0);
	    
	  //下面代码计算小数部分的二进制
	    tempNumberDecimal = decimalPart;
	    int reminder,i=1;
	    do {
			reminder = (int) Math.floor(tempNumberDecimal/(1/Math.pow(8.0, i)));
			tempNumberDecimal = tempNumberDecimal-(1/Math.pow(8.0, i))*reminder;
			resultStringDecimal =resultStringDecimal+reminder;
			i++;
		} while (tempNumberDecimal > 0);
	    
	    //判断结果的小数部分是否为0，如果为0，直接输出整数部分，否则输出整体
	    if (resultStringDecimal.equals("0")) {
	    	return resultStringInteger;
	    }
	    return resultStringInteger + "." + resultStringDecimal; 
	}
	
	

}
