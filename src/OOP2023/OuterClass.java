/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OOP2023;


/**
 *
 * @author ASUS
 */
public class OuterClass {
    public String code = "code";
    public static int count = 0;
    
    public OuterClass(){
        count++;
        System.out.println("Object created : " + count);
        
    }
    
    class InnerClass{
        public void code(String kode){
            code = kode;
            System.out.println("code method from InnerClass access Outer Class Variable : " + code);
        }
    }
    
    static class StaticNestedClass{
        OuterClass out; //deklarasikan nama kelas yang terdapat variabel static >> OuterClass
        public void add(int a){
            out.count = count + a;
            System.out.println("Static Counter after added : " + out.count);
        }
        
        
    }
    
    public static void main(String[] args) {
        OuterClass OuterObj =  new OuterClass();
        InnerClass InnerObj = OuterObj.new InnerClass();
        StaticNestedClass  StaticObj = new OuterClass.StaticNestedClass();
        
        InnerObj.code("kode alam");
        StaticObj.add(3);
    }
    
}
