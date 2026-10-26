package lms;
import java.awt.*;
import java.awt.event.*;
public class Login extends Frame implements ActionListener
{
TextField t1,t2;
Label l1,l2;
Button b1,b2,b3,b4;
Frame frm;
public Login()
{
frm = new Frame();
l1=new Label("Enter User ID");
l2=new Label("Enter password");
t1=new TextField();
t2=new TextField();
b1=new Button("Login");
b2=new Button("Exit");
b3=new Button("Forget PSW");
b4=new Button("change PSW");
}
public void setUpLogin()
{ 
frm.setLayout(null);
frm.setSize(900,1000);
l1.setBounds(50,50,150,25);
t1.setBounds(210,50,250,25);
b1.setBounds(470,50,100,25);
l2.setBounds(50,100,150,25);
t2.setBounds(210,100,250,25);
b2.setBounds(470,100,100,25);
b3.setBounds(50,150,150,25);
b4.setBounds(210,150,150,25);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
frm.add(l1);
frm.add(l2);
frm.add(t1);
frm.add(t2);
frm.add(b1);
frm.add(b2);
frm.add(b3);
frm.add(b4);
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


