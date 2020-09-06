package com.codecode.simplesolutions;

import java.util.Stack;

public class Reverse {

    public static String reverseString(String string){
        Stack<Character> stack = new Stack<>();
        String reversedString = "";
        int ct = 0;

        while (true){
            try{
                stack.push(string.charAt(ct));
                ct++;
            }
            catch (StringIndexOutOfBoundsException exp){
                System.out.println(exp.getMessage() + " at reverseString method at Reverse class");
                System.out.println("Loop going to be break...");
                break;
            }
        }
        while (true){
            if (stack.isEmpty()){
                return reversedString;
            }
            reversedString += stack.pop();
        }
    }
}

class Program {
    public static void main(String[] args) {
        String name = "Hellow world!!!";
        System.out.println(Reverse.reverseString(name));

    }
}
