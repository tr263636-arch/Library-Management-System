package lms;
import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class UpdateStudentDetail extends Frame implements ActionListener
{
String s1="",s2="",s3="",s4="",s5="",s6="",s7="",s8="",s9="";
JTextField t1,t2,t3;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10;
JButton b1,b2,b3;
Choice c1,c2,c3,c4,c5,c6;
Frame frm;
Connection con;
PreparedStatement pst;
Statement st;
ResultSet rec;
public UpdateStudentDetail()
{
frm = new Frame();
l1=new JLabel("Enter Student ID");
l2=new JLabel("Enter student name");
l3=new JLabel("Enter Father name");
l4=new JLabel("select Gender");
l5=new JLabel("select Course");
l6=new JLabel("session start");
l7=new JLabel("session end");
l8=new JLabel("select Branch");
l9=new JLabel("select sem");
l10=new JLabel("bug");
t1=new JTextField();
t2=new JTextField();
t3=new JTextField();
b1=new JButton("save");
b2=new JButton("close");
b3=new JButton("search");
c1=new Choice();
c1.addItem("male");
c1.addItem("fimale");
c1.addItem("other");
c2=new Choice();
c2.addItem("btech");
c2.addItem("mtech");
c2.addItem("Mbbs");
c3=new Choice();
c3.addItem("1 Jul");
c3.addItem("1 Aug");
c3.addItem("1 sep");
c4=new Choice();
c4.addItem("1 jan");
c4.addItem("1 feb");
c4.addItem("1 Mar");
c5=new Choice();
c5.addItem("cse");
c5.addItem("Cyber");
c5.addItem("EE");
c6=new Choice();
c6.addItem("odd sem");
c6.addItem("even sem");

 }
public void setUpUpdateStudentDetail()
{ 
frm.setLayout(null);
frm.setSize(900,1000);
l10.setBounds(470,25,100,25);
l1.setBounds(50,50,150,25);
t1.setBounds(210,50,250,25);
b3.setBounds(470,50,100,25);
l2.setBounds(50,100,150,25);
t2.setBounds(210,100,250,25);
l3.setBounds(50,150,150,25);
t3.setBounds(210,150,250,25);
l4.setBounds(50,200,150,25);
c1.setBounds(210,200,250,25);
l5.setBounds(50,250,150,25);
c2.setBounds(210,250,250,25);
l6.setBounds(50,250,150,25);
c3.setBounds(210,250,250,25);
l7.setBounds(50,300,150,25);
c4.setBounds(210,300,250,25);
l8.setBounds(50,350,150,25);
c5.setBounds(210,350,250,25);
l9.setBounds(50,400,150,25);
c6.setBounds(210,400,250,25);
b1.setBounds(50,450,100,25);
b2.setBounds(160,450,100,25);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
frm.add(l1);
frm.add(t1);
frm.add(l2);
frm.add(t2);
frm.add(l3);
frm.add(t3);
frm.add(l4);
frm.add(c1);
frm.add(l5);
frm.add(c2);
frm.add(l6);
frm.add(c3);
frm.add(l7);
frm.add(c4);
frm.add(l8);
frm.add(c5);
frm.add(l9);
frm.add(c6);
frm.add(b1);
frm.add(b2);
frm.add(b3);
frm.add(l10);
frm.setVisible(true);
}
public void connect()
{
try
{
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
con = DriverManager.getConnection("jdbc:odbc:DSNLMS");
}
catch(Exception ex)
{
System.out.println("Connection Error "+ex);
}
}
public void updateData()
{
try
{
pst=con.prepareStatement("update addnewstudent set entername='"+s2+"',enterfathername='"+s3+"',selectgender='"+s4+"',selectcourse='"+s5+"',sessionstart='"+s6+"',sessionend='"+s7+"',selectbranch='"+s8+"',selectsemester='"+s9+"' where enterstudentid='"+s1+"'");
pst.executeUpdate();
}
catch(SQLException se)
{
System.out.print("Exception : "+se);
}
}
public void getValue()
{
s1=t1.getText();
s2=t2.getText();
s3=t3.getText();
s4=c1.getSelectedItem();
s5=c2.getSelectedItem();
s6=c3.getSelectedItem();
s7=c4.getSelectedItem();
s8=c5.getSelectedItem();
s9=c6.getSelectedItem();
}
public void searchData()
{
s1=t1.getText();
connect();
try
{
st=con.createStatement();
rec=st.executeQuery("Select *from addnewstudent  where enterstudentid='"+s1+"'");
if(rec.next())
{
t2.setText(rec.getString(2));
t3.setText(rec.getString(3));
c1.select(rec.getString(5));
c2.select(rec.getString(6));
c3.select(rec.getString(7));
c4.select(rec.getString(8));
c5.select(rec.getString(9));
c6.select(rec.getString(10));
l10.setText("");
}
else
{
l10.setText("Not found");
}
}
catch(SQLException se)
{
System.out.print("Exception : "+se);
}
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1){
connect();
getValue();
updateData();
}
else if(ae.getSource()==b2)
{
frm.setVisible(false);
}
else if(ae.getSource()==b3)
{
searchData();
}
}
}


