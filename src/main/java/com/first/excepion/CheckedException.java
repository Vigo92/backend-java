package com.first.excepion;

import java.time.LocalDateTime;

/**
 * @author : ugochukwuobia
 * email : ugochukwu.obia@teamapt.com
 * date : 22/08/2022
 **/
public class CheckedException {

    public static void main(String[] args) {

        System.out.println(LocalDateTime.now().toString());
        int result = divide(10,0);
        System.out.println("Result : "+result);
    }


    // ArithmeticException IOException NullPointerException

    //CHECKED EXCEPTION
    // == UNCHECKED  == out of your control RuntimeException

    //10 000  == ERROR
//    ERROR HANDLING
//    EXCEPTION HANDLING
    // 20 000
// try - catch block

    public static int divide(int a, int b){
        int result = 0;
      //try {
          result =  a / b;
//      }
//      catch(ArithmeticException e){
//          System.out.println("You cannot divide by zero! Use a number.");
//      }
      return result;
    }
    //checked exception null
    public Double getNumber() throws NullPointerException{
        Double number = 6.9 ;

        return number * 2;
    }

   // compile time && runtime

}
