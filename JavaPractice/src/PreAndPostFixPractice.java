/* 
 Below is the Byte code compiled by command line javap. Every action of the code is described by the comments.
  public static void main(java.lang.String[]);
    Code:
       0: bipush        50                 //put a constant value 50 (in Octal format) into stack 
       2: istore_1						  // take out the value 50 from stack and assign to variable nb;
       3: iload_1						  //put the value of nb, 50, into operand stack
       4: iinc          1, 1			  // increase the variable nb by 1 in the Local Variables, it means nb=51 now
       7: iload_1						  // put the value of nb, 51, into operand stack
       8: iadd							  // execute the add operation in operand stack, it means 50+51=101
       9: istore_2						  // assign the calculating result, 101, to variable x;
       
       // below is the action of system.out.println
       
      10: getstatic     #7                  // Field java/lang/System.out:Ljava/io/PrintStream;
      13: iload_1
      14: iload_2
      15: invokedynamic #13,  0             // InvokeDynamic #0:makeConcatWithConstants:(II)Ljava/lang/String;
      20: invokevirtual #17                 // Method java/io/PrintStream.println:(Ljava/lang/String;)V
      23: return
      
    LineNumberTable:
      line 6: 0
      line 8: 3
      line 9: 10
      line 10: 23
    LocalVariableTable:
      Start  Length  Slot  Name   Signature
          0      24     0  args   [Ljava/lang/String;
          3      21     1    nb   I
         10      14     2     x   I
}
 */


public class PreAndPostFixPractice {

	public static void main(String[] args) {
		
		int nb=50;
		int x;
		x = nb++ + nb;
		System.out.println(nb + " " +x);
	}

}
