package com.klk.calendar;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class DayPanelOfMonth extends JPanel{
	public static final int WIDTH = 135;
	public static final int HEIGHT = 100;
	JLabel dayLabel;
	int dayNumber;
	public DayPanelOfMonth(int dayNumber) {
		this.dayNumber = dayNumber;
		
		dayLabel = new JLabel(Integer.toString(dayNumber));
		
		add(dayLabel);
		
		addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				AddSchedule popup = new AddSchedule();
				setBackground(Color.pink);
			}
		});
		
		setPreferredSize(new Dimension(WIDTH, HEIGHT));
		setBackground(Color.green);
	}
}
