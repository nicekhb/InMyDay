package com.klk.calendar;

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
	InMyDayMain dayMain;
	JPanel panel_top;
	JPanel panel_center;
	JPanel panel_bottom;
	JLabel curYear;
	JButton btn_week,btn_month,btn_year;
	Calendar calendar;
	int year;
	
	public YearPanel(InMyDayMain dayMain) {
		this.dayMain = dayMain;
		panel_top = new JPanel();
		panel_center = new JPanel();
		panel_bottom = new JPanel();
		btn_week = new JButton("Weekly");
		btn_month = new JButton("Monthly");
		btn_year = new JButton("Yearly");
		calendar = Calendar.getInstance();
		year = calendar.get(Calendar.YEAR);
		curYear = new JLabel(Integer.toString(year));
		curYear.setFont(new Font("arial black", Font.BOLD, 30));
		
		for(int i=1;i<13;i++){
			MonthPanelOfYear month = new MonthPanelOfYear(year, i);
			panel_center.add(month);
		}
		
		panel_top.add(curYear);
		
		panel_bottom.add(btn_week);
		panel_bottom.add(btn_month);
		panel_bottom.add(btn_year);
		
		setLayout(new BorderLayout());
		panel_bottom.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(panel_top, BorderLayout.NORTH);
		add(panel_center);
		add(panel_bottom, BorderLayout.SOUTH);
		
		btn_month.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dayMain.add(dayMain.monthPanel);
			}
		});	
		
		setPreferredSize(new Dimension(1000, 900));
		setBackground(Color.yellow);
	}
}
