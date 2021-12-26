//---------------------------------------------------------------
// Assignment 2
// Written by: Xiao Feng Huang, 2195414
//FOr Programming Concepts 1 EQ2 - Fall 2021
//---------------------------------------------------------------

import java.util.*;
public class RandomPwd {
    public static void main(String[] args) {
        final String [][][] book={{{"","",""}},{{"","",""}},{{"","",""}}};


    }
    public static String pwdGenerator(){
        do { boolean isLegalPwd = false;
            int numPage = new Random().nextInt(book.length);
            int numParagraph =  new Random().nextInt(book[0].length);
            int numLine = new Random().nextInt(book[0][0].length);
//            System.out.println(numPage+" "+ numParagraph+" "+numLine);
            String stringLine = book[numPage][numParagraph][numLine];
            String[] word = stringLine.split(" ");
            int numPwd = new Random().nextInt(word.length);
            String pwd = word[numPwd];
        }while(isLegalPwd == true);
    }
}
