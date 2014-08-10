package com.liyuanhong.notepad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class SaveTo implements ActionListener
{
	JTextArea area;
	JFrame frame;


	SaveTo(JTextArea area,JFrame frame)
	{
		this.area = area;
		this.frame = frame;
	}
	
	public boolean isFileExit(String path)
	{
		File filePath = new File("path");
		File files[] = filePath.listFiles();

		for (File fil : files)
		{
			if ("path".equals(fil.getName()))
			{
				return true;
			}
		}

		return false;
	}
	
	@Override
	public void actionPerformed(ActionEvent e)
	{
		File filePath;
		String path;
		String filename;
		
		JFileChooser ch = new JFileChooser();
		ch.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
		ch.showSaveDialog(frame);
		
		filePath = ch.getSelectedFile();
		
		filename = filePath.toString();	
//		int index = filename.lastIndexOf("\\");
		
		File file = new File(filename);
		try
		{
			file.createNewFile();
			String str = area.getText();
			FileOutputStream ou = new FileOutputStream(file);
			ou.write(str.getBytes());
			ou.close();
		} catch (IOException e1)
		{
			e1.printStackTrace();
		}
		
		
		
	}
	
}
