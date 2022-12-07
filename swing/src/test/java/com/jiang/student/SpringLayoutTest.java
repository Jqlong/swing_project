package com.jiang.student;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.sql.Connection;

/**
 * 弹簧布局测试
 */
public class SpringLayoutTest extends JFrame {


    //设置JPanel布局管理器

    SpringLayout springLayout = new SpringLayout();
    JPanel jPanel = new JPanel(springLayout);

    JLabel titleLabel = new JLabel("文章标题");
    JTextField titleText = new JTextField();
    JLabel authorLabel = new JLabel("作者：");
    JTextField authorText = new JTextField();
    JLabel contentLabel = new JLabel("请输入内容：");
    JTextArea contText = new JTextArea(4, 10);


    public SpringLayoutTest(){
        super("弹簧布局SpringLayout");
        Container container = getContentPane();

        //添加组件
        jPanel.add(titleLabel);
        //设置大小
        titleText.setPreferredSize(new Dimension(150, 20));
        jPanel.add(titleText);
        jPanel.add(authorText);
        authorText.setPreferredSize(new Dimension(150, 20));
        jPanel.add(authorLabel);
        jPanel.add(contentLabel);
        jPanel.add(contText);
        contText.setPreferredSize(new Dimension(150, 50));
        jPanel.setBackground(Color.BLUE);
//        jPanel.add(author);
//        jPanel.add(name);
//        jPanel.add(contLabel);
//        jPanel.add(contentLabel);

        Spring titleLabelWidth = Spring.width(titleLabel);
        Spring titleTextWidth = Spring.width(titleText);
        Spring spaceWidth = Spring.constant(20);
        Spring childWidth = Spring.sum(Spring.sum(titleLabelWidth, titleTextWidth), spaceWidth);
        int offset = childWidth.getValue() / 2;


        /**
         * SpringLayout:布局管理器
         * SpringLayout.Constraints:使用弹簧布局的容器里面的组件的布局约束，每个组件对应一个
         * Spring:可以理解为一个能够进行四则运算的整数
         */
        SpringLayout.Constraints titleLabelC = springLayout.getConstraints(titleLabel);
        //titleLabelC.setX(Spring.constant(80));
        //水平居中
        springLayout.putConstraint(SpringLayout.WEST, titleLabel, -offset, SpringLayout.HORIZONTAL_CENTER, jPanel);
        titleLabelC.setY(Spring.constant(50));


        /*
            设置约束的一种方法，比较复杂
         */
        //设置标题文本框
        //titleText西边距离label的东边
        SpringLayout.Constraints titleTextCon = springLayout.getConstraints(titleText);
//        titleTextCon.setConstraint();
//        titleTextCon.setX();

        Spring constraint = titleLabelC.getConstraint(SpringLayout.EAST);
        titleTextCon.setConstraint(SpringLayout.WEST,Spring.sum(constraint,Spring.constant(20)));
        //设置北边 值一样
        titleTextCon.setConstraint(SpringLayout.NORTH,titleLabelC.getConstraint(SpringLayout.NORTH));


        /*
            设置约束的第二种写法，比价简单
            e1：要设置组建的哪个边界
            c1：要设置的组件
            pad：距离值
            e2：参照的组件的边界名
            c2：参照物（组件）
         */
        //设置作者Label:authorLabel ，东边和titleLabel对齐，北边距离titleLabel南边20px
        springLayout.putConstraint(SpringLayout.EAST,authorLabel,0,SpringLayout.EAST,titleLabel);
        springLayout.putConstraint(SpringLayout.NORTH,authorLabel,30,SpringLayout.NORTH,titleLabel);
        //设置authorText
        springLayout.putConstraint(SpringLayout.WEST,authorText,20,SpringLayout.EAST,authorLabel);
        springLayout.putConstraint(SpringLayout.NORTH,authorText,0,SpringLayout.NORTH,authorLabel);

        //设置内容label,东边和titleLabel对齐,北边距离authorLabel20px
        springLayout.putConstraint(SpringLayout.EAST,contentLabel,0,SpringLayout.EAST,titleLabel);
        springLayout.putConstraint(SpringLayout.NORTH,contentLabel,30,SpringLayout.NORTH,authorLabel);
        //设置内容text
        springLayout.putConstraint(SpringLayout.WEST,contText,20,SpringLayout.EAST,contentLabel);
        springLayout.putConstraint(SpringLayout.NORTH,contText,0,SpringLayout.NORTH,contentLabel);
        //设置内容text南北
        springLayout.putConstraint(SpringLayout.SOUTH, contText, -20, SpringLayout.SOUTH, jPanel);
        springLayout.putConstraint(SpringLayout.EAST, contText, -20, SpringLayout.EAST, jPanel);



        container.add(jPanel);

        URL resource = SpringLayoutTest.class.getClassLoader().getResource("background.png");
        Image image = new ImageIcon(resource).getImage();
        setIconImage(image);

        setSize(400, 400);
        setLocationRelativeTo(null); //居中
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);


    }


    public static void main(String[] args) {

        new SpringLayoutTest();
    }
}
