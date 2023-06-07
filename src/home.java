import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class home extends Main implements ActionListener {
    JFrame frame = new JFrame();
    JLabel l1 = new JLabel();
    JButton zakat =new JButton("زكاة الفطر");
    JButton Money =new JButton("زكاة المال");
    JButton gold =new JButton("زكاة الذهب والفضة");
    JButton Money2 =new JButton("زكاة الاسهم");


    home() {
        frame.setContentPane(new JLabel(new ImageIcon("C:\\Users\\ccvn5\\Downloads\\6ece6a3df42f4ea0e15159a1c0d0d661.jpg")));

        frame.setSize(600,800);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("الصفحة الرئسية ");

          l1.setText("مرحبا بكم في حاسبة الزكاة");
        l1.setBounds(250 , 50, 200, 45);
        frame.add(l1);

        zakat.setBounds(70, 120, 200, 40);
       zakat.setBackground(Color.GRAY);
       zakat.setFocusable(false);
        zakat.addActionListener(this);
        frame.add(zakat);

       Money.setBounds(350, 120, 200, 40);
        Money.setBackground(Color.GRAY);
        Money.setFocusable(false);
        Money.addActionListener(this);
        frame.add(Money);

        gold.setBounds(70, 350, 200, 40);
        gold.setBackground(Color.GRAY);
        gold.setFocusable(false);
        gold.addActionListener(this);
        frame.add(gold);

        Money2.setBounds(350, 350, 200, 40);
        Money2.setBackground(Color.GRAY);
        Money2.setFocusable(false);
        Money2.addActionListener(this);
        frame.add(Money2);







        }


        @Override
        public void actionPerformed (ActionEvent e){
        if (e.getSource()== zakat){
            ZAKAT za =new ZAKAT();
       frame.dispose();
        }
        if (e.getSource()== gold){
            Gold gold =new Gold ();
            frame.dispose();
        }
          if (e.getSource()== Money){
              MONEY money=new MONEY();
              frame.dispose();
          }

      if (e.getSource()== Money2){
          MONEY1 money1 =new MONEY1();
          frame.dispose();
      }



        }
    }








