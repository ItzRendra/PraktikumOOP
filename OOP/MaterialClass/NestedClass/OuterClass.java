package MaterialClass.NestedClass;

public class SepedaMotor {
    String merk;
    int gear = 0;

    interface interfaceSepedaMotor{
        void tambahGear();
        void kurangGear();
    }

    static class SepedaMotorSport extends SepedaMotor implements interfaceSepedaMotor{
        public SepedaMotorSport(String merk){
            this.merk = merk;
            this.gear = 0;
        }
    }

    public void tambahGear(){
        gear = gear + 1;
    }
}
