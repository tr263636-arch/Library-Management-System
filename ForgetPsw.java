package lms;
import java.awt.*;
import java.awt.event.*;
public class ForgetPsw extends Frame implements ActionListener
{
TextField t1,t2,t3,t4;
Label l1,l2,l3,l4;
Button b1,b2,b3;
Frame frm;
public ForgetPsw()
{
frm = new Frame();
l1=new Label("Enter User ID");
l2=new Label("Your security Quesion");
l3=new Label("Give Answere");
l4=new Label("Your Pasword");
t1=new TextField();
t2=new TextField();
t3=new TextField();
t4=new TextField();
b1=new Button("OK");
b2=new Button("RETRIV");
b3=new Button("CLOSE");
}
public void setUpForgetPsw()
{ 
frm.setLayout(null);
frm.setSize(900,1000);
l1.setBounds(50,50,150,25);
t1.setBounds(210,50,250,25);
b1.setBounds(470,50,100,25);
l2.setBounds(50,100,150,25);
t2.setBounds(210,100,250,25);
l3.setBounds(50,150,150,25);
t3.setBounds(210,150,250,25);
b2.setBounds(470,150,100,25);
l4.setBounds(50,200,150,25);
t4.setBounds(210,200,250,25);
b3.setBounds(470,200,100,25);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
frm.add(l1);
frm.add(l2);
frm.add(l3);
frm.add(l4);
frm.add(t3);
frm.add(t4);
frm.add(t1);
frm.add(t2);
frm.add(b1);
frm.add(b2);
frm.add(b3);
frm.setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b3)
{
frm.setVisible(false);
}
}
}


