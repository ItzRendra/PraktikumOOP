package MaterialClass;

public class MyProject {
    double width, height;
    // MyProject(double width, double height){
    //     this.height = height;
    //     this.width = width;
    // }

    void Luas(double width, double height) {
        System.out.println("Luasnya Adalah : " + (width * height));
    }

    void Keliling(double width, double height) {
        System.out.println("Kelilingnya Adalah : " + (2*(width + height)));
    }

    public static void main(String[] args) {
        MyProject B1 =  new MyProject();
        MyProject B2 = new MyProject();

        B1.Luas(3.0, 4.0);
        B1.Keliling(3.0, 4.0);
        B2.Luas(1.0, 2.58);
        B2.Keliling(1.0, 2.58);
    }
}
