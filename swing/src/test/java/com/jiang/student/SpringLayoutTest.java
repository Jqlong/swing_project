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
    JTextField titleText = new JFormattedTextField();
    JLabel author = new JLabel("作者：");
    JTextField name = new JFormattedTextField();
    JLabel contentLabel = new JLabel("请输入内容：");
    JTextArea contLabel = new JTextArea(4, 10);


    public SpringLayoutTest(){
        super("弹簧布局SpringLayout");
        Container container = getContentPane();

        //添加组件
        jPanel.add(titleLabel);
        //设置大小
        titleText.setPreferredSize(new Dimension(200, 20));
        jPanel.add(titleText);
        author.setPreferredSize(new Dimension(200, 30));
//        jPanel.add(author);
//        jPanel.add(name);
//        jPanel.add(contLabel);
//        jPanel.add(contentLabel);

        /**
         * SpringLayout:布局管理器
         * SpringLayout.Constraints:使用弹簧布局的容器里面的组件的布局约束，每个组件对应一个
         * Spring:可以理解为一个能够进行四则运算的整数
         */
        SpringLayout.Constraints titleLabelC = springLayout.getConstraints(titleLabel);
        titleLabelC.setX(Spring.constant(80));
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
        springLayout.putConstraint();

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
