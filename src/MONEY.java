import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MONEY  implements ActionListener {
    JFrame frame =new JFrame();
    JButton button =new JButton("أحسب");
     JLabel label =new JLabel();
    JTextField field =new JTextField();
    JButton back =new JButton("<--");
    MONEY(){

        frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\ccvn5\\Downloads\\6ece6a3df42f4ea0e15159a1c0d0d661.jpg")));
        field.setBounds(200, 200, 200, 45);
        label.setText(":المبلغ");
        label.setBounds(160,210,50,20);
        frame.add(label);
        back.setBounds(20, 10, 50, 20);
        back.setBackground(Color.GRAY);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);

        frame.setTitle("حاسبة المال");
        field.setBackground(Color.GRAY);
        frame.add(field);

        button.setBounds(200, 300, 200, 45);
        button.setBackground(Color.GRAY);
        button.setFocusable(false);
        button.addActionListener(this);
        frame.add(button);

        frame.validate();
        frame.setVisible(true);
        frame.setSize(600,800);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource()==button){
            String b = field.getText();
            int a = Integer.parseInt(b)/40;
            String z = String.valueOf(a);
            JTextField field1 = new JTextField(z);
            field1.setBounds(200, 250, 200, 45);
            field1.setBackground(Color.GRAY);
            frame.add(field1);
        }
           if (e.getSource()==back){
             new home();
            }
    }

}
