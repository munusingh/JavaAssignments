import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Assign_P16 extends JFrame implements ActionListener {
    Container cn;
    JButton add, sub, mul, div, mod,pow;
    JLabel num1, num2;
    JTextField tnum1, tnum2, res;

    Assign_P16() {
        cn = getContentPane();
        setLayout(null);
        setTitle("Calculator");
        num1 = new JLabel("Enter 1st number");
        num1.setBounds(20, 100, 150, 50);
        cn.add(num1);
        tnum1 = new JTextField();
        tnum1.setBounds(150, 100, 100, 50);
        cn.add(tnum1);
        num2 = new JLabel("Enter 2nd number");
        num2.setBounds(20, 170, 150, 50);
        cn.add(num2);
        tnum2 = new JTextField();
        tnum2.setBounds(150, 180, 100, 50);
        cn.add(tnum2);
        res = new JTextField();
        res.setBounds(300, 250, 100, 50);
        cn.add(res);
        add = new JButton("ADD");
        add.setBounds(40, 300, 100, 100);
        add.addActionListener(this);
        cn.add(add);
        sub = new JButton("SUB");
        sub.setBounds(150, 300, 100, 100);
        sub.addActionListener(this);
        cn.add(sub);
        mul = new JButton("MUL");
        mul.setBounds(270, 300, 100, 100);
        mul.addActionListener(this);
        cn.add(mul);
        div = new JButton("DIV");
        div.setBounds(490, 300, 100, 100);
        div.addActionListener(this);
        cn.add(div);
        pow = new JButton("POW");
        pow.setBounds(520, 300, 100, 100);
        pow.addActionListener(this);
        cn.add(pow);
        setSize(1000, 1000);
        setVisible(true);
    }
}
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == add) {
            String t1 = tnum1.getText();
            String t2 = tnum2.getText();
            int a = Integer.parseInt(t1);
            int b = Integer.parseInt(t2);
            int t3 = a + b;
            res.setText(" " + t3);

        }
        if (e.getSource() == sub) {
            String t1 = tnum1.getText();
            String t2 = tnum2.getText();
            int a = Integer.parseInt(t1);
            int b = Integer.parseInt(t2);
            int t3 = a - b;
            res.setText(" " + t3);

        }
        if (e.getSource() == mul) {
            String t1 = tnum1.getText();
            String t2 = tnum2.getText();
            int a = Integer.parseInt(t1);
            int b = Integer.parseInt(t2);
            int t3 = a * b;
            res.setText(" " + t3);

        }
        if (e.getSource() == div) {
            String t1 = tnum1.getText();
            String t2 = tnum2.getText();
            int a = Integer.parseInt(t1);
            int b = Integer.parseInt(t2);
            int t3 = a / b;
            res.setText(" " + t3);


        if (e.getSource() == pow) {
                String t1 = tnum1.getText();
                String t2 = tnum2.getText();
                int a = Integer.parseInt(t1);
                int b = Integer.parseInt(t2);
                int t3 =Math.pow(a, b);
                res.setText(" " + t3);

        }
    }

    public static void main(String[] args) {
        new Assign_P16();
    }
}
