package com.liyuanhong.notepad;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class FontSet extends JFrame
{	
	private static FontSet font;
	
	private FontSet(JTextArea thisarea)
	{	
		JTextArea area = thisarea;
		
		JLabel label1 = new JLabel("font:"); 
		JLabel label2 = new JLabel("size:"); 
		JLabel label3 = new JLabel("color:"); 
		
		JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		JPanel panel5 = new JPanel();
		JPanel panel4 = new JPanel();
		JPanel panel6 = new JPanel();
		panel4.setLayout(new BorderLayout());
		
		
		JButton button1 = new JButton("comfirm");
		JButton button2 = new JButton("cancel");
		
		
		String[] style = GraphicsEnvironment.getLocalGraphicsEnvironment().
		getAvailableFontFamilyNames();
		String[] size = {"8","9","10","11","12","13","14","15","16","17",
				"18","19","20","22","24","26","30","34",
				"38","42","48","56","68","74","80"};
		String[] color = {"black","blue","cyan","gray",
				"green","orange","pink","red","yellow","white"};
	
		
		JComboBox box1 = new JComboBox(style);
		box1.setSelectedIndex(237);
		JComboBox box2 = new JComboBox(size);
		box2.setSelectedIndex(10);
		JComboBox box3 = new JComboBox(color);
		box3.setSelectedIndex(0);
		
		panel1.add(label1);
		panel1.add(box1);
		panel2.add(label2);
		panel2.add(box2);
		panel3.add(label3);
		panel3.add(box3);
		panel5.add(button1);
		panel5.add(button2);
		panel4.add(panel1,BorderLayout.NORTH);
		panel4.add(panel2,BorderLayout.CENTER);
		panel4.add(panel3,BorderLayout.SOUTH);
		panel6.add(panel4);
		panel6.add(panel5);
		
		
		
		
		button1.addActionListener(new Confirm(box1,box2,box3,area,this));
		button2.addActionListener(new Cancel(this));
		
		
		add(panel6);
		setResizable(false);
		setName("fontSet");
		setSize(300,200);
		setVisible(true);
		
	}
	

	
	public static FontSet getFontSet(JTextArea area)
	{
		if(font == null){
			font = new FontSet(area);
		}		
		return font;
	}


//	public static void main(String[] args)
//	{
//		FontSet font = FontSet.getFontSet();
//	}
}

class Confirm implements ActionListener
{
	JComboBox box1;
	JComboBox box2;
	JComboBox box3;
	JTextArea area;
	FontSet font;
	
	Confirm(JComboBox box1,JComboBox box2,JComboBox box3,JTextArea area,FontSet font)
	{
		this.box1 = box1;
		this.box2 = box2;
		this.box3 = box3;
		this.area = area;
		this.font = font;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		String style = box1.getSelectedItem().toString();
		int size = Integer.parseInt(box2.getSelectedItem().toString());
		String color = box3.getSelectedItem().toString();
		
		
		Font fo = new Font(style,Font.PLAIN,size);
		area.setFont(fo);
		
		if(color.equals("black"))
		{
			area.setForeground(Color.black);
		}
		else if(color.equals("blue"))
		{
			area.setForeground(Color.blue);
		}
		else if(color.equals("cyan"))
		{
			area.setForeground(Color.cyan);
		}
		else if(color.equals("gray"))
		{
			area.setForeground(Color.gray);
		}
		else if(color.equals("green"))
		{
			area.setForeground(Color.green);
		}
		else if(color.equals("orange"))
		{
			area.setForeground(Color.orange);
		}
		else if(color.equals("pink"))
		{
			area.setForeground(Color.pink);
		}
		else if(color.equals("red"))
		{
			area.setForeground(Color.red);
		}
		else if(color.equals("yellow"))
		{
			area.setForeground(Color.yellow);
		}
		else if(color.equals("white"))
		{
			area.setForeground(Color.white);
		}
	
		font.setVisible(false);
	}
}

class Cancel implements ActionListener
{
	FontSet font;
	
	Cancel(FontSet font)
	{
		this.font = font;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		font.setVisible(false);
	}
}
