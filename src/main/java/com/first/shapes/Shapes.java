package com.first.shapes;

/**
 * @author : ugochukwuobia
 * email : ugochukwu.obia@teamapt.com
 * date : 15/08/2022
 **/
public abstract class Shapes {
      //abstract information
    int length;

    int breadth;

    int radius;


    public abstract int area(int length , int breadth) throws Exception;

    public abstract int area(int radius) throws Exception;

    public abstract String name();


}
