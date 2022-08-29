package com.first.shapes;

/**
 * @author : ugochukwuobia
 * email : ugochukwu.obia@teamapt.com
 * date : 15/08/2022
 **/
public class Rectangle extends Shapes{

    //concrete IMPLEMENTATION
    public int area(int length, int breadth) throws Exception {
        return length * breadth;
    }

    public int area(int radius) throws Exception {
        throw new Exception("Circle doesn't have a lenght and breadth");
    }

    public String name() {
        return "Rectangle";
    }
}
