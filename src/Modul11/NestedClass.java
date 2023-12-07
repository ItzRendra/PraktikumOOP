package Modul11;

public class NestedClass {
    String nama = "Raka";
    String nim = "L200224246";

    public void printNama(){
        System.out.println(nama + " : " + nim);
    }

    static class StaticNestedClass{
        static String jurusan = "informatika";
        public void printJur(){
            System.out.println("jurusan saya adalah "+ jurusan);
        }
        public void printOuter(){
        NestedClass o = new NestedClass();
        o.printNama();
        }
    }

    class InnerClass{
        public void printStatic(){
            NestedClass.StaticNestedClass s = new NestedClass.StaticNestedClass();
            s.printJur();
        }
    }
}
