package Modul12;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TugasJComboBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Tugas 1");
        String[] items = {"Sangat tidak setuju", "Tidak Setuju",
                "Kurang Setuju", "Setuju", "Sangat Setuju"};
        JLabel labelan = new JLabel("Modul Praktikum Pemrograman Beriorientasi Objek");
        JComboBox<String> combo = new JComboBox<>(items);
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Ubah Warna");
        ButtonGroup buttonGroup = new ButtonGroup();
        JRadioButtonMenuItem red = new JRadioButtonMenuItem("Merah");
        JRadioButtonMenuItem green = new JRadioButtonMenuItem("Hijau");
        JRadioButtonMenuItem yellow = new JRadioButtonMenuItem("Kuning");
        JPanel panel = new JPanel();
        // Create a panel for the combo box and label
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());
        topPanel.add(labelan);
        topPanel.add(combo);

        // Add the combo box and label panel to the NORTH of the frame
        frame.add(topPanel, BorderLayout.NORTH);

        // Create a panel for the color options
        JPanel colorPanel = new JPanel();
        colorPanel.setLayout(new FlowLayout());
        colorPanel.add(red);
        colorPanel.add(green);
        colorPanel.add(yellow);

        // Add the panel for color changes to the CENTER of the frame
        frame.add(panel, BorderLayout.CENTER);
        red.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                panel.setBackground(new java.awt.Color(255, 0, 0));
            }
        });
        green.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                panel.setBackground(new java.awt.Color(0, 255, 0));
            }
        });
        yellow.addItemListener(e -> {
            if (e.getStateChange() == ItemEvent.SELECTED) {
                panel.setBackground(new java.awt.Color(255, 255, 0));
            }
        });
        frame.setSize(600, 300); // Adjusted frame height for better visibility
        buttonGroup.add(red);
        buttonGroup.add(green);
        buttonGroup.add(yellow);
        menu.add(red);
        menu.add(green);
        menu.add(yellow);
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
