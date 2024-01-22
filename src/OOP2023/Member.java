/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP2023;

/**
 *
 * @author ASUS
 */
public abstract class Member {
    abstract void presence();
    abstract void information();
    
    public void park(){
        System.out.println("this park method");
    }
    
    
    class ImplementMember extends Member{
        @Override // wajib overide atau mengisi method dari abstract class!
        void presence(){
            System.out.println("Implement Abstract Class Member >>  method presence");
        } 
        
        void information(){
            System.out.println("Implement Abstract Class Member >> method information");
        }
        
    }
    
    
}
