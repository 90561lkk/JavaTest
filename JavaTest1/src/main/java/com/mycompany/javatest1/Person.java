/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.javatest1;

/**
 *
 * @author willi
 */
public class Person {
    private String name;
    private int age;
    
    public Person(String initialName){
        this.age=0;
        this.name=initialName;
    }
    
    public void display(){
        System.out.print(name+"age is "+age);
    }
}
