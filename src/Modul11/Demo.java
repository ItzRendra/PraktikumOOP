package Modul11;

// import Modul11.NestedClass.StaticNestedClass;

public class Demo {
    public static void main(String[] args) {
        NestedClass nc = new NestedClass();
        nc.printNama();
        NestedClass.StaticNestedClass snc = new NestedClass.StaticNestedClass();
        snc.printJur();
        snc.printOuter();
        NestedClass.InnerClass ic = nc.new InnerClass();
        ic.printStatic();


    }
}
