package Modul12;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
public class DemoTextField {
    public static void main(String[] args) {
        Utama u = new Utama();
        JLabel nama = new JLabel("Nama : ");
        JLabel password = new JLabel("Password : ");
        JTextField inputNama = new JTextField(15);
        JTextField inputpsw = new JTextField(15);
        JPanel panel = new JPanel();
        panel.add(nama);
        panel.add(inputNama);
        panel.add(password);
        panel.add(inputpsw);
        u.add(panel);
    }
}
