/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_Pertanyaan_2;

/**
 *
 * @author Mayong Rasyid
 */
public class Person {
    
    public String name;
    public int age;
    
    
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public void printData(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
}


