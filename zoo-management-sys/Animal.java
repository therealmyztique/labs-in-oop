/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoo;

/**
 *
 * @author LENOVO
 */
public class Animal {
    private String name;
    private String species;
    private int age;
    
    public void setName(String name){
        this.name=name;
    }
    
    public String getName (){
        return name;
    }
    
    public void setSpecies (String species){
        this.species = species;
        
    }
    
    public String getSpecies (){
        return species;
    }
    
    public void setAge (int age){
        if (age > 0){
            this.age=age;
        } else {
            System.out.println("ERROR: Less than zero.");
        }
    }
    
    public int getAge (){
        return age;
    }
}
