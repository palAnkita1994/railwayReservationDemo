package railwaypack;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
class Cancellation extends Connect implements ActionListener,ItemListener
{
JFrame f;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
JTextField t1,t2,t3,t4,t5,t6,t7;
JButton b1,b2;
Choice h;
PreparedStatement ps;
ResultSet rs;
Statement st;
private JLabel lblCancellationForm;
private JTextField textField;
Cancellation()
{
f=new JFrame("Cancellation");
f.getContentPane().setBackground(new Color(245, 255, 250));
l1=new JLabel("PNR No");
l1.setFont(new Font("Tahoma", Font.BOLD, 12));
l1.setBounds(50, 59, 50, 20);
l2=new JLabel("Train No");
l2.setFont(new Font("Tahoma", Font.BOLD, 12));
l2.setBounds(50, 347, 55, 30);
l3=new JLabel("Train Name");
l3.setFont(new Font("Tahoma", Font.BOLD, 12));
l3.setBounds(50, 120, 100, 30);
l4=new JLabel("Class");
l4.setFont(new Font("Tahoma", Font.BOLD, 12));
l4.setBounds(50, 150, 100, 30);
l5=new JLabel("Date of Journey");
l5.setFont(new Font("Tahoma", Font.BOLD, 12));
l5.setBounds(50, 180, 100, 30);
l6=new JLabel("From");
l6.setFont(new Font("Tahoma", Font.BOLD, 12));
l6.setBounds(50, 221, 37, 30);
l7=new JLabel("To");
l7.setFont(new Font("Tahoma", Font.BOLD, 12));
l7.setBounds(50, 262, 50, 30);
l8=new JLabel("Boarding at");
l8.setFont(new Font("Tahoma", Font.BOLD, 12));
l8.setBounds(51, 306, 77, 30);
l9=new JLabel("Name of Passenger");
l9.setFont(new Font("Tahoma", Font.BOLD, 12));
l9.setBounds(50, 90, 116, 30);
b1=new JButton("Ok");
b1.setFont(new Font("Tahoma", Font.BOLD, 14));
b1.setBounds(36, 407, 130, 36);
b1.setBackground(new Color(192, 192, 192));
b1.addActionListener(this);
b2=new JButton("Back");
b2.setFont(new Font("Tahoma", Font.BOLD, 14));
b2.setBounds(294, 405, 130, 38);
b2.setBackground(new Color(192, 192, 192));
b2.addActionListener(this);

b1.setMnemonic('O');
b2.setMnemonic('B');

h=new Choice();
h.setBounds(176, 59, 193, 20);
h.addItemListener(this);
t1=new JTextField(10);
t1.setBounds(176, 353, 193, 20);
t1.addActionListener(this);
t2=new JTextField(10);
t2.setBounds(176, 126, 193, 20);
t2.addActionListener(this);
t3=new JTextField(10);
t3.setBounds(176, 156, 193, 20);
t3.addActionListener(this);
t4=new JTextField(10);
t4.setBounds(176, 190, 193, 20);
t4.addActionListener(this);
t5=new JTextField(10);
t5.setBounds(176, 227, 193, 20);
t5.addActionListener(this);
t6=new JTextField(10);
t6.setBounds(176, 268, 193, 20);
t6.addActionListener(this);
t7=new JTextField(10);
t7.setBounds(176, 312, 193, 20);
t7.addActionListener(this);
f.getContentPane().setLayout(null);
f.getContentPane().add(l1);
f.getContentPane().add(l2);
f.getContentPane().add(l3);
f.getContentPane().add(l4);
f.getContentPane().add(l5);
f.getContentPane().add(l6);
f.getContentPane().add(l7);
f.getContentPane().add(l8);
f.getContentPane().add(l9);
f.getContentPane().add(b1);
f.getContentPane().add(b2);
f.getContentPane().add(h);
f.getContentPane().add(t1);
f.getContentPane().add(t2);
f.getContentPane().add(t3);
f.getContentPane().add(t4);
f.getContentPane().add(t5);
f.getContentPane().add(t6);
f.getContentPane().add(t7);
lblCancellationForm = new JLabel("Cancellation Form:~");
lblCancellationForm.setHorizontalAlignment(SwingConstants.CENTER);
lblCancellationForm.setFont(new Font("Tahoma", Font.BOLD, 15));
lblCancellationForm.setBounds(10, 11, 430, 30);
f.getContentPane().add(lblCancellationForm);
textField = new JTextField();
textField.setBounds(176, 96, 193, 20);
f.getContentPane().add(textField);
textField.setColumns(10);
f.setSize(455,504);
f.setVisible(true);
start();
}
public void start()
{
try
{
st=con.createStatement();
rs=st.executeQuery("select * from Reservation");
while(rs.next())
{
h.add(rs.getString(1));
}
}
catch(Exception e)
{
System.out.println("Connection failed:"+e);
}
}
public void itemStateChanged(ItemEvent e)
{
System.out.println((String)h.getSelectedItem());
try
{
Container li = null;
li.removeAll();
ps=con.prepareStatement("select * from Reservation where PNR_No=?");
ps.setString(1,h.getSelectedItem());
rs=ps.executeQuery();
rs.next();
t1.setText(rs.getString(2));
t2.setText(rs.getString(3));
t3.setText(rs.getString(4));
t4.setText(rs.getString(5));
t5.setText(rs.getString(6));
t6.setText(rs.getString(7));
t7.setText(rs.getString(8));
ps=con.prepareStatement("select * from Passenger where PNR_No=?");
ps.setString(1,h.getSelectedItem());
rs=ps.executeQuery();
while(rs.next())
{
li.add(li, rs.getString(2)+"                                  "+rs.getString(3)+"                           "+rs.getString(4));
}
}
catch(Exception e1)
{
System.out.println("Connection failed"+e1);
}
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
try
{
ps=con.prepareStatement("delete from Reservation where PNR_No=?");
ps.setString(1,h.getSelectedItem());
ps.executeUpdate();

ps=con.prepareStatement("delete from Passenger where PNR_No=?");
ps.setString(1,h.getSelectedItem());
ps.executeUpdate();

JOptionPane.showMessageDialog(null,"Reservation Cancelled");
f.setVisible(false);
}
catch(Exception e1)
{
System.out.println("Connection failed:"+e1);
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
new Cancellation();
}
}
 
