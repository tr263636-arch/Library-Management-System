package lms;
import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class ChangePsw extends Frame implements ActionListener
{
String s1="",s2="",s3="",s4="";
JTextField t1,t2,t3,t4;
JLabel l1,l2,l3,l4;
JButton b1,b2;
Frame frm;
Connection con;
PreparedStatement pst;
public ChangePsw()
{
frm = new Frame();
l1=new JLabel("Enter User ID");
l2=new JLabel("Enter Current Psw");
l3=new JLabel("Enter New Psw");
l4=new JLabel("ReEnter New Psw");
t1=new JTextField();
t2=new JTextField();
t3=new JTextField();
t4=new JTextField();
b1=new JButton("CHANGE");
b2=new JButton("CLOSE");
}
public void setUpChangePsw()
{ 
frm.setLayout(null);
frm.setSize(900,1000);
l1.setBounds(50,50,150,25);
t1.setBounds(210,50,250,25);
l2.setBounds(50,100,150,25);
t2.setBounds(210,100,250,25);
l3.setBounds(50,150,150,25);
t3.setBounds(210,150,250,25);
l4.setBounds(50,200,150,25);
t4.setBounds(210,200,250,25);
b1.setBounds(50,300,100,25);
b2.setBounds(160,300,100,25);
b1.addActionListener(this);
b2.addActionListener(this);
frm.add(l1);
frm.add(t1);
frm.add(l2);
frm.add(t2);
frm.add(l3);
frm.add(t3);
frm.add(l4);
frm.add(t4);
frm.add(b1);
frm.add(b2);
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
s1=t1.getText();
s2=t2.getText();
s3=t3.getText();
s4=t4.getText();
pst=con.prepareStatement("update createacc set psw='"+s3+"', cpsw='"+s4+"'where userid='"+s1+"' and psw='"+s2+"'");
pst.executeUpdate();
}
catch(SQLException se)
{
System.out.print("Exception : "+se);
}
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
connect();
updateData();

}
else if(ae.getSource()==b2)
{
frm.setVisible(false);
}
}
}


