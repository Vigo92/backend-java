package com.first.shapes;

/**
 * @author : ugochukwuobia
 * email : ugochukwu.obia@teamapt.com
 * date : 15/08/2022
 **/
public class AppShape {


    public static void main(String[] args) throws Exception {
        Circle circle = new Circle();
        Square square = new Square();
        Rectangle rectangle = new Rectangle();

        System.out.println(circle.area(21));
        System.out.println(circle.name());
        System.out.println(rectangle.area(5,4));
        System.out.println(rectangle.name());
        System.out.println(square.area(8,6));
        System.out.println(square.name());

    }
}
