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

public class MonthPanel extends JPanel{
	JPanel panel_top;
	JPanel panel_center;
	JPanel panel_bottom;
	JLabel curYearMonth;
	JButton btn_pre,btn_next;
	JButton btn_week,btn_month;
	Calendar calendar;
	int year, month, day;
	String[] wTitle = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
	
	public MonthPanel() {
		panel_top = new JPanel();
		panel_center = new JPanel();
		panel_bottom = new JPanel();
		calendar = Calendar.getInstance();
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH)+1;
		day = calendar.get(Calendar.DAY_OF_MONTH);
		btn_pre = new JButton("이전");
		btn_next = new JButton("다음");
		btn_week = new JButton("Weekly");
		btn_month = new JButton("Monthly");
		
		btn_pre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(month != 1){
					month--;
				}else{
					year--;
					month = 12;
				}
				makeCalendar();
			}
		});
		btn_next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(month != 12){
					month++;
				}else{
					year++;
					month = 1;
				}
				makeCalendar();
			}
		});
		
		curYearMonth = new JLabel(Integer.toString(year)+"."+Integer.toString(month));
		curYearMonth.setFont(new Font("arial black", Font.BOLD, 70));
		panel_top.add(btn_pre);
		panel_top.add(curYearMonth);
		panel_top.add(btn_next);
		panel_bottom.add(btn_week);
		panel_bottom.add(btn_month);

		makeCalendar();
		
		setLayout(new BorderLayout());
		panel_center.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel_bottom.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(panel_top, BorderLayout.NORTH);
		add(panel_center);
		add(panel_bottom, BorderLayout.SOUTH);
		
		setPreferredSize(new Dimension(1000, 900));
		setBackground(Color.yellow);
	}
	
	public void makeTitle(){
		for(int i=0; i < 7 ;i++){
			JPanel day = new JPanel();
			JLabel label = new JLabel(wTitle[i]);
			day.add(label);
			day.setPreferredSize(new Dimension(130, 30));
			day.setBackground(Color.white);
			panel_center.add(day);
		}
	}
	
	public void makeCalendar(){
		panel_center.removeAll();
		curYearMonth.setText(Integer.toString(year)+"."+Integer.toString(month));
		makeTitle();
		for(int i=0;i<MyCalendar.isWeekToday(year, month, 1);i++){
			JPanel day = new JPanel();
			day.setPreferredSize(new Dimension(DayPanelOfMonth.WIDTH, DayPanelOfMonth.HEIGHT));
			panel_center.add(day);
		}
		for(int i=0;i<MyCalendar.isMonthDay(year, month);i++){
			DayPanelOfMonth day = new DayPanelOfMonth(i+1);
			panel_center.add(day);
		}
		updateUI();
	}
}
