package railwaypack;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
class Enquiry extends Connect implements ActionListener
{
JFrame f;
JLabel l1,l2;
JTextField t;
List li;
JButton b1,b2;
PreparedStatement ps;
ResultSet rs;
JLabel imgL;
ImageIcon img; 
private JLabel lblPnrEnquiry;
Enquiry()
{
img=new ImageIcon("LOGO1.jpg");
imgL=new JLabel(img);
imgL.setBounds(0, 340, 500, 200);
f=new JFrame("PNR-Enquiry");
f.getContentPane().setBackground(new Color(245, 245, 245));
l1=new JLabel("PNR No");
l1.setFont(new Font("Tahoma", Font.BOLD, 12));
l1.setBounds(70, 129, 60, 30);
l2=new JLabel("PNR Details");
l2.setFont(new Font("Tahoma", Font.BOLD, 12));
l2.setBounds(70, 193, 100, 30);
t=new JTextField(10);
t.setBounds(180, 129, 228, 30);
t.addActionListener(this);
li=new List();
li.setBounds(180, 193, 228, 71);
b1=new JButton("Check");
b1.setBounds(70, 354, 100, 30);
b1.setBackground(new Color(192, 192, 192));
b1.addActionListener(this);
b2=new JButton("Back");
b2.setBounds(280, 354, 100, 30);
b2.setBackground(new Color(192, 192, 192));
b2.addActionListener(this);

b1.setMnemonic('C');
b2.setMnemonic('B');
f.getContentPane().setLayout(null);

f.getContentPane().add(l1);
f.getContentPane().add(l2);
f.getContentPane().add(t);
f.getContentPane().add(li);
f.getContentPane().add(b1);
f.getContentPane().add(b2);
f.getContentPane().add(imgL);
lblPnrEnquiry = new JLabel("PNR Enquiry");
lblPnrEnquiry.setHorizontalAlignment(SwingConstants.CENTER);
lblPnrEnquiry.setFont(new Font("Tahoma", Font.BOLD, 15));
lblPnrEnquiry.setBounds(70, 49, 294, 43);
f.getContentPane().add(lblPnrEnquiry);
f.setSize(482,448);
f.setVisible(true);
}
@SuppressWarnings("deprecation")
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
try
{
//reservation information
ps=con.prepareStatement("select * from Reservation where PNR_No=?");
ps.setString(1,t.getText());
rs=ps.executeQuery();
rs.next();
li.clear();
li.add("Train No.: "+rs.getString(2));
li.add("Train Name: "+rs.getString(3));
li.add("Class: "+rs.getString(4));
li.add("Date of Journey: "+rs.getString(5));
li.add("From: "+rs.getString(6));
li.add("To: "+rs.getString(7));
li.add("Boarding at: "+rs.getString(8));

//Passeneger information
ps=con.prepareStatement("select * from Passenger where PNR_No=?");
ps.setString(1,t.getText());
rs=ps.executeQuery();
while(rs.next())
{
li.add("Passenger Name: "+rs.getString(2));
li.add("Age: "+rs.getString(3));
li.add("Gender: "+rs.getString(4));
}
}
catch(Exception e1)
{
System.out.println("connection failed:"+e1);
}
}
if(e.getSource()==b2)
{
f.setVisible(false);
new Main();
}
}
public static void main(String args[])
{
new Enquiry();
}
}
 
