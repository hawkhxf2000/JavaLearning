

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		String numberEntering;   //定义用于储存输入数值的变量字符串
		int integerPart;         //定义用于储存庸俗输入数值整数部分的变量
		int tempNumberInteger;   //定义用于临时储存整数计算部分的数据
		double decimalPart =0.0;     //定义用于储存用户输入数值小数部分的变量
		double tempNumberDecimal;       //定义用于储存计算过程中暂存数据的变量
		// 分别定义整数部分、小数部分与最终结果的字符串
		String resultStringInteger, resultStringDecimal;     
		boolean yesQuit = true;  //初始化用于判断是否退出程序的条件变量
		
		//使用do-while循环来进行多次数值输入与计算
		do {
			//在每次输入数值后初始化输出结果的字符串
			resultStringDecimal = ""; 
			resultStringInteger = "";
			//resultString = "";
			//要求用户输入数值
			System.out.println("Please enter a number:");
			Scanner in =  new Scanner(System.in);
			numberEntering =  in.next();
			
//			//对输入数值进行判断，如果数值不在0-1范围内，要求其重新输入
//			if (decimalPart >=1 || decimalPart<=0) {
//				System.out.println("the number is not between 0 and 1, please enter again!");
//				continue;
//			}
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
			System.out.println(resultStringInteger + "." + resultStringDecimal);
			
			//要求用户确认是否继续计算其他数值
			System.out.println("Do you want to try another number? yes/no");
			Scanner conScanner = new Scanner(System.in);
			String conQuit = conScanner.next();
			if(conQuit.equals("no")) {
				yesQuit = false;
			}
		} while (yesQuit);
	}

}
