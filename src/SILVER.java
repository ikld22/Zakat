import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SILVER implements ActionListener {
    JFrame frame =new JFrame();
    JButton button =new JButton("أحسب");
   // JLabel label =new JLabel();
    JTextField field =new JTextField("الجرامات");
    JButton back =new JButton("<--");
    SILVER(){
        frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\ccvn5\\Downloads\\6ece6a3df42f4ea0e15159a1c0d0d661.jpg")));
        field.setBounds(200, 200, 200, 45);
        field.setBackground(Color.GRAY);
        frame.add(field);
        button.setBounds(200, 300, 200, 45);
        button.setBackground(Color.GRAY);
        button.setFocusable(false);
        button.addActionListener(this);
        frame.add(button);

        back.setBounds(20, 10, 50, 20);
        back.setBackground(Color.GRAY);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);

  frame.setTitle("حاسبة الفضة");
      frame.setSize(600,800);
      frame.setVisible(true);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button){
            String d=field.getText();
            double w=Double.parseDouble(d);
            double s=w/40;
            String h =String.valueOf(s);
            JTextField field1=new JTextField(h);
            field1.setBounds(200, 250, 200, 45);
            field1.setBackground(Color.GRAY);
            frame.add(field1);

        }
     if (e.getSource()==back){
         new Gold();
     }
    }
}
