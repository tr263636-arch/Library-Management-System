package lms;
import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
public class UpdateBooksIssueDetail extends Frame implements ActionListener
{
String s1="",s2="",s3="",s4="",s5="",s6="",s7="",s8="",s9="",s10="",s11="",s12="",s13="",s14="",s15="",s16="",s17="",s18="";
JTextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16;
JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19;
JButton b1,b2,b3;
Choice c1,c2;
Frame frm;
Connection con;
PreparedStatement pst;
Statement st;
ResultSet rec;
public UpdateBooksIssueDetail()
{
frm = new Frame("Update Book Issue");
l1=new JLabel("Book Id");
l2=new JLabel("Student Id");
l3=new JLabel("Book Name");
l4=new JLabel("Enter Name");
l5=new JLabel("ISBN No");
l6=new JLabel("Enter father Name");
l7=new JLabel("Author Name");
l8=new JLabel("Select Gender");
l9=new JLabel("Price");
l10=new JLabel("Select Course");
l11=new JLabel("Publication Year");
l12=new JLabel("Session start");
l13=new JLabel("Publisher Name");
l14=new JLabel("Session end");
l15=new JLabel("Book issue");
l16=new JLabel("select Branch");
l17=new JLabel("Book return");
l18=new JLabel("select sem");
l19=new JLabel("bug");
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
b1=new JButton("save");
b2=new JButton("close");
b3=new JButton("search");
c1=new Choice();
c1.addItem("java1");
c1.addItem("flat1");
c1.addItem("c++");
c2=new Choice();
c2.addItem("7");
c2.addItem("5");
c2.addItem("9");
 }
public void setUpUpdateBooksIssueDetail()
{ 
frm.setLayout(null);
frm.setSize(1500,2000);
l19.setBounds(400,24,100,25);
l1.setBounds(50,50,150,25);
c1.setBounds(210,50,250,25);
b3.setBounds(470,50,100,25);
l2.setBounds(580,50,150,25);
c2.setBounds(740,50,250,25);
l3.setBounds(50,100,150,25);
t1.setBounds(210,100,250,25);
l4.setBounds(470,100,150,25);
t2.setBounds(630,100,250,25);
l5.setBounds(50,150,150,25);
t3.setBounds(210,150,250,25);
l6.setBounds(470,150,150,25);
t4.setBounds(630,150,250,25);
l7.setBounds(50,200,150,25);
t5.setBounds(210,200,250,25);
l8.setBounds(470,200,150,25);
t6.setBounds(630,200,250,25);
l9.setBounds(50,300,150,25);
t7.setBounds(210,300,250,25);
l10.setBounds(470,300,150,25);
t8.setBounds(630,300,250,25);
l11.setBounds(50,350,150,25);
t9.setBounds(210,350,250,25);
l12.setBounds(470,350,150,25);
t10.setBounds(630,350,250,25);
l13.setBounds(50,400,150,25);
t11.setBounds(210,400,250,25);
l14.setBounds(470,400,150,25);
t12.setBounds(630,400,250,25);
l15.setBounds(50,450,150,25);
t13.setBounds(210,450,250,25);
l16.setBounds(470,450,150,25);
t14.setBounds(630,450,250,25);
l17.setBounds(50,500,150,25);
t15.setBounds(210,500,250,25);
l18.setBounds(470,500,150,25);
t16.setBounds(630,500,250,25);
b1.setBounds(50,560,150,25);
b2.setBounds(210,560,150,25);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
frm.add(l1);
frm.add(c1);
frm.add(l2);
frm.add(c2);
frm.add(l3);
frm.add(t1);
frm.add(l4);
frm.add(t2);
frm.add(l5);
frm.add(t3);
frm.add(l6);
frm.add(t4);
frm.add(l7);
frm.add(t5);
frm.add(l8);
frm.add(t6);
frm.add(l9);
frm.add(t7);
frm.add(l10);
frm.add(t8);
frm.add(l11);
frm.add(t9);
frm.add(l12);
frm.add(t10);
frm.add(l13);
frm.add(t11);
frm.add(l14);
frm.add(t12);
frm.add(l15);
frm.add(t13);
frm.add(l16);
frm.add(t14);
frm.add(l17);
frm.add(t15);
frm.add(l18);
frm.add(t16);
frm.add(b1);
frm.add(b2);
frm.add(b3);
frm.add(l19);
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
pst=con.prepareStatement("update bookissue set entername ='"+s4+"', studentid='"+s2+"', bookname='"+s3+"', isbnno='"+s5+"', enterfathername='"+s6+"', authorname='"+s7+"', selectgender='"+s8+"', price='"+s9+"', selectcourse='"+s10+"', publicationyear='"+s11+"', sessionstart='"+s12+"', publishername='"+s13+"', sessionend='"+s14+"', bookissue='"+s15+"', selectbranch='"+s16+"', bookreturn='"+s17+"', sem='"+s18+"' where bookid='"+s1+"'");
pst.executeUpdate();
}
catch(SQLException se)
{
System.out.print("Exception : "+se);
}
}
public void getValue()
{
s1=c1.getSelectedItem();
s2=c2.getSelectedItem();
s3=t1.getText();
s4=t2.getText();
s5=t3.getText();
s6=t4.getText();
s7=t5.getText();
s8=t6.getText();
s9=t7.getText();
s10=t8.getText();
s11=t9.getText();
s12=t10.getText();
s13=t11.getText();
s14=t12.getText();
s15=t13.getText();
s16=t14.getText();
s17=t15.getText();
s18=t16.getText();
}
public void searchData()
{
s1=c1.getSelectedItem();
connect();
try
{
st=con.createStatement();
rec=st.executeQuery("Select *from bookissue where bookid='"+s1+"'");
if(rec.next())
{
c2.select(rec.getString(2));
t1.setText(rec.getString(3));
t2.setText(rec.getString(4));
t3.setText(rec.getString(5));
t4.setText(rec.getString(6));
t5.setText(rec.getString(7));
t6.setText(rec.getString(8));
t7.setText(rec.getString(9));
t8.setText(rec.getString(10));
t9.setText(rec.getString(11));
t10.setText(rec.getString(12));
t11.setText(rec.getString(13));
t12.setText(rec.getString(14));
t13.setText(rec.getString(15));
t14.setText(rec.getString(16));
t15.setText(rec.getString(17));
t16.setText(rec.getString(18));
l19.setText("");
}
else
{
l19.setText("Not found");
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


