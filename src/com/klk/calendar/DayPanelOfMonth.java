package com.klk.calendar;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class DayPanelOfMonth extends JPanel{
	JLabel dayLabel;
	int dayNumber;
	public DayPanelOfMonth(int dayNumber) {
		this.dayNumber = dayNumber;
		
		dayLabel = new JLabel(Integer.toString(dayNumber));
		
		add(dayLabel);
		
		setPreferredSize(new Dimension(130, 130));
		setBackground(Color.green);
	}
}
