import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gold  implements ActionListener {
    JFrame frame =new JFrame();
    JButton sliver =new JButton("الفضة");
    JButton button =new JButton("أحسب");
 JLabel label =new JLabel();
   JTextField field =new JTextField("العيار");
    JTextField field1 =new JTextField("الجرامات");
    JButton back =new JButton("<--");



    Gold (){

        frame.setTitle("حاسبة الذهب");
        frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\ccvn5\\Downloads\\6ece6a3df42f4ea0e15159a1c0d0d661.jpg")));
        field1.setBounds(100, 200, 200, 45);
        field1.setBackground(Color.GRAY);
        frame.add(field1);

        back.setBounds(20, 10, 50, 20);
       back.setBackground(Color.GRAY);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);

        field.setBounds(300, 200, 200, 45);
        field.setBackground(Color.GRAY);
        frame.add(field);

        sliver.setBounds(100, 500, 150, 45);
        sliver.setBackground(Color.GRAY);
        sliver.setFocusable(false);
        sliver.addActionListener(this);
        frame.add(sliver);

        button.setBounds(350, 500, 150, 45);
        button.setBackground(Color.GRAY);
       button.setFocusable(false);
        button.addActionListener(this);
        frame.add(button);



        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setSize(600,800);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
           String q =field.getText();
           String a=field1.getText();
           double w =Double.parseDouble(q);
           double z=Double.parseDouble(a);
           double g=w*z/24;
           String r=String.valueOf(g);
            JTextField textField=new JTextField(r);
            textField.setBackground(Color.GRAY);
            textField.setBounds(220, 250, 200, 45);
            frame.add(textField);
        }
        if (e.getSource()==sliver){
            SILVER SILVER1 =new SILVER();
            frame.dispose();
        }
        if (e.getSource()==back){
            new home();
        }
    }
}
