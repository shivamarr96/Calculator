import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;
import javax.swing.*;
import java.io.*;
class Calculator	implements ActionListener
{	
	JFrame frame;
	JTextArea cal;
	JPanel panel,panel1;
	JButton num1,num2,num3,num4,num5,num6,num7,num8,num9,num0;
	JButton oppl,opmin,opdiv,opmul,opequal,clear;
	int opd1,opd2,result;
	String operation="";
	Calculator()
	{
	frame=new JFrame("Calculator");
    cal=new JTextArea();
    cal.setFont(new Font("Comic Sans MS", Font.ITALIC, 40));
    num1=new JButton("1");
    num2=new JButton("2");
    num3=new JButton("3");
    num4=new JButton("4");
    num5=new JButton("5");
    num6=new JButton("6");
    num7=new JButton("7");
    num8=new JButton("8");
    num9=new JButton("9");
    num0=new JButton("0");
    oppl=new JButton("+");
    opmin=new JButton("-");
    opmul=new JButton("*");
    opdiv=new JButton("/");
	opequal=new JButton("=");
	clear=new JButton("CLR");
	panel=new JPanel();
	panel1=new JPanel();
	panel.setLayout(new GridLayout(1,1));
	panel1.setLayout(new GridLayout(4,4));
	
	num9.addActionListener(this);
	num8.addActionListener(this);
	num7.addActionListener(this);
	num6.addActionListener(this);
	num5.addActionListener(this);
	num4.addActionListener(this);
	num3.addActionListener(this);
	num2.addActionListener(this);
	num1.addActionListener(this);
	num0.addActionListener(this);
	oppl.addActionListener(this);
	opmin.addActionListener(this);
	opmul.addActionListener(this);
	opdiv.addActionListener(this);
	clear.addActionListener(this);
	opequal.addActionListener(this);
	

	panel.add(cal);
	panel1.add(num9);
	panel1.add(num8);
	panel1.add(num7);
	panel1.add(oppl);
	panel1.add(num6);
	panel1.add(num5);
	panel1.add(num4);
	panel1.add(opmin);
	panel1.add(num3);
	panel1.add(num2);
	panel1.add(num1);
	panel1.add(opmul);
	panel1.add(opequal);
	panel1.add(num0);
	panel1.add(opdiv);
	panel1.add(clear);
	frame.setLayout(new GridLayout(2,1));
	frame.add(panel);
	frame.add(panel1);
	frame.setVisible(true);
	frame.pack();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		new Calculator();
	}
	public void actionPerformed(ActionEvent e)
{
if(e.getSource()==num0)
{
	cal.append("0");
}
if(e.getSource()==num1)
{
	cal.append("1");
}if(e.getSource()==num2)
{
	cal.append("2");
}if(e.getSource()==num3)
{
	cal.append("3");
}if(e.getSource()==num4)
{
	cal.append("4");
}if(e.getSource()==num5)
{
	cal.append("5");
}if(e.getSource()==num6)
{
	cal.append("6");
}
if(e.getSource()==num7)
{
	cal.append("7");
}
if(e.getSource()==num8)
{
	cal.append("8");
}
if(e.getSource()==num9)
{
	cal.append("9");
}
if(e.getSource()==oppl)
{
	opd1=Integer.parseInt(cal.getText());
  	cal.setText("");
  	operation="+";
 
}

if(e.getSource()==opmin)
{
	opd1=Integer.parseInt(cal.getText());
  	cal.setText("");
  	operation="-";
}
if(e.getSource()==opmul)
{
	opd1=Integer.parseInt(cal.getText());
  	cal.setText("");
  	operation="*";
  	
}
if(e.getSource()==opdiv)
{
	opd1=Integer.parseInt(cal.getText());
  	cal.setText("");
  	operation="/";
}
if(e.getSource()==opequal)
{
	opd2=Integer.parseInt(cal.getText());
	switch(operation)
	{
	 case "+":result=opd1+opd2;
	 break;

	 case "-":result=opd1-opd2;
	 break;

	 case "*":result=opd1*opd2;
	 break;

	 case "/":result=opd1/opd2;
	 break;

	 default:result=opd2;

	}
	//System.out.println(result);
	cal.setText(Integer.toString(result));
}

if(e.getSource()==clear)
{
	opd1=0;
	opd2=0;
  	cal.setText("");
}
}
}