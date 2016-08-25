package com.klk.main;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.klk.calendar.MonthPanel;
import com.klk.calendar.YearPanel;

public class InMyDayMain extends JFrame{
	JPanel panel_west;
	public MonthPanel monthPanel;
	public YearPanel yearPanel;

	public InMyDayMain() {
		panel_west = new JPanel();
		monthPanel = new MonthPanel(this);
		yearPanel = new YearPanel(this);
		
		panel_west.setPreferredSize(new Dimension(200, 900));
		panel_west.setBackground(Color.cyan);
		
		add(panel_west, BorderLayout.WEST);
		add(monthPanel);
		//add(yearPanel);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1200, 900);
		setResizable(false);
		setLocationRelativeTo(null);
		setVisible(true);
	}
	public static void main(String[] args) {
		new InMyDayMain();
	}
}
