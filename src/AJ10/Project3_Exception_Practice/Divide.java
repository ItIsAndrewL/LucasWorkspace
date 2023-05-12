package AJ10.Project3_Exception_Practice;

import java.util.*;
import java.io.*;

class Divide {

    public static void main(String[] args) {

        //#4
        try{
            double quotient = divide(50,0);
        }catch(DivideByZero e){
            System.out.println("You cannot create a black hole.");
        }
    }

    private static double divide(int num1, int num2) throws DivideByZero{
        if(num2 == 0){
            //throw new DivideByZero();
        }
        double answer = num1 / num2;
        return answer;
    }

}