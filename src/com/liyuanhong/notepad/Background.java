package com.liyuanhong.notepad;

import java.awt.Color;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextArea;

public class Background implements ItemListener
{
	JTextArea area;
	JRadioButtonMenuItem radio;
	
	JRadioButtonMenuItem item231;
	JRadioButtonMenuItem item232;
	JRadioButtonMenuItem item233;
	JRadioButtonMenuItem item234;
	JRadioButtonMenuItem item235;
	JRadioButtonMenuItem item236;
	JRadioButtonMenuItem item237;
	JRadioButtonMenuItem item238;
	JRadioButtonMenuItem item239;
	JRadioButtonMenuItem item2310 ;
	
	Background(JTextArea area,JRadioButtonMenuItem item231,
			JRadioButtonMenuItem item232,JRadioButtonMenuItem item233,
			JRadioButtonMenuItem item234,JRadioButtonMenuItem item235,
			JRadioButtonMenuItem item236,JRadioButtonMenuItem item237,
			JRadioButtonMenuItem item238,JRadioButtonMenuItem item239,
			JRadioButtonMenuItem item2310)
	{
		this.area = area;
		this.item231 = item231;
		this.item232 = item232;
		this.item233 = item233;
		this.item234 = item234;
		this.item235 = item235;
		this.item236 = item236;
		this.item237 = item237;
		this.item238 = item238;
		this.item239 = item239;
		this.item2310 = item2310;
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent e)
	{	
		radio = (JRadioButtonMenuItem)e.getSource();
		if(radio == item231)
		{
			area.setBackground(Color.black);
		}
		else if(radio == item232)
		{
			area.setBackground(Color.blue);
		}
		else if(radio == item233)
		{
			area.setBackground(Color.cyan);
		}
		else if(radio == item234)
		{
			area.setBackground(Color.gray);
		}
		else if(radio == item235)
		{
			area.setBackground(Color.green);
		}
		else if(radio == item236)
		{
			area.setBackground(Color.orange);
		}
		else if(radio == item237)
		{
			area.setBackground(Color.pink);
		}
		else if(radio == item238)
		{
			area.setBackground(Color.red);
		}
		else if(radio == item239)
		{
			area.setBackground(Color.yellow);
		}
		else if(radio == item2310)
		{
			area.setBackground(Color.white);
		}
		
	}
}
