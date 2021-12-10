
import java.util.Scanner;
//import java.util.concurrent.ConcurrentHashMap;     //这个地方是你误导入的一个类，不需要，直接注释掉或删除

 

public class Vroom {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("*** Welcome to Vroom ! ***");
        System.out.println("Buy or rent a car? Enter B for buying, R for renting. ");
        Scanner myKeyboard = new Scanner(System.in);
        //int daysToRent=myKeyboard.nextInt();         //此处客户会输入字母B或者R，用nextInt方法无法获得数字，所以在运行时会报错
        //Double totalRent;
        double totalRent = 0;               //Double是一个class, 而double才是原始数据类型(Primitive variable), 而且这里需要进行初始化赋值   
        String msg = myKeyboard.next();
        switch(msg.charAt(0))
        {
        case 'B':
        case 'b':

 

            System.out.println(" So you're here to Buy ! ");
            System.out.println("We have three different cars available:  ");
            System.out.println("1- Toyota, 12k  ");
            System.out.println("2- Ford, 25k  ");
            System.out.println("3- Ferrari, 100k  ");
            System.out.println("Which one you want ?  ");

 

            int x=myKeyboard.nextInt();

 

            switch(x)
            {
            case 1:

 

                System.out.println(" You got the Toyota !");
                break;

 

            case 2:
                System.out.println(" You got the Ford! ");
                break;

 

            case 3:
                System.out.println(" You got the Ferrari !");
                break;

 

            default:
                System.out.println("Oops!  We don't have that option! ");
            }
            break;

 

         case 'R': 
         case 'r':

 

        {
        System.out.println("So you're here to Rent !");

 


        System.out.println("How many days do you need a car ? ");
        
        int daysToRent=myKeyboard.nextInt();    //上面的daysToRent应该放到这里来，紧跟着前面提示

        

 

        if (daysToRent>0)

        {

        totalRent=3.5*Math.pow(daysToRent,2.0)/2;

 

        System.out.println("Total rent is: C$ "+ totalRent);  //前面的totalRent需要初始化赋值
        }                                                     //这里需要将两个语句用{}括起来
 

        if (daysToRent<=0)
            System.out.println("Number of days can't be zero or negative ! ");
        
        }
        break;
        
        //default: System.out.println(" You didn't enter B or R and we don't offer any services ! ";}
         default: System.out.println(" You didn't enter B or R and we don't offer any services ! ");}  //此处缺少了一个 )
 

        System.out.println("Bye!!");
        myKeyboard.close();                    //用这句话关闭掉系统输入，避免内存泄露
}

 

}