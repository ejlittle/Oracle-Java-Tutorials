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
public class OOPConcepts {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p1 = new Person();
        
        p1.setHeight(71);
        p1.setWeight(175);
        p1.setName("Eric Little");
        p1.introduce();
    }
}
