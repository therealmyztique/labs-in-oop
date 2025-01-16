/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.zoo;

/**
 *
 * @author LENOVO
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Zoo {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        ArrayList <Animal> zoo = new ArrayList <> ();
        
        boolean runProg = true;
        
        while (runProg){
            System.out.println("");
            System.out.println("=== Zoo Management System ===");
            System.out.println("1. Add Animal");
            System.out.println("2. View All Animals");
            System.out.println("3. Hear Animal Sounds");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            
            if (!sc.hasNextInt()){
                System.out.println("ERROR: Please enter a number.");
                sc.nextLine();
                continue;
                
            }
            
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice){
                
                case 1:
                    System.out.println("");
                    System.out.println("=== ADD ANIMALS ===");
                    Animal a = new Animal();
                    
                    while (true){
                        System.out.println("Enter name: ");
                        String name = sc.nextLine();

                        System.out.println("Enter species: ");
                        String species = sc.nextLine();

                        System.out.println("Enter age: ");
                        if (!sc.hasNextInt()){
                            System.out.println("ERROR: Please enter a number.");
                            sc.nextLine();
                            continue;
                        }
                        
                        int age = sc.nextInt();
                        sc.nextLine();
                        
                        if (age <= 0) {
                            System.out.println("ERROR: Age can not be negative");
                            continue;
                        }
                        
                        a.setName(name);
                        a.setSpecies(species);
                        a.setAge(age);
                        break;
                    }
                    zoo.add(a);
                    System.out.println("Animal added successfully!");
                    break;
                case 2:
                    System.out.println("");
                    if (zoo.size()<=0){
                        System.out.println("No animals entered.");
                    } else {
                        System.out.println("=== ANIMAL DETAILS ===");
                        for (Animal an: zoo){
                            System.out.println("Name: " + an.getName());
                            System.out.println("Species: " + an.getSpecies());
                            System.out.println("Age: " + an.getAge());
                            System.out.println("");
                        }
                    }
                    break;
                case 3:
                    System.out.println("");
                    if (zoo.size()<=0){
                        System.out.println("No animals to make a sound.");
                    } else {
                        for (Animal an: zoo){
                            System.out.println(an.getName() + " the animal mkes a generic sound!");
                        }
                    }
                    break;
                case 4:
                    runProg=false;
                    break;
                default:
                    System.out.println("ERROR: Invalid input.");
            }
            
        }
    }
}
