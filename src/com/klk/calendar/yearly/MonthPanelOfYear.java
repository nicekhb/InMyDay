package com.klk.calendar.yearly;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

import com.klk.calendar.MyCalendar;

public class MonthPanelOfYear extends JPanel{
	JPanel panel_top;
	JPanel panel_center;
	JLabel curMonth;
	int year, month;
	
	public MonthPanelOfYear(int year, int month) {
		panel_top = new JPanel();
		panel_center = new JPanel();
		this.year = year;
		this.month = month;
				
		curMonth = new JLabel(Integer.toString(month)+"¿ù");
		curMonth.setFont(new Font("verdana black", Font.BOLD, 20));
		panel_top.add(curMonth);
		
		makeCalendar();
		
		setLayout(new BorderLayout());
		panel_center.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(panel_top, BorderLayout.NORTH);
		add(panel_center);
		
		setPreferredSize(new Dimension(240, 250));
	}
	
	public void makeCalendar(){
		for(int i=0;i<MyCalendar.isWeekToday(year, month, 1);i++){
			JPanel day = new JPanel();
			day.setPreferredSize(new Dimension(28, 28));
			panel_center.add(day);
		}
		for(int i=0;i<MyCalendar.isMonthDay(year, month);i++){
			JPanel day = new JPanel();
			JLabel dayNum = new JLabel(Integer.toString(i+1));
			day.add(dayNum);
			day.setPreferredSize(new Dimension(28, 28));
			day.setBackground(Color.pink);
			panel_center.add(day);
		}
		updateUI();
	}
}
