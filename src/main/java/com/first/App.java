package com.first;

/**
 * @author : ugochukwuobia
 * email : ugochukwu.obia@teamapt.com
 * date : 30/07/2022
 **/
public class App {


    public static void main(String[] args) {
        byte name = 0;
        char stream = 'r';


        int number = 8;
        long money = 100l;
        double hok = 100.8;
        float gy = 9;
        short hant = 50;
//memory heap memory references
        boolean naw = true;//false
        //primitive == no reference
        //pass by value
        // pass by reference

        System.out.println(hant);
        Cars car1 = new Cars();
        Cars car2 = new Cars();
        car2.setModel("Camry");
        car2.setName("Toyota");

        car1.setModel("Accord");
        car1.setName("Honda");
        Cars car3 = new Cars();
        car3 = car2;

        System.out.println(car1.toString());
        System.out.println(car2.toString());
        System.out.println(car3);

    } //reference

  //OBJECTS METHODS(BEHAVIOUR) FIELD(ATTRIBUTES)

    //OBJECT : METHODS FIELDS

    //FUNCTION ACTION FIELDS ATTRIBUTE

    //PUT IT ALL TOGETHER


    //OBJECTS : POLYMORHISM INHERITANCE OVERLOADING OVERRIDING TYPES OF OBJECTS


    //OBJECT ADAM - HUMANS
    //JAVA CLASS - Object REFERENCE

    //PRIMITIVE OR A REFERENCE
    //8 TYPES OF PRMIMITVE


    //OBJECTS

}
