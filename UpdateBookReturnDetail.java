package lms;
import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class UpdateBookReturnDetail extends Frame implements ActionListener
{
String s1="",s2="",s3="",s4="",s5="",s6="",s7="",s8="",s9="",s10="",s11="",s12="",s13="",s14="",s15="",s16="",s17="",s18="",s19="",s20="",s21="";
JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22;
JButton b1,b2,b3;
Choice c1;
Frame frm;
Connection con;
PreparedStatement pst;
Statement st;
ResultSet rec;
public UpdateBookReturnDetail()
{
frm = new Frame();
l1=new JLabel("Student ID");
l2=new JLabel("Book Id");
l3=new JLabel("Name");
l4=new JLabel("Book Name");
l5=new JLabel("Father Name");
l6=new JLabel("ISBN No");
l7=new JLabel("Gender");
l8=new JLabel("Auther name");
l9=new JLabel("course");
l10=new JLabel("Price");
l11=new JLabel("session start");
l12=new JLabel("Publication yesr");
l13=new JLabel("session end");
l14=new JLabel("publisher name");
l15=new JLabel("Branch");
l16=new JLabel("Book isssue");
l17=new JLabel("Sem");
l18=new JLabel("Book return");
l19=new JLabel("Number of days");
l20=new JLabel("Fine Amount");
l21=new JLabel("Amount paid");
l22=new JLabel("bug");
t1=new JTextField();
t2=new JTextField();
t3=new JTextField();
t4=new JTextField();
t5=new JTextField();
t6=new JTextField();
t7=new JTextField();
t8=new JTextField();
t9=new JTextField();
t10=new JTextField();
t11=new JTextField();
t12=new JTextField();
t13=new JTextField();
t14=new JTextField();
t15=new JTextField();
t16=new JTextField();
t17=new JTextField();
t18=new JTextField();
t19=new JTextField();
t20=new JTextField();
b1=new JButton("save");
b2=new JButton("close");
b3=new JButton("search");
c1=new Choice();
c1.addItem("");
c1.addItem("");
c1.addItem("");
t17=new JTextField();
 }
public void setUpUpdateBookReturnDetail()
{ 
frm.setLayout(null);
frm.setSize(1500,2000);
l22.setBounds(400,24,100,25);
l1.setBounds(50,50,150,25);
t1.setBounds(210,50,250,25);
b3.setBounds(470,50,100,25);
l2.setBounds(580,50,150,25);
c1.setBounds(730,50,250,25);
l3.setBounds(50,100,150,25);
t2.setBounds(210,100,250,25);
l4.setBounds(470,100,150,25);
t3.setBounds(630,100,250,25);
l5.setBounds(50,150,150,25);
t4.setBounds(210,150,250,25);
l6.setBounds(470,150,150,25);
t5.setBounds(630,150,250,25);
l7.setBounds(50,200,150,25);
t6.setBounds(210,200,250,25);
l8.setBounds(470,200,150,25);
t7.setBounds(630,200,250,25);
l9.setBounds(50,300,150,25);
t8.setBounds(210,300,250,25);
l10.setBounds(470,300,150,25);
t9.setBounds(630,300,250,25);
l11.setBounds(50,350,150,25);
t10.setBounds(210,350,250,25);
l12.setBounds(470,350,150,25);
t11.setBounds(630,350,250,25);
l13.setBounds(50,400,150,25);
t12.setBounds(210,400,250,25);
l14.setBounds(470,400,150,25);
t13.setBounds(630,400,250,25);
l15.setBounds(50,450,150,25);
t14.setBounds(210,450,250,25);
l16.setBounds(470,450,150,25);
t15.setBounds(630,450,250,25);
l17.setBounds(50,500,150,25);
t16.setBounds(210,500,250,25);
l18.setBounds(470,500,150,25);
t17.setBounds(630,500,250,25);
l19.setBounds(470,560,150,25);
t18.setBounds(630,560,250,25);
l20.setBounds(470,600,150,25);
t19.setBounds(630,600,250,25);
l21.setBounds(470,650,150,25);
t20.setBounds(630,650,250,25);
b1.setBounds(50,700,150,25);
b2.setBounds(210,700,150,25);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
frm.add(l22);
frm.add(l1);
frm.add(t1);
frm.add(l2);
frm.add(c1);
frm.add(l3);
frm.add(t2);
frm.add(l4);
frm.add(t3);
frm.add(l5);
frm.add(t4);
frm.add(l6);
frm.add(t5);
frm.add(l7);
frm.add(t6);
frm.add(l8);
frm.add(t7);
frm.add(l9);
frm.add(t8);
frm.add(l10);
frm.add(t9);
frm.add(l11);
frm.add(t10);
frm.add(l12);
frm.add(t11);
frm.add(l13);
frm.add(t12);
frm.add(l14);
frm.add(t13);
frm.add(l15);
frm.add(t14);
frm.add(l16);
frm.add(t15);
frm.add(l17);
frm.add(t16);
frm.add(l18);
frm.add(t17);
frm.add(l19);
frm.add(t18);
frm.add(l20);
frm.add(t19);
frm.add(l21);
frm.add(t20);
frm.add(b1);
frm.add(b2);
frm.add(b3);
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
pst=con.prepareStatement("update bookreturn set bookid='"+s2+"', name='"+s3+"',bookname='"+s4+"',fathername='"+s5+"',isbnno='"+s6+"',gender='"+s7+"',authername='"+s8+"',course='"+s9+"',price='"+s10+"',sessionstart='"+s11+"',publicationyear='"+s12+"',sessionend='"+s13+"',publishername='"+s14+"',branch='"+s15+"',bookissue='"+s16+"',sem='"+s17+"',bookreturn='"+s18+"',numberofdays='"+s19+"',fineamaunt='"+s20+"',amauntpaid='"+s21+"' where studentid='"+s1+"'");
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
s2=c1.getSelectedItem();
s3=t2.getText();
s4=t3.getText();
s5=t4.getText();
s6=t5.getText();
s7=t6.getText();
s8=t7.getText();
s9=t8.getText();
s10=t9.getText();
s11=t10.getText();
s12=t11.getText();
s13=t12.getText();
s14=t13.getText();
s15=t14.getText();
s16=t15.getText();
s17=t16.getText();
s18=t17.getText();
s19=t18.getText();
s20=t19.getText();
s21=t20.getText();
}
public void searchData()
{
s1=t1.getText();
connect();
try
{
st=con.createStatement();
rec=st.executeQuery("Select *from bookreturn where studentid='"+s1+"'");
if(rec.next())
{
c1.select(rec.getString(2));
t2.setText(rec.getString(3));
t3.setText(rec.getString(4));
t4.setText(rec.getString(5));
t5.setText(rec.getString(6));
t6.setText(rec.getString(7));
t7.setText(rec.getString(8));
t8.setText(rec.getString(9));
t9.setText(rec.getString(10));
t10.setText(rec.getString(11));
t11.setText(rec.getString(12));
t12.setText(rec.getString(13));
t13.setText(rec.getString(14));
t14.setText(rec.getString(15));
t15.setText(rec.getString(16));
t16.setText(rec.getString(17));
t17.setText(rec.getString(18));
t18.setText(rec.getString(19));
t19.setText(rec.getString(20));
t20.setText(rec.getString(21));
l22.setText("");
}
else
{
l22.setText("Not found");
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


