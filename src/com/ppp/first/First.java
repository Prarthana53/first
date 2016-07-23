/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ppp.first;

/**
 *
 * @author prarthanapradhan
 */

public class First {
    int puppyage;
    public First(String name){
    System.out.println("My dog's name is:" + name);
    }
    public void setage(int age){
    puppyage=age;}
    public int getage()
    {
    System.out.println("Guddu'd age is: " + puppyage);
    return puppyage;
    }
    
    public static void main(String[] args) {
        First myFirst= new First("Guddu");
        myFirst.setage(4);
        myFirst.getage();
        System.out.println("variable value: " + myFirst.puppyage);
     
    }
    
}

   
   