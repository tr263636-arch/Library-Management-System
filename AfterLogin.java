package lms;
import java.awt.*;
import java.awt.event.*;
public class AfterLogin extends Frame implements ActionListener
{
Button b1,b2,b3,b4,b5,b6,b7;
Frame frm;
public AfterLogin()
{
frm = new Frame();
b1=new Button("ADD NEW STUDENT");
b2=new Button("ADD NEW BOOK");
b3=new Button("BOOK ISSUE");
b4=new Button("BOOK RETURN");
b5=new Button("FORGET PASWORD");
b6=new Button("CREATE ACC");
b7=new Button("Exit");
}
public void setUpAfterLogin()
{ 
frm.setLayout(null);
frm.setSize(1500,2000);
b1.setBounds(470,50,150,25);
b2.setBounds(470,100,150,25);
b3.setBounds(470,150,150,25);
b4.setBounds(470,200,150,25);
b5.setBounds(470,250,150,25);
b6.setBounds(470,300,150,25);
b7.setBounds(470,350,150,25);
b1.addActionListener(this);
b2.addActionListener(this);
b3.addActionListener(this);
b4.addActionListener(this);
b5.addActionListener(this);
b6.addActionListener(this);
b7.addActionListener(this);
frm.add(b1);
frm.add(b2);
frm.add(b3);
frm.add(b4);
frm.add(b5);
frm.add(b6);
frm.add(b7);
frm.setVisible(true);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==b1)
{
AddNewStudent ob=new AddNewStudent();
ob.setUpAddNewStudent();
}
else if(ae.getSource()==b2)
{
AddNewBooks ob=new AddNewBooks();
ob.setUpAddNewBooks();
}
else if(ae.getSource()==b3)
{
BookIssue ob=new BookIssue();
ob.setUpBookIssue();
}
if(ae.getSource()==b4)
{
BookReturn ob=new BookReturn();
ob.setUpBookReturn();
}
if(ae.getSource()==b5)
{
ForgetPsw ob=new ForgetPsw();
ob.setUpForgetPsw();
}
if(ae.getSource()==b6)
{
CreateAcc ob=new CreateAcc();
ob.setUpCreateAcc();
}
}
}


