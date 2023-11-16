package Modul8;

public class DataDemo {
    public static void main(String[] args) {
        CustomerData cd0 = new CustomerData();
        CustomerData cd1 = new CustomerData("Raka");
        CustomerData cd2 = new CustomerData("Raka","Boyolali");
        CustomerData cd3 = new CustomerData("Joko","Semarang", "Guru");
        CustomerData cd4 = new CustomerData("Agus", "Solo", "Programmer", "30 Juni 2004");
        CustomerData cd5 = new CustomerData("doni","Klaten","Polisi", "30 Februari 2004",5000000);
        CustomerData cd6 = new CustomerData("anton", "Jakarta");
    }
}
