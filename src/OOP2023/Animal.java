/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP2023;

/**
 *
 * @author ASUS
 */
public class Animal {
    
    public String sound(String a){ //non-void method with parameterized
        return a + "Make a sound";
    }
    
    public int getWeight(int bb){
        return 2*bb;
    }
    
    class Cat extends Animal{
    @Override // overide non-void method parameterized
    public String sound(String a){
        return "meow";
    }
    
    public int getWeight(int bb){
        return bb;
    }
    }
    
}
