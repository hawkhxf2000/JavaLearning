package DecimalConvertor;

public class Convertor {
	
	private String numberEnteringString;  //定义一个私有字符变量
	private int operator;
	
	//自定义构造器
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
		
		//用户可能输入整数，会导致小数部分为空，后续数据处理会出现运算错误。下面这个语句会将输入的数据转化为double型，以保证输入数据能够带有小数位。
		//For example, 如果用户输入1234，通过下面赋值会将其更改为1234.0，可以保证后续数据处理不出现运行错误。
		double numberEntering = Double.parseDouble(numberEnteringString); 
		
		
		//将输入数值分为整数部分与小数部分
		String[] partStrings = String.valueOf(numberEntering).split("\\.");  //以小数点为线划分整数部分与小数部分
	    integerPart = Integer.parseInt(partStrings[0]);
	    String tempDecimal = "0."+partStrings[1];
	    decimalPart = Double.parseDouble(tempDecimal);
	    
	    //下面代码将整数部分转换为相应进制
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
	    
	  //下面代码计算小数部分的二进制
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
			
			//求余数，将其作为下一次运算的基数
			tempNumberDecimal = tempNumberDecimal-(1/Math.pow((double)operator, i))*reminder;
			
			//operator *=operator;  //operator自乘一次，增加一次幂
			i++; //i用于控制输入位数，避免出现一直除不尽的结果
			if(i>20) {
				break;
			}
		} while (tempNumberDecimal > 0);
	    
	    //判断结果的小数部分是否为0，如果为0，直接输出整数部分，否则输出整体
	    if (resultStringDecimal.equals("0")) {
	    	return resultStringInteger;
	    }
	    return resultStringInteger + "." + resultStringDecimal; 
	}
}
