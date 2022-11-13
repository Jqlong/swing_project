package com.jiang.student;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutTest extends JFrame {

    JButton jButton = new JButton("北边的按钮");
    JLabel jLabel = new JLabel("标签");
    JRadioButton jRadioButton = new JRadioButton("男");
    JTextArea jTextArea = new JTextArea("输入内容",10,20);
    JButton center = new JButton("中间按钮");


    public BorderLayoutTest(){
        super("测试边界布局");
        Container container = getContentPane();

        //默认是BorderLayout布局,划分五个区域
        container.setLayout(new BorderLayout());
        container.add(jButton,BorderLayout.NORTH);
        container.add(jLabel,BorderLayout.SOUTH);
        container.add(jRadioButton,BorderLayout.WEST);
        container.add(jTextArea,BorderLayout.EAST);
        container.add(center, BorderLayout.CENTER);


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
