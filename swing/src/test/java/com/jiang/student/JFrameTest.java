package com.jiang.student;

import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class JFrameTest extends JFrame {

    JButton jButton;
    public JFrameTest() {
        super("标题");

        JButton jButton = new JButton("按钮");
        Container container = getContentPane();  //内容面板，放内容
        container.add(jButton);


        URL resource = JFrameTest.class.getClassLoader().getResource("background.png");
        assert resource != null;
        Image image = new ImageIcon(resource).getImage();
        setIconImage(image);

        setSize(400, 200);
        //居中 关闭程序退出
        setLocationRelativeTo(null);  //方法一
        //方法二，计算位置来居中
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        //大小不可改变
        setResizable(false);

        //退出
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //可见
        setVisible(true);
    }

    public static void main(String[] args) {
        new JFrameTest();
    }
}
