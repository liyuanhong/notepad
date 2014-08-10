package com.liyuanhong.notepad;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileOutputStream;

import javax.swing.JTextArea;

public class Save implements ActionListener
{
	JTextArea area;

	Save(JTextArea area)
	{
		this.area = area;
	}

	public boolean isFileExist(File file)
	{
		File filePath = new File("./");
		File files[] = filePath.listFiles();

		for (File fil : files)
		{
			if ((file.getName()).equals(fil.getName()))
			{
				return true;
			}
		}

		return false;
	}
	
	public void save(File fil)
	{
		File file = fil;
		if(isFileExist(file))
		{
			String name = file.getName();
			int bef = name.indexOf("(");
			int aft = name.indexOf(")");
			int figure = Integer.parseInt(name.substring(bef + 1,aft));
			figure++;
			String rename = "myfile" + "(" + figure + ")" + ".txt";
			file = new File("./" + rename);
			save(file);
		}
		else
		{
			byte by[] = new byte[128];
			try
			{
				file.createNewFile();
				String str = area.getText();
				FileOutputStream ou = new FileOutputStream(file);
				ou.write(str.getBytes());
				ou.close();

			} catch (Exception e1)
			{
				e1.printStackTrace();
			}
		}
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e)
	{
		File filename = new File("./myfile(0).txt");
		save(filename);
	}
}
