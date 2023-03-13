package Hito;

import jdk.internal.icu.text.UnicodeSet;
import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.*;
public class Hito1 extends JFrame
{
    public Hito1()
    {
        JFrame ventana = new JFrame("Ejercicio GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setLayout(new BorderLayout());

        //Panel norte
        JPanel panelNorte = new JPanel();
        panelNorte.setLayout(new FlowLayout());


        JCheckBox boton3 = new JCheckBox("Katniss");
        JCheckBox boton4 = new JCheckBox("Peeta");

        panelNorte.add(boton3);
        panelNorte.add(boton4);

        ventana.add(panelNorte, BorderLayout.NORTH);


        JPanel panelSur = new JPanel();
        JPanel panelCentro = new JPanel(new GridLayout(2, 2));

        //Panel este
        JPanel panelEste = new JPanel();
        panelEste.add(new JLabel());
        JRadioButton[] radioButtons = new JRadioButton[3];
        radioButtons[0] = new JRadioButton("OPT 1", true);
        radioButtons[1] = new JRadioButton("OPT 2");
        radioButtons[2] = new JRadioButton("OPT 3");
        ButtonGroup group = new ButtonGroup();
        panelEste.add(Box.createVerticalGlue());
        for (int i = 0; i < radioButtons.length; i++) {
            group.add(radioButtons[i]);
            panelEste.add(radioButtons[i]);
        }
        panelEste.add(Box.createVerticalGlue());
        panelEste.setLayout(new BoxLayout(panelEste, BoxLayout.Y_AXIS));


        panelEste.setPreferredSize(new Dimension(250, 0));

        for (int i = 0; i < 4; i++) {
            JLabel mesi =new JLabel(new ImageIcon("C:\\Users\\ik012982i9\\Desktop\\tours\\download.jpg"));
            panelCentro.add(mesi);
        }

        panelSur.setLayout(new BoxLayout(panelSur, BoxLayout.X_AXIS));
        panelSur.setSize(0,50);
        JButton boton1 = new JButton("BUT 1");
        JButton boton2 = new JButton("BUT 2");

        panelSur.add(boton1);
        panelSur.add(boton2);

        ventana.add(panelEste, BorderLayout.EAST);
        ventana.add(panelSur, BorderLayout.SOUTH);
        ventana.add(panelCentro, BorderLayout.CENTER);

        ventana.pack();
        ventana.setVisible(true);
    }
    public static void main(String[] args)
    {
        new Hito1();
    }
}