package lms;
import java.awt.*;
import java.awt.event.*;
public class BookReturn extends Frame implements ActionListener
{
TextField t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,t20;
Label l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21;
Button b1,b2;
Choice c1;
Frame frm;
public BookReturn()
{
frm = new Frame();
l1=new Label("Student ID");
l2=new Label("Book Id");
l3=new Label("Name");
l4=new Label("Book Name");
l5=new Label("Father Name");
l6=new Label("ISBN No");
l7=new Label("Gender");
l8=new Label("Auther name");
l9=new Label("course");
l10=new Label("Price");
l11=new Label("session start");
l12=new Label("Publication yesr");
l13=new Label("session end");
l14=new Label("publisher name");
l15=new Label("Branch");
l16=new Label("Book isssue");
l17=new Label("Sem");
l18=new Label("Book return");
l19=new Label("Number of days");
l20=new Label("Fine Amount");
l21=new Label("Amount paid");
t1=new TextField();
t2=new TextField();
t3=new TextField();
t4=new TextField();
t5=new TextField();
t6=new TextField();
t7=new TextField();
t8=new TextField();
t9=new TextField();
t10=new TextField();
t11=new TextField();
t12=new TextField();
t13=new TextField();
t14=new TextField();
t15=new TextField();
t16=new TextField();
t17=new TextField();
t18=new TextField();
t19=new TextField();
t20=new TextField();
b1=new Button("save");
b2=new Button("close");
c1=new Choice();
c1.addItem("");
c1.addItem("");
c1.addItem("");
t17=new TextField();
 }
public void setUpBookReturn()
{ 
frm.setLayout(null);
frm.setSize(1500,2000);
l1.setBounds(50,50,150,25);
c1.setBounds(210,50,250,25);
l2.setBounds(470,50,150,25);
t1.setBounds(630,50,250,25);
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
frm.add(l1);
frm.add(l2);
frm.add(l3);
frm.add(l4);
frm.add(l5);
frm.add(l6);
frm.add(l7);
frm.add(l8);
frm.add(l9);
frm.add(l10);
frm.add(l11);
frm.add(l12);
frm.add(l13);
frm.add(l14);
frm.add(l15);
frm.add(l16);
frm.add(l17);
frm.add(l18);
frm.add(t6);
frm.add(t1);
frm.add(t2);
frm.add(t3);
frm.add(t4);
frm.add(t5);
frm.add(t7);
frm.add(t8);
frm.add(t9);
frm.add(t10);
frm.add(t11);
frm.add(t12);
frm.add(t13);
frm.add(t14);
frm.add(t15);
frm.add(t18);
frm.add(t19);
frm.add(t20);
frm.add(l19);
frm.add(l20);
frm.add(l21);
frm.add(t16);
frm.add(b1);
frm.add(b2);
frm.add(c1);
frm.add(t17);
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


