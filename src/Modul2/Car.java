package Modul2;

public class Car {
    int cadence;
    int speed;
    int gear;
    
    void changeCendance (int cadenceCar){
        cadence = cadenceCar;
    }
    
    void speedUp (int speedCar){
        speed = speedCar;
    }
    
    void changeGear (int gearCar){
        gear = gearCar;
    
    }
    void infoCar(){
       System.out.println(
        "Speed : " + speed + "\n" + "Gear : " + gear + "\n" + "Cadance :" + cadence + "\n"
        );
    }
}

