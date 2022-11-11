package com.jiang.student;

import javax.swing.*;
import java.awt.*;

public class JFrameTest {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame("学生管理系统");

        jFrame.setSize(400, 609);
        //居中 关闭程序退出
        jFrame.setLocationRelativeTo(null);  //方法一
        //方法二，计算位置来居中
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();

        //大小不可改变
        jFrame.setResizable(false);

        //退出
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //可见
        jFrame.setVisible(true);
    }
}
