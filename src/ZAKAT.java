import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ZAKAT implements ActionListener {
    JFrame frame =new JFrame();
    JTextField field =new JTextField();
    JButton button =new JButton("أحسب");
    JLabel d=new JLabel();
    JButton back =new JButton("<--");


    ZAKAT() {
        d.setText("ملاحظة: يتم هنا حساب قيمة الارز فقط فقط للفرد" +
                " ويتم تعويض عن كل فرد 3 كيلو  ");
        frame.setSize(600, 800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\ccvn5\\Downloads\\6ece6a3df42f4ea0e15159a1c0d0d661.jpg")));
        field.setBounds(220, 200, 200, 45);
        field.setBackground(Color.GRAY);
        frame.add(field);
        button.setBounds(220, 300, 200, 45);
        button.setBackground(Color.GRAY);
        button.setFocusable(false);
        button.addActionListener(this);
        frame.add(button);
        d.setBounds(200, 100, 250, 70);
        d.setBackground(Color.green);
        frame.add(d);
        frame.setTitle("حاسبة زكاة الفطر");
        back.setBounds(20, 10, 50, 20);
        back.setBackground(Color.GRAY);
        back.setFocusable(false);
        back.addActionListener(this);
        frame.add(back);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==button) {
            String b=field.getText();
            int s=Integer.parseInt(b);
            int z=s*3;
            String q=Integer.toString(z);
             JTextField textField=new JTextField(q);
             textField.setBackground(Color.GRAY);
             textField.setBounds(220, 250, 200, 45);
             frame.add(textField);


        }
        if (e.getSource()==back){
            new home();
        }
    }
}
