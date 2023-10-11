package Modul3;

public class VoidMethod {
int hour, minute, second;

public Void duration (int hour, int minute, int second){
    this.hour = hour; 
    this.minute = minute; 	
    this.second = second;
    return null;
}

void display(){
        System.out.println("Time is: "+hour+":"+minute+":"+second); }

public static void main(String[] args) {
    VoidMethod time1 = new VoidMethod();
    time1.duration(1, 30, 15);
    time1.display(); //creating object of the class and passing values to it's

}
}
