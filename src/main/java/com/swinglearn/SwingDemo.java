package com.swinglearn;

import javax.swing.*;

public class SwingDemo {
    SwingDemo() {

        JFrame jfrm = new JFrame("Simple Swing app");

        jfrm.setSize(275,100);

        jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel jlab = new JLabel("Interface programming with swing");

        jfrm.add(jlab);

        jfrm.setVisible(true);
    }

}
