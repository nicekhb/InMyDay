package com.klk.money;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DayList extends JFrame{
	JPanel west;
	JPanel east;
	JPanel top;
	JPanel bottom;
	JLabel name;
	JLabel category;
	JLabel balance_category;
	JLabel money;
	
	public DayList(){
		west = new JPanel();
		east = new JPanel();
		top = new JPanel();
		bottom = new JPanel();
		name = new JLabel("아이패드");
		category = new JLabel("통신비");
		balance_category = new JLabel("우리은행");
		money = new JLabel("37790");
		
		top.add(name);
		bottom.add(category);
		bottom.add(balance_category);
		east.add(money);
		
		west.setLayout(new BorderLayout());
		west.add(top, BorderLayout.NORTH);
		west.add(bottom);
		
		add(west);
		add(east, BorderLayout.EAST);
		
		setSize(600, 100);
		setVisible(true);
		
		
		
	}
	
	public static void main(String[] args){
		new DayList();
	}
}
