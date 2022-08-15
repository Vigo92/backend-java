package com.first.shapes;

/**
 * @author : ugochukwuobia
 * email : ugochukwu.obia@teamapt.com
 * date : 15/08/2022
 **/
public class Circle extends Shapes{


    public int area(int length, int breadth) throws Exception {
        throw new Exception("Circle doesn't have a lenght and breadth");
    }

    public int area(int radius) {
        return (22/7) * radius;
    }

    public String name() {
        return "Circle";
    }
}
