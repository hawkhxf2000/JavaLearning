package IfStatementPractices;
import java.util.Scanner;

public class IfStatementPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean isContinue = true;  //初始化用于控制do-while循环的条件变量
		double numberInput;  //定义double变量，储存输入数值
		
		//在console提示输入数值
		do {
			System.out.print("Please enter a number:");
			Scanner sc = new Scanner(System.in);
		
			//使用try-catch处理可能出现的输入非数字的异常
		try {
			numberInput = sc.nextDouble();
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("您的输入中含有非数字值，请重试！");
			continue;
		}
		
		
		//判断输入数值正负或0
		if (numberInput < 0.0){
			System.out.println("The number input is negative!");
		}
		if(numberInput >0.0) {
			System.out.println("THe number input is positive!");
		}
		if(numberInput == 0.0){
			System.out.println("THe number input is zero!");
		}
		
		if(Math.abs(numberInput) < 1.0) {
			System.out.println("The number input is small");
		}
			
			if(Math.abs(numberInput) >1000000) {
				System.out.println("The number input is large");
		}
		
		//提示是否需要再次输入数字，如果选择为no则跳出do-while循环
		System.out.println("Do you want to continue? yes/no");
		String conditionQuit = sc.next();  
		if(conditionQuit.equals("no")) {
			isContinue = false;
		}
		
		}while(isContinue);
	}

}
