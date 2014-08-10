package com.liyuanhong.notepad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

public class MyFont implements ActionListener
{
	JTextArea area;
	
	MyFont(JTextArea area)
	{
		this.area  = area;
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		FontSet font = FontSet.getFontSet(area);
		font.setVisible(true);
		
	}
}
