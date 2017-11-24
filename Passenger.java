package railwaypack;

import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
class Passenger extends Connect implements ActionListener
{
JFrame f;
JLabel l1,l2,l3,l4,l5,l6;
JTextField t1,t2,t3;
JButton b1,b2,b3;
Checkbox c1,c2,c3,c4,c5;
CheckboxGroup cbg;
JTextArea ta;
PreparedStatement ps;
Statement st;
ResultSet rs;
int pno;
ImageIcon img;
private JLabel lblPassengerDetails;
Passenger(int p)
{
pno=p;
img=new ImageIcon("LOGO2.jpg");
f=new JFrame("Passenger");
f.getContentPane().setLayout(null);
f.getContentPane().setBackground(new Color(248, 248, 255));
l1=new JLabel("PId");
l1.setFont(new Font("Tahoma", Font.BOLD, 12));
l1.setBounds(50,79,71,30);
t1=new JTextField(10);
t1.setBounds(148,79,168,30);
l2=new JLabel("Name");
l2.setFont(new Font("Tahoma", Font.BOLD, 12));
l2.setBounds(50,120,120,30);
t2=new JTextField(10);
t2.setBounds(148,121,252,30);
l3=new JLabel("Age");
l3.setFont(new Font("Tahoma", Font.BOLD, 12));
l3.setBounds(50,161,100,30);
t3=new JTextField(10);
t3.setBounds(145,161,50,30);
l4=new JLabel("Gender");
l4.setFont(new Font("Tahoma", Font.BOLD, 12));
l4.setBounds(220,161,50,30);
ta=new JTextArea(5,10);
ta.setBounds(145,206,255,58);
l5=new JLabel("Address");
l5.setFont(new Font("Tahoma", Font.BOLD, 12));
l5.setBounds(50,202,100,30);
l6=new JLabel("Catagory");
l6.setFont(new Font("Tahoma", Font.BOLD, 12));
l6.setBounds(50,275,100,30);
b1=new JButton("More");
b1.setBackground(new Color(192, 192, 192));
b1.addActionListener(this);
b1.setBounds(33,399,100,30);
b2=new JButton("Save");
b2.setBackground(new Color(192, 192, 192));
b2.addActionListener(this);
b2.setBounds(143,399,100,30);
b3=new JButton("Back");
b3.setBackground(new Color(192, 192, 192));
b3.addActionListener(this);
b3.setBounds(261,399,100,30);

b1.setMnemonic('M');
b2.setMnemonic('S');
b3.setMnemonic('B');

cbg=new CheckboxGroup();
c1=new Checkbox("Male",cbg,true);
c1.setBounds(286,161,57,30);
c2=new Checkbox("Female",cbg,false); 
c2.setBounds(349,161,71,30);
c3=new Checkbox("General");
c3.setBounds(143,275,100,30);
c4=new Checkbox("Senior Citizen");
c4.setBounds(143,311,100,30);
c5=new Checkbox("Ex-serviceman");
c5.setBounds(143,346,100,30);
f.getContentPane().add(l1);
f.getContentPane().add(l2);
f.getContentPane().add(l3);
f.getContentPane().add(l4);
f.getContentPane().add(l5);
f.getContentPane().add(l6);
f.getContentPane().add(t1);
f.getContentPane().add(t2);
f.getContentPane().add(t3);
f.getContentPane().add(ta);
f.getContentPane().add(b1);
f.getContentPane().add(b2);
f.getContentPane().add(b3);
f.getContentPane().add(c1);
f.getContentPane().add(c2);
f.getContentPane().add(c3);
f.getContentPane().add(c4);
f.getContentPane().add(c5);
lblPassengerDetails = new JLabel("Passenger Details");
lblPassengerDetails.setHorizontalAlignment(SwingConstants.CENTER);
lblPassengerDetails.setFont(new Font("Tahoma", Font.BOLD, 15));
lblPassengerDetails.setBounds(72, 25, 277, 30);
f.getContentPane().add(lblPassengerDetails);
f.setSize(446,518);
f.setVisible(true);
}
public void actionPerformed(ActionEvent e)
{
if(e.getSource()==b1)
{
try
{
//saving existing record
String cat="";
ps=con.prepareStatement("insert into TempPassenger values(?,?,?,?,?,?,?)");
ps.setString(1,t1.getText());
ps.setString(2,t2.getText());
ps.setString(3,t3.getText());
ps.setString(4,cbg.getSelectedCheckbox().getLabel());
ps.setString(5,ta.getText());
if(c3.getState())
cat+=c3.getLabel()+",";
if(c4.getState())
cat+=c4.getLabel()+",";
if(c5.getState())
cat+=c5.getLabel()+",";
ps.setString(6,cat);
ps.setInt(7,pno);
ps.executeUpdate();
ps.close();

//opening new form
Passenger P=new Passenger(pno);
st=con.createStatement();
rs=st.executeQuery("select * from PassengerID");
rs.next();
int x=rs.getInt(1);
P.t1.setText(String.valueOf(x));
st.close();
//update passenger id
ps=con.prepareStatement("update PassengerID set PID=? where PID=?");
ps.setInt(1,(x+1));
ps.setInt(2,x);
ps.executeUpdate();
ps.close();
}
catch(Exception e1)
{
System.out.println("Connection failed:"+e1);
}
}
if(e.getSource()==b2)
{

try
{
String cat="";
ps=con.prepareStatement("insert into TempPassenger values(?,?,?,?,?,?,?)");
ps.setString(1,t1.getText());
ps.setString(2,t2.getText());
ps.setString(3,t3.getText());
ps.setString(4,cbg.getSelectedCheckbox().getLabel());
ps.setString(5,ta.getText());
if(c3.getState())
cat+=c3.getLabel()+",";
if(c4.getState())
cat+=c4.getLabel()+",";
if(c5.getState())
cat+=c5.getLabel()+",";
ps.setString(6,cat);
ps.setInt(7,pno);
ps.executeUpdate();
ps.close();

st=con.createStatement();
rs=st.executeQuery("select * from TempPassenger");
while(rs.next())
{
ps=con.prepareStatement("insert into Passenger values(?,?,?,?,?,?,?)");
ps.setString(1,rs.getString(1));
ps.setString(2,rs.getString(2));
ps.setString(3,rs.getString(3));
ps.setString(4,rs.getString(4));
ps.setString(5,rs.getString(5));
ps.setString(6,rs.getString(6));
ps.setString(7,rs.getString(7));
ps.executeUpdate();
ps.close();
}
st=con.createStatement();
st.executeUpdate("delete from TempPassenger");
JOptionPane.showMessageDialog(null,"Record Saved");
b2.setEnabled(false);
b1.setEnabled(false);
st.close();
}
catch(Exception e1)
{
System.out.println("Connection failed:"+e1);
}
}

if(e.getSource()==b3)
{
f.setVisible(false);
new Reservation();
}
}
public static void main(String args[])
{
new Passenger(0);
}
}
 
