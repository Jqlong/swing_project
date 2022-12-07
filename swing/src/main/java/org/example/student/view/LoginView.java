package org.example.student.view;

import javax.swing.*;
import java.awt.*;

public class LoginView extends JFrame {
    JLabel nameLabel = new JLabel("java swing学生管理系统");
    SpringLayout springLayout = new SpringLayout();
    JPanel jPanel = new JPanel(springLayout);
    JLabel userLabel = new JLabel("用户名:");
    JTextField userText = new JTextField();
    JLabel pwdLabel = new JLabel("密码:");
    JPasswordField pwdField = new JPasswordField();
    JButton loginButton = new JButton("登录");
    JButton resetBut = new JButton("重置");



    public LoginView(){
        //获取面板
        Container contentPane = getContentPane();

        Font font = new Font("华文行楷", Font.PLAIN, 40);
        nameLabel.setFont(font);
        Font font1 = new Font("楷体", Font.PLAIN, 20);
        userLabel.setFont(font1);
        pwdLabel.setFont(font1);
        loginButton.setFont(font1);
        resetBut.setFont(font1);
        userText.setPreferredSize(new Dimension(200, 30));
        pwdField.setPreferredSize(new Dimension(200,30));

        jPanel.add()


        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setVisible(true);
    }
    public static void main(String[] args) {
        new LoginView();
    }
}
