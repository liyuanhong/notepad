package com.liyuanhong.notepad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;


public class Open implements ActionListener
{
	JTextArea area;
	JFrame frame;
	
	Open(JTextArea area,JFrame frame)
	{
		this.area = area;
		this.frame = frame;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		area.setText("");
		File file;
		JFileChooser ch = new JFileChooser();
		ch.showOpenDialog(frame);	
		file = ch.getSelectedFile();
		
		try
		{
			System.out.println(file.getPath());
			FileInputStream in = new FileInputStream(file.getPath());
			
			byte by[] = new byte[128];
			int len;
			
			while((len = in.read(by)) != -1)
			{
				area.append(new String(by,0,len));
			}	
			
			in.close();
		} catch (Exception e1)
		{
			e1.printStackTrace();
		}
	}
	
}
