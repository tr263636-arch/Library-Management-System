package lms;
import java.awt.*;
import java.awt.event.*;
public class AddNewBooks extends Frame implements ActionListener
{
TextField t1,t2,t3,t4,t5;
Label l1,l2,l3,l4,l5,l6,l7;
Button b1,b2;
Choice c1,c2;
Frame frm;
public AddNewBooks()
{
frm = new Frame();
l1=new Label("Book Id");
l2=new Label("Book Name");
l3=new Label("ISBN NO");
l4=new Label("Author Name");
l5=new Label("Price");
l6=new Label("Publication Year");
l7=new Label("Publisher Name");
t1=new TextField();
t2=new TextField();
t3=new TextField();
t4=new TextField();
t5=new TextField();
b1=new Button("save");
b2=new Button("close");
c1=new Choice();
c1.addItem("500");
c1.addItem("600");
c1.addItem("700");
c2=new Choice();
c2.addItem("2008");
c2.addItem("2020");
c2.addItem("2024");
 }
public void setUpAddNewBooks()
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
frm.add(l1);
frm.add(l2);
frm.add(t1);
frm.add(t2);
frm.add(t3);
frm.add(t4);
frm.add(t5);
frm.add(b1);
frm.add(b2);
frm.add(l3);
frm.add(l4);
frm.add(l5);
frm.add(l6);
frm.add(l7);
frm.add(c1);
frm.add(c2);
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


