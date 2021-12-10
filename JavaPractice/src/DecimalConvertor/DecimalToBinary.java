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
		
		
		//将输入数值分为整数部分与小数部分
		String[] partStrings = numberEntering.split("\\.");  //以小数点为线划分整数部分与小数部分
	    integerPart = Integer.parseInt(partStrings[0]);
	    String tempDecimal = "0."+partStrings[1];
	    decimalPart = Double.parseDouble(tempDecimal);
	    
	    //下面代码计算整数部分的二进制
	    tempNumberInteger = integerPart;
	    do {
	    	resultStringInteger = (tempNumberInteger%2) + resultStringInteger;
	    	tempNumberInteger /=2; 
			} while (tempNumberInteger>0);
	    //resultStringInteger = 1+resultStringInteger;
	    
		//下面代码计算小数部分的二进制
		//对输入数值进行第一次乘2计算
		tempNumberDecimal = decimalPart*2;
		
		//使用while循环对数值进行计算，获得计算结果
		while(tempNumberDecimal !=0) {  //当计算值不为0时进行循环，否则停止循环
			if(tempNumberDecimal >=1) {  //计算值大于1，取值1，并将其减1，以取其小数部分
				resultStringDecimal +=1;
				tempNumberDecimal -=1;
			}
			else {
				resultStringDecimal +=0; //计算值小于1时，取值0，并直接取其小数部分
			}
			//System.out.println(resultString);
			tempNumberDecimal =tempNumberDecimal *2;  //将计算值小数部分继续乘以2以进行下一步甲酸
		}
		
		//判断结果的小数部分是否为0，如果为0，直接输出整数部分，否则输出整体
	    if (resultStringDecimal.equals("0")) {
	    	return resultStringInteger;
	    }
	    return resultStringInteger + "." + resultStringDecimal; 
	}
	
}
