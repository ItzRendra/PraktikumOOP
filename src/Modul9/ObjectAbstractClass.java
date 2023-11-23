package Modul9;

public class ObjectAbstractClass {
    public static void main(String[] args) {
        //AbstrakClass ac = new AbstrakClass(2,3,4);
        ChildAbstrakClass cac =  new ChildAbstrakClass(2, 3, 2);
        cac.printX();
        System.out.println(cac.kali());
    }
}
