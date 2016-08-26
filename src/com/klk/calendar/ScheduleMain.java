package com.klk.calendar;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

import com.klk.calendar.monthly.MonthPanel;
import com.klk.calendar.yearly.YearPanel;

public class ScheduleMain extends JPanel{
	JPanel panel_bottom;
	JButton btn_week,btn_month,btn_year;
	MonthPanel monthPanel;
	YearPanel yearPanel;
	
	public ScheduleMain() {
		monthPanel = new MonthPanel();
		yearPanel = new YearPanel();
		panel_bottom = new JPanel();
		btn_week = new JButton("Weekly");
		btn_month = new JButton("Monthly");
		btn_year = new JButton("Yearly");
		
		panel_bottom.add(btn_week);
		panel_bottom.add(btn_month);
		panel_bottom.add(btn_year);
		
		setLayout(new BorderLayout());
		panel_bottom.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(monthPanel);		
		add(panel_bottom, BorderLayout.SOUTH);
		
		btn_month.setVisible(false);
		btn_month.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(yearPanel);
				add(monthPanel);
				btn_year.setVisible(true);
				btn_month.setVisible(false);
				updateUI();
			}
		});
		btn_year.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				remove(monthPanel);
				add(yearPanel);
				btn_month.setVisible(true);
				btn_year.setVisible(false);
				updateUI();
			}
		});
		
		setPreferredSize(new Dimension(1000, 900));
		setBackground(Color.yellow);
	}
}
