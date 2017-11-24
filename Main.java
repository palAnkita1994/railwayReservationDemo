package railwaypack;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class Main implements ActionListener
{
JFrame f;
JButton b1,b2,b3,b4;
Reservation r;
Enquiry q;
Cancellation c;
ImageIcon img;
private JLabel lblMainPage;
Main()
{
img=new ImageIcon("Indian-Railway-Network.jpg");
f=new JFrame("Main");
f.getContentPane().setBackground(new Color(240, 255, 240));
b1=new JButton("Reservation Form");
b1.setBounds(92, 103, 210, 60);
b1.setFont(new Font("Tahoma", Font.BOLD, 12));
b1.addActionListener(this);
b2=new JButton("PNR-enquiry");
b2.setBounds(92, 272, 210, 60);
b2.setFont(new Font("Tahoma", Font.BOLD, 12));
b2.addActionListener(this);
b3=new JButton("Cancellation Form");
b3.setBounds(92, 186, 210, 60);
b3.setFont(new Font("Tahoma", Font.BOLD, 12));
b3.addActionListener(this);
b4=new JButton("Exit");
b4.setBounds(92, 355, 210, 60);
b4.setFont(new Font("Tahoma", Font.BOLD, 12));
b4.addActionListener(this);

b1.setBackground(new Color(211, 211, 211));
b1.setForeground(new Color(0, 0, 0));
b2.setBackground(new Color(211, 211, 211));
b2.setForeground(new Color(0, 0, 0));
b3.setBackground(new Color(192, 192, 192));
b3.setForeground(new Color(0, 0, 0));
b4.setBackground(new Color(192, 192, 192));
b4.setForeground(new Color(0, 0, 0));

b1.setMnemonic('R');
b2.setMnemonic('P');
b3.setMnemonic('C');
b4.setMnemonic('E');
f.getContentPane().setLayout(null);

f.getContentPane().add(b1);
f.getContentPane().add(b2);
f.getContentPane().add(b3);
f.getContentPane().add(b4);
lblMainPage = new JLabel("MAIN PAGE");
lblMainPage.setBackground(new Color(255, 255, 240));
lblMainPage.setHorizontalAlignment(SwingConstants.CENTER);
lblMainPage.setFont(new Font("Tahoma", Font.BOLD, 15));
lblMainPage.setBounds(72, 32, 259, 60);
f.getContentPane().add(lblMainPage);
f.setSize(397,510);
f.setVisible(true);

}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
f.setVisible(false);
r=new Reservation();
}
if(e.getSource()==b2)
{
f.setVisible(false);
q=new Enquiry();
}
if(e.getSource()==b3)
{
f.setVisible(false);
c=new Cancellation();
}
if(e.getSource()==b4)
{
f.setVisible(false);
System.exit(0);
}
}
public static void main(String args[])
{
new Main();

}
}
