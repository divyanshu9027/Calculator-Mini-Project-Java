package calculator1;


import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator extends Frame implements ActionListener {
    Label l1,l2,l3;
    TextField t1,t2,t3;
    Button b1,b2,b3,b4,b5,b6;
    public Calculator() {
        l1 = new Label("num1");
        l2 = new Label("num2");
        l3 = new Label("result");
        t1 = new TextField(10);
        t2 = new TextField(10);
        t3 = new TextField(10);
        b1 = new Button("add");
        b2 = new Button("sub");
        b3 = new Button("mul");
        b4 = new Button("div");
        b5 = new Button("reset");
        b6 = new Button("exit");
        add(l1);
        add(t1);
        add(l2);
        add(t2);
        add(l3);
        add(t3);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(b5);
        add(b6);
        setSize(200,200);
        setTitle("calculator");
        setLayout(new FlowLayout());
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);




    }
    public void actionPerformed(ActionEvent ae) {
        double a=0,b=0,c=0;
        try {
            a=Double.parseDouble(t1.getText());
        }
        catch(NumberFormatException e){
            t1.setText("invalid output");

        }
        try {
            b=Double.parseDouble(t2.getText());
        }catch (NumberFormatException e){
            t2.setText("invalid output");
        }
        if(ae.getSource()==b1) {
            c=a+b;
            t3.setText(String.valueOf(c));
        }
        if(ae.getSource()==b2) {
            c=a-b;
            t3.setText(String.valueOf(c));
        }
        if(ae.getSource()==b3) {
            c=a*b;
            t3.setText(String.valueOf(c));
        }
        if(ae.getSource()==b4) {
            c=a/b;
            t3.setText(String.valueOf(c));
        }
        if(ae.getSource()==b5) {
            t1.setText("0");
            t2.setText("0");
            t3.setText("0");
        }
        if(ae.getSource()==b6)
        {
            System.exit(0);
        }

    }

    public static void main(String[] args) {
        Calculator divyanshu = new Calculator();
        divyanshu.setVisible(true);
        divyanshu.setLocation(300,300);
    }


}
