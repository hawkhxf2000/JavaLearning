
import java.util.Scanner;
//import java.util.concurrent.ConcurrentHashMap;     //����ط����������һ���࣬����Ҫ��ֱ��ע�͵���ɾ��

 

public class Vroom {

 

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("*** Welcome to Vroom ! ***");
        System.out.println("Buy or rent a car? Enter B for buying, R for renting. ");
        Scanner myKeyboard = new Scanner(System.in);
        //int daysToRent=myKeyboard.nextInt();         //�˴��ͻ���������ĸB����R����nextInt�����޷�������֣�����������ʱ�ᱨ��
        //Double totalRent;
        double totalRent = 0;               //Double��һ��class, ��double����ԭʼ��������(Primitive variable), ����������Ҫ���г�ʼ����ֵ   
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
        
        int daysToRent=myKeyboard.nextInt();    //�����daysToRentӦ�÷ŵ���������������ǰ����ʾ

        

 

        if (daysToRent>0)

        {

        totalRent=3.5*Math.pow(daysToRent,2.0)/2;

 

        System.out.println("Total rent is: C$ "+ totalRent);  //ǰ���totalRent��Ҫ��ʼ����ֵ
        }                                                     //������Ҫ�����������{}������
 

        if (daysToRent<=0)
            System.out.println("Number of days can't be zero or negative ! ");
        
        }
        break;
        
        //default: System.out.println(" You didn't enter B or R and we don't offer any services ! ";}
         default: System.out.println(" You didn't enter B or R and we don't offer any services ! ");}  //�˴�ȱ����һ�� )
 

        System.out.println("Bye!!");
        myKeyboard.close();                    //����仰�رյ�ϵͳ���룬�����ڴ�й¶
}

 

}