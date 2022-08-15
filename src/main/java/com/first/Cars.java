package com.first;

/**
 * @author : ugochukwuobia
 * email : ugochukwu.obia@teamapt.com
 * date : 15/08/2022
 **/


public class Cars extends Object{

    public Cars(){}

  private String name ;

  private String model;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                '}';
    }

    //to String equals
}
