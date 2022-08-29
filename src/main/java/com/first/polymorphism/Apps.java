package com.first.polymorphism;

/**
 * @author : ugochukwuobia
 * email : ugochukwu.obia@teamapt.com
 * date : 22/08/2022
 **/
public class Apps {


    public static void main(String[] args) {


        //POLYMORHISM IN JAVA

        //OVERLOADING METHODS

        //DIFFERENT METHOD SIGNATURE
        //water ice solid liquid gas steam ice water

        //early binding late binding in java polymorphism
        sum(3,8);
        sum(8,9,6);
        sum(4,5,6,6);
        sum(5,6,7,8);

    }

    //reflection java
    public static Integer sum(int a, int b){
        return a * b;
    }

    public static Integer sum(int a, int b, int c){
        return a * b * c;
    }

    public static double sum(int a, int b, int c, int d){
        return a * b * c;
    }

    public static Long sum(int a, int b, int c, double d){
        return Long.valueOf(a * b * c);
    }
}
