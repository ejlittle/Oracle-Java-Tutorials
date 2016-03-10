/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oopconcepts;

/**
 *
 * @author ericlittle
 */
public class Person {
    int height = 72;
    int weight = 180;
    String name = "John Doe";
    
    void setHeight(int newValue) {
        height = newValue;
    }
    
    void setWeight(int newValue) {
        weight = newValue;
    }
    
    void setName(String newValue) {
        name = newValue;
    }
    
    void introduce() {
        System.out.println(
            "Hello.  My name is " + name + ". " + 
            "I weigh " + weight + " pounds. " + 
            "I am " + height + " inches tall."
        );
    }
}
