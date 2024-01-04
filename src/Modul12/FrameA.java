package Modul12;
import java.awt.Container;
import javax.swing.JButton;
public class FrameA extends javax.swing.JFrame{
    public FrameA(){
        super("Frame dan Button");
        setSize(100, 50);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }
    public static void main(String[] args) {
        FrameA fa = new FrameA();
        Container kontainer = fa.getContentPane();
        JButton jbtOK = new JButton("BEGITU");
        kontainer.add(jbtOK);
    }
}
