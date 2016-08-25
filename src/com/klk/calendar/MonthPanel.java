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

public class MonthPanel extends JPanel{
	InMyDayMain dayMain;
	JPanel panel_top;
	JPanel panel_top_center, panel_top_east;
	JPanel panel_center;
	JPanel panel_bottom;
	JLabel curYearMonth;
	JButton btn_pre,btn_next;
	JButton btn_week,btn_month,btn_year;
	JButton btn_addSchedule;
	Calendar calendar;
	int year, month;
	String[] wTitle = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
	
	public MonthPanel(InMyDayMain dayMain) {
		this.dayMain = dayMain;
		panel_top = new JPanel();
		panel_top_center = new JPanel();
		panel_top_east = new JPanel();
		panel_center = new JPanel();
		panel_bottom = new JPanel();
		calendar = Calendar.getInstance();
		year = calendar.get(Calendar.YEAR);
		month = calendar.get(Calendar.MONTH)+1;
		//day = calendar.get(Calendar.DAY_OF_MONTH);
		btn_pre = new JButton("����");
		btn_next = new JButton("����");
		btn_week = new JButton("Weekly");
		btn_month = new JButton("Monthly");
		btn_year = new JButton("Yearly");
		btn_addSchedule = new JButton("add Schedule");
		
		btn_pre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				beforeMonth();
			}
		});
		btn_next.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				afterMonth();
			}
		});
		
		curYearMonth = new JLabel(Integer.toString(year)+"."+Integer.toString(month));
		curYearMonth.setFont(new Font("arial black", Font.BOLD, 70));
		panel_top_center.add(btn_pre);
		panel_top_center.add(curYearMonth);
		panel_top_center.add(btn_next);
		panel_bottom.add(btn_week);
		panel_bottom.add(btn_month);
		panel_bottom.add(btn_year);
		panel_top.setLayout(new BorderLayout());
		panel_top_east.setLayout(new BorderLayout());
		panel_top_east.add(btn_addSchedule);
		panel_top.add(panel_top_center);
		panel_top.add(panel_top_east, BorderLayout.EAST);

		makeCalendar();
		
		setLayout(new BorderLayout());
		panel_center.setLayout(new FlowLayout(FlowLayout.LEFT));
		panel_bottom.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		add(panel_top, BorderLayout.NORTH);
		add(panel_center);
		add(panel_bottom, BorderLayout.SOUTH);
		
		btn_year.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//dayMain.remove(dayMain.monthPanel);
				dayMain.add(dayMain.yearPanel);
				dayMain.repaint();
			}
		});		
		
		setPreferredSize(new Dimension(1000, 900));
		setBackground(Color.yellow);
	}
	
	public void beforeMonth(){
		if(month != 1){
			month--;
		}else{
			year--;
			month = 12;
		}
		makeCalendar();
	}

	public void afterMonth(){
		if(month != 12){
			month++;
		}else{
			year++;
			month = 1;
		}
		makeCalendar();
	}
	
	public void makeTitle(){
		for(int i=0; i < 7 ;i++){
			JPanel day = new JPanel();
			JLabel label = new JLabel(wTitle[i]);
			day.add(label);
			day.setPreferredSize(new Dimension(DayPanelOfMonth.WIDTH, 30));
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
			DayPanelOfMonth day = new DayPanelOfMonth(year, month, i+1);
			panel_center.add(day);
		}
		updateUI();
	}
	
	public void addSchedule(){
		
	}
}
