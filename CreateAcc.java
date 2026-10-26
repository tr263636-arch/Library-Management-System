package lms;
import java.awt.*;
import java.awt.event.*;
public class CreateAcc extends Frame implements ActionListener
{
TextField t1,t2,t3,t4;
Label l1,l2,l3,l4,l5;
Button b1,b2;
Choice c1;
Frame frm;
public CreateAcc()
{
frm = new Frame();
l1=new Label("Enter User ID");
l2=new Label("Enter Pasword");
l3=new Label("ReEnter Pasword");
l4=new Label("Selet Security Quetion");
l5=new Label("Answere");
t1=new TextField();
t2=new TextField();
t3=new TextField();
t4=new TextField();
c1=new Choice();
c1.addItem("What is your full name");
c1.addItem("what is your college name");
c1.addItem("what your city name");
b1=new Button("SAVE");
b2=new Button("CLOSE");
}
public void setUpCreateAcc()
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
t4.setBounds(210,250,250,25);
b1.setBounds(50,300,100,25);
b2.setBounds(160,300,100,25);
b1.addActionListener(this);
b2.addActionListener(this);
frm.add(l1);
frm.add(l2);
frm.add(l3);
frm.add(l4);
frm.add(l5);
frm.add(t3);
frm.add(t4);
frm.add(t1);
frm.add(t2);
frm.add(b1);
frm.add(b2);
frm.add(c1);
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


