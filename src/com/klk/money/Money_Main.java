package com.klk.money;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class Money_Main extends JFrame{
	JPanel top;
	JPanel center;
	JButton move_category;
	JButton move_calendar;
	JButton move_diary;
	JButton move_money;
	JPanel list;
	JPanel balance;
	JPanel south;
	JPanel east;
	
	public Money_Main(){
		top = new JPanel();
		center = new JPanel();
		move_category = new JButton("통계");
		move_calendar = new JButton("캘린더");
		move_diary = new JButton("일기");
		move_money = new JButton("가계부");
		list = new JPanel();
		balance = new JPanel();
		south = new JPanel();
		east = new JPanel();
		
		
		top.setLayout(new FlowLayout());
		
		top.add(move_category);
		
		east.setPreferredSize(new Dimension(100, 300));
		list.setPreferredSize(new Dimension(600, 400));
		top.setPreferredSize(new Dimension(1200, 150));
		south.setPreferredSize(new Dimension(1200, 200));
		balance.setPreferredSize(new Dimension(200, 300));
		center.setBackground(Color.BLACK);
		
		center.add(list);
		center.add(balance);
		add(east, BorderLayout.EAST);
		add(top, BorderLayout.NORTH);
		add(center, BorderLayout.CENTER);
		add(south, BorderLayout.SOUTH);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000, 900);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Money_Main();
	}
}
