package Uas;

public interface Write {
    public void writting();
}

interface Read extends Write {
    public void reading();
}

class InterfaceDemo implements Read{

    public void writting(){
        System.out.println("implements wrting method");
    }

    public void reading(){
        System.out.println("implements reading method");
    }

    public void demo(){
        System.out.println("method from interfaceDemo class");
    }

    public static void main(String[] args) {
        InterfaceDemo demo = new InterfaceDemo();
        demo.writting();
        demo.reading();
        demo.demo();
    }
    
}

