
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Str_ops implements ActionListener{
	String s1,s2,s3;
	Frame f;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11;
	Panel p;
	TextField tf1,tf2,tf3;
	GridLayout g;
	Str_ops(){
		f=new Frame("String Operations");
		p = new Panel();
		f.setLayout(new FlowLayout());
		b1 = new Button("Reverse");    // completed
		b2 = new Button("Char At()");  // completed
		b3 = new Button("To Upper");    //completed
		b4 = new Button("To Lower");   //completed
		b5 = new Button("Concat");   //completed
		b6 = new Button("First Position of: ");   //completed
		b7 = new Button("Last Position of: ");  //completed;
		b8 = new Button("Multiply");             // completed
		b9 = new Button("String after pos: ");
		b10 = new Button("String before pos: ");
		b11 = new Button("Clear");
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b10.addActionListener(this);
		b11.addActionListener(this);
		tf1 = new TextField(50);
		tf2 = new TextField(50);
		tf3 = new TextField(50);
		f.add(tf1);f.add(tf2);f.add(tf3);
		g = new GridLayout(4,4,10,20);
        p.setLayout(g);
        p.add(b1);p.add(b2);p.add(b3);p.add(b4);p.add(b5);p.add(b6);p.add(b7);p.add(b8);p.add(b9);
        p.add(b10);p.add(b11);
        f.add(p);
        f.setSize(500,500);
        f.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            s1 = tf1.getText();
            StringBuilder s = new StringBuilder();
            s.append(s1);
            s=s.reverse();
            tf3.setText(s.toString());
        }
        if(e.getSource()==b2)
        {
            s1=tf1.getText();
            int num = Integer.parseInt(tf2.getText());
            char a = s1.charAt(num);
            tf3.setText(""+a);
        }
        if(e.getSource()==b3)
        {
        	s1=tf1.getText();
            tf3.setText(s1.toUpperCase());
        }if(e.getSource()==b4)
        {
            s1=tf1.getText();
            tf3.setText(s1.toLowerCase());
        }
        if(e.getSource()==b5)
        {
            s1 = tf1.getText();
            s2 = tf2.getText();
            s3 = s1+s2;
            tf3.setText(s3);
        }
        if(e.getSource()==b6)
        {
        	s1  = tf1.getText();
        	s2  = tf2.getText();
        	char a = s2.charAt(0);
        	int num = s1.indexOf(a);
        	s3 = String.valueOf(num);
        	tf3.setText(s3);
        }
        if(e.getSource()==b7)
        {
            s1 = tf1.getText();
            s2  = tf2.getText();
        	char a = s2.charAt(0);
        	int num = s1.lastIndexOf(a);
        	s3 = String.valueOf(num);
        	tf3.setText(s3);
        }
        if(e.getSource()==b8)
        {
        	 s1=tf1.getText();
             int num = Integer.parseInt(tf2.getText());
             s2="";
             for(int i=1;i<num;i++)
            	 s2+=s1;
             tf3.setText(s2);
        }
        if(e.getSource()==b9)
        {
        	s1=tf1.getText();
            int num = Integer.parseInt(tf2.getText());
            s2="";
            for(int i=num;i<s1.length();i++)
            	s2+=s1.charAt(i);
            tf3.setText(s2);
        }
        if(e.getSource()==b10)
        {
        	s1=tf1.getText();
            int num = Integer.parseInt(tf2.getText());
            s2="";
            for(int i=0;i<num;i++)
            	s2+=s1.charAt(i);
            tf3.setText(s2);
        }
        if(e.getSource()==b11)
        {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
 
        }
    }
	public static void main(String args[]){
		Str_ops b = new Str_ops();
	}
}
