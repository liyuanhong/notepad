package com.liyuanhong.notepad;

import java.awt.Font;
import java.awt.ScrollPane;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class NotePad extends JFrame
{
	NotePad()
	{
		super("notepad");
		setSize(500,600);
		
		JMenuBar bar = new JMenuBar();
		
		JMenu menu1 = new JMenu("open");
		JMenu menu2 = new JMenu("set");
		JMenu menu3 = new JMenu("search");
		JMenu menu4 = new JMenu("copyright");
		
		JMenuItem item1 = new JMenuItem("open file");
		JMenuItem item2 = new JMenuItem("save");
		JMenuItem item3 = new JMenuItem("save to");
		JMenuItem item4 = new JMenuItem("clear");
		JMenuItem item5 = new JMenuItem("exit");
		
		
		JMenuItem item21 = new JMenuItem("font");
		JMenuItem item22 = new JMenuItem("row_distance");
		item22.setEnabled(false);
		JMenu item23 = new JMenu("bakground");
		
	
		
		JRadioButtonMenuItem item231 = new JRadioButtonMenuItem("black");
		JRadioButtonMenuItem item232 = new JRadioButtonMenuItem("blue");
		JRadioButtonMenuItem item233 = new JRadioButtonMenuItem("cyan");
		JRadioButtonMenuItem item234 = new JRadioButtonMenuItem("grey");
		JRadioButtonMenuItem item235 = new JRadioButtonMenuItem("green");
		JRadioButtonMenuItem item236 = new JRadioButtonMenuItem("orange");
		JRadioButtonMenuItem item237 = new JRadioButtonMenuItem("pink");
		JRadioButtonMenuItem item238 = new JRadioButtonMenuItem("red");
		JRadioButtonMenuItem item239 = new JRadioButtonMenuItem("yellow");
		JRadioButtonMenuItem item2310 = new JRadioButtonMenuItem("white",true);
		
		ButtonGroup group = new ButtonGroup();
		
		group.add(item231);
		group.add(item232);
		group.add(item233);
		group.add(item234);
		group.add(item235);
		group.add(item236);
		group.add(item237);
		group.add(item238);
		group.add(item239);
		group.add(item2310);
		
	
		
		JMenuItem item31 = new JMenuItem("search");
		item31.setEnabled(false);
		JMenuItem item32 = new JMenuItem("replace");
		item32.setEnabled(false);
		
		JMenuItem item41 = new JMenuItem("copyright");
		item41.setEnabled(false);
		
		JScrollPane scrollPane = new JScrollPane();		
		Font font = new Font("ËÎÌו",Font.PLAIN,20); 
		JTextArea area = new JTextArea();
		area.setFont(font);
		area.setLineWrap(true);
		scrollPane.setViewportView(area);
		
		bar.add(menu1);
		bar.add(menu2);
		bar.add(menu3);
		bar.add(menu4);
	
		menu1.add(item1);
		menu1.add(item2);
		menu1.add(item3);
		menu1.add(item4);
		menu1.add(item5);
		
		menu2.add(item21);
		menu2.add(item22);
		menu2.add(item23);
		
		menu3.add(item31);
		menu3.add(item32);
		
		menu4.add(item41);
		
		
		setJMenuBar(bar);
		add(scrollPane);
		
		
		item1.addActionListener(new Open(area,this));
		item2.addActionListener(new Save(area));
		item3.addActionListener(new SaveTo(area,this));
		item4.addActionListener(new Clear(area));
		item5.addActionListener(new Exit());
		item21.addActionListener(new MyFont(area));
		item231.addItemListener(new Background(area,item231,item232,item233,item234,item235,item236,item237,item238,item239,item2310));
		item232.addItemListener(new Background(area,item231,item232,item233,item234,item235,item236,item237,item238,item239,item2310));
		item233.addItemListener(new Background(area,item231,item232,item233,item234,item235,item236,item237,item238,item239,item2310));
		item234.addItemListener(new Background(area,item231,item232,item233,item234,item235,item236,item237,item238,item239,item2310));
		item235.addItemListener(new Background(area,item231,item232,item233,item234,item235,item236,item237,item238,item239,item2310));
		item236.addItemListener(new Background(area,item231,item232,item233,item234,item235,item236,item237,item238,item239,item2310));
		item237.addItemListener(new Background(area,item231,item232,item233,item234,item235,item236,item237,item238,item239,item2310));
		item238.addItemListener(new Background(area,item231,item232,item233,item234,item235,item236,item237,item238,item239,item2310));
		item239.addItemListener(new Background(area,item231,item232,item233,item234,item235,item236,item237,item238,item239,item2310));
		item2310.addItemListener(new Background(area,item231,item232,item233,item234,item235,item236,item237,item238,item239,item2310));
		
		
		
		
		
		item23.add(item231);
		item23.add(item232);
		item23.add(item233);
		item23.add(item234);
		item23.add(item235);
		item23.add(item236);
		item23.add(item237);
		item23.add(item238);
		item23.add(item239);
		item23.add(item2310);
		
	
		bar.setVisible(true);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args)
	{
		NotePad pad = new NotePad();
	}
}
