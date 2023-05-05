package AJ10.Project3_Exception_Practice;

import java.util.*;
import java.io.*;

class Divide {

    public static void main(String[] args) {

        //#4
        double quotient = divide(50,0);
    }

    private static double divide(int num1, int num2){
        double answer = num1 / num2;
        return answer;
    }

}