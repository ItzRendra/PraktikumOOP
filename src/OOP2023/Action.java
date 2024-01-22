/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package OOP2023;

/**
 *
 * @author ASUS
 */
public interface Action {
    public void move();
    
    interface Walk extends Action{
        public String[] directions = {"forward", "backward", "left", "right"};
        void speedUp();
}

    class Player implements Walk {
        
    public void move(){
        System.out.println("player is moving");
    }

    public void speedUp(){
        System.out.println("player is moving faster");
    }
    
    public void printDirections() {
        System.out.print("Directions: ");
        for(String dir : directions) {
            System.out.print(dir + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Player p =  new Player();
        p.move();
        p.speedUp();
        p.printDirections();
    }
    
}
}
