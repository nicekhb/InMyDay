package com.klk.calendar.yearly;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import com.klk.main.InMyDayMain;

public class YearPanel extends JPanel{
	JPanel panel_top;
	JPanel panel_center;
	JLabel curYear;
	Calendar calendar;
	int year;
	
	public YearPanel() {
		panel_top = new JPanel();
		panel_center = new JPanel();
		calendar = Calendar.getInstance();
		year = calendar.get(Calendar.YEAR);
		curYear = new JLabel(Integer.toString(year));
		curYear.setFont(new Font("arial black", Font.BOLD, 30));
		
		for(int i=1;i<13;i++){
			MonthPanelOfYear month = new MonthPanelOfYear(year, i);
			panel_center.add(month);
		}
		
		panel_top.add(curYear);
		
		setLayout(new BorderLayout());
		
		add(panel_top, BorderLayout.NORTH);
		add(panel_center);
		
		setBackground(Color.yellow);
	}
}
