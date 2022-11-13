package com.jiang.student;

import javax.swing.*;
import java.awt.*;

public class FlowLayoutTest extends JFrame {

    JPanel jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 80,30));  //面板,默认流布局方法FlowLayout
    JButton jButton1 = new JButton("测试按钮一");
    JButton jButton2 = new JButton("测试按钮二");
    JButton jButton3 = new JButton("测试按钮三");
    JButton jButton4 = new JButton("测试按钮四");
    JButton jButton5 = new JButton("测试按钮五");

    //构造方法
    public FlowLayoutTest(){
        super("流布局测试界面");
        Container container = getContentPane();

        jPanel.add(jButton1);
        jPanel.add(jButton2);
        jPanel.add(jButton3);
        jPanel.add(jButton4);
        jPanel.add(jButton5);
        container.add(jPanel); //默认中间位置


        setSize(400,200);
        setLocationRelativeTo(null); //居中
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }


    public static void main(String[] args) {
        new FlowLayoutTest();
    }
}
