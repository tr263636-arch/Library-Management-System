package lms;
import java.awt.*;
import java.awt.event.*;
public class AddNewStudent extends Frame implements ActionListener
{
TextField t1,t2,t3;
Label l1,l2,l3,l4,l5,l6,l7,l8,l9;
Button b1,b2;
Choice c1,c2,c3,c4,c5,c6;
Frame frm;
public AddNewStudent()
{
frm = new Frame();
l1=new Label("Enter Student ID");
l2=new Label("Enter student name");
l3=new Label("Enter Father name");
l4=new Label("select Gender");
l5=new Label("select Course");
l6=new Label("session start");
l7=new Label("session end");
l8=new Label("select Branch");
l9=new Label("select sem");
t1=new TextField();
t2=new TextField();
t3=new TextField();
b1=new Button("save");
b2=new Button("close");
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
public void setUpAddNewStudent()
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
frm.add(l1);
frm.add(l2);
frm.add(t1);
frm.add(t2);
frm.add(t3);
frm.add(b1);
frm.add(b2);
frm.add(l3);
frm.add(l4);
frm.add(l5);
frm.add(l6);
frm.add(l7);
frm.add(l8);
frm.add(l9);
frm.add(c1);
frm.add(c2);
frm.add(c3);
frm.add(c4);
frm.add(c5);
frm.add(c6);
frm.setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b2)
{
frm.setVisible(false);
}
}
}


