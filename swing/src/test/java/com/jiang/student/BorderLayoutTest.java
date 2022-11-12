package com.jiang.student;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest extends JFrame {

    public BorderLayoutTest(){
        super("测试边界布局");
        Container container = getContentPane();
        setSize(400, 200);
        setLocationRelativeTo(null); //居中
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {
        new BorderLayoutTest();
    }
}
