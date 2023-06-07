import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MONEY1 implements ActionListener {
    JFrame frame =new JFrame();
    JTextField field=new JTextField("عدد الاسهم");
    JTextField field1=new JTextField("سعر السهم");
    JButton button =new JButton("أحسب");
    JButton back =new JButton("<--");

    MONEY1(){
        frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\ccvn5\\Downloads\\6ece6a3df42f4ea0e15159a1c0d0d661.jpg")));
        field.setBounds(100,200,200,45);
        frame.setTitle("حاسبة الاسهم");
        field.setBackground(Color.GRAY);
        frame.add(field);
        field1.setBackground(Color.GRAY);
        field1.setBounds(300,200,200,45);
        frame.add(field1);

        button.setBounds(200, 400, 200, 45);
        button.setBackground(Color.GRAY);
        button.setFocusable(false);
        button.addActionListener(this);
        frame.add(button);

        back.setBounds(20, 10, 50, 20);
        back.setBackground(Color.GRAY);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);


        frame.setSize(600,800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            String a=field.getText();
            String b=field1.getText();
            double c=Double.parseDouble(a);
            double v=Double.parseDouble(b)*c/40;
            String z=String.valueOf(v);
            JTextField textField=new JTextField(z);
            textField.setBackground(Color.GRAY);
            textField.setBounds(200, 300, 200, 45);
            frame.add(textField);
        }
 if (e.getSource()==back){
     new home();
 }
    }
}
