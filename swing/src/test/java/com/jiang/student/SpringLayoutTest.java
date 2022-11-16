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

    JLabel jLabel = new JLabel("文章标题");
    JTextField titleText = new JFormattedTextField();
    JLabel author = new JLabel("作者：");
    JTextField name = new JFormattedTextField();
    JLabel contentLabel = new JLabel("请输入内容：");
    JTextArea contLabel = new JTextArea(4, 10);


    public SpringLayoutTest(){

        Container container = getContentPane();

        //添加组件
        jPanel.add(jLabel);
        jPanel.add(titleText);
        jPanel.add(author);
        jPanel.add(name);
        jPanel.add(contLabel);
        jPanel.add(contentLabel);
        container.add(jPanel);

        URL resource = SpringLayoutTest.class.getClassLoader().getResource("background.png");
        Image image = new ImageIcon(resource).getImage();
        setIconImage(image);

        setSize(400, 200);
        setLocationRelativeTo(null); //居中
        setResizable(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);


    }


    public static void main(String[] args) {

        new SpringLayoutTest();
    }
}
