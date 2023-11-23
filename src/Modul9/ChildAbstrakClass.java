package Modul9;

public class ChildAbstrakClass extends AbstrakClass{
    int x;

    public ChildAbstrakClass(int a, int b, int c){
        super(a, b, c);
        x = a+b+c;
    }

    public void printX(){
        System.out.println(x);
    }
}
