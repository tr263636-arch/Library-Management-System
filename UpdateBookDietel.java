package lms;
import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class UpdateBookDietel extends Frame implements ActionListener
{
String s1="",s2="",s3="",s4="",s5="",s6="",s7="";
JTextField t1,t2,t3,t4,t5;
JLabel l1,l2,l3,l4,l5,l6,l7,l8;
JButton b1,b2,b3;
Choice c1,c2;
Frame frm;
Connection con;
PreparedStatement pst;
Statement st;
ResultSet rec;
public UpdateBookDietel()
{
frm = new Frame();
l1=new JLabel("Book Id");
l2=new JLabel("Book Name");
l3=new JLabel("ISBN NO");
l4=new JLabel("Author Name");
l5=new JLabel("Price");
l6=new JLabel("Publication Year");
l7=new JLabel("Publisher Name");
l8=new JLabel("Bug");
t1=new JTextField();
t2=new JTextField();
t3=new JTextField();
t4=new JTextField();
t5=new JTextField();
b1=new JButton("save");
b2=new JButton("close");
b3=new JButton("search");
c1=new Choice();
c1.addItem("500");
c1.addItem("600");
c1.addItem("700");
c2=new Choice();
c2.addItem("2008");
c2.addItem("2020");
c2.addItem("2024");
 }
public void setUpUpdateBookDietel()
{ 
frm.setLayout(null);
frm.setSize(900,1000);
l8.setBounds(210,25,100,25);
l1.setBounds(50,50,150,25);
t1.setBounds(210,50,250,25);
b3.setBounds(470,50,100,25);
l2.setBounds(50,100,150,25);
t2.setBounds(210,100,250,25);
l3.setBounds(50,150,150,25);
t3.setBounds(210,150,250,25);
l4.setBounds(50,200,150,25);
t4.setBounds(210,200,250,25);
l5.setBounds(50,250,150,25);
c1.setBounds(210,250,250,25);
l6.setBounds(50,300,150,25);
c2.setBounds(210,300,250,25);
l7.setBounds(50,350,150,25);
t5.setBounds(210,350,250,25);
b1.setBounds(50,400,100,25);
b2.setBounds(160,400,100,25);
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
frm.add(t4);
frm.add(l5);
frm.add(c1);
frm.add(l6);
frm.add(c2);
frm.add(l7);
frm.add(t5);
frm.add(b1);
frm.add(b2);
frm.add(b3);
frm.add(l8);
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
pst=con.prepareStatement("update addnewbook set bookname='"+s2+"',isbnno= '"+s3+"',authername='"+s4+"',price='"+s5+"',publication='"+s6+"',publishername='"+s7+"' where bookid='"+s1+"'");
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
s4=t4.getText();
s5=c1.getSelectedItem();
s6=c2.getSelectedItem();
s7=t5.getText();

}
public void searchData()
{
s1=t1.getText();
connect();
try
{
st=con.createStatement();
rec=st.executeQuery("Select *from addnewbook where bookid='"+s1+"'");
if(rec.next())
{
t2.setText(rec.getString(2));
t3.setText(rec.getString(3));
t4.setText(rec.getString(4));
c1.select(rec.getString(5));
c2.select(rec.getString(6));
t5.setText(rec.getString(7));
l8.setText("");
}
else
{
l8.setText("Not found");
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




