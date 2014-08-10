package com.liyuanhong.notepad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;

public class Clear implements ActionListener
{
	JTextArea area;
	
	Clear(JTextArea area)
	{
		this.area = area;
	}
	@Override
	public void actionPerformed(ActionEvent e)
	{
		area.setText("");
	}
}
