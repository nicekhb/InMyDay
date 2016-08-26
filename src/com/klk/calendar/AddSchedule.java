package com.klk.calendar;

import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerModel;

public class AddSchedule extends JFrame{
	JPanel panel;
	JTextField txt;
	JLabel start_label, end_label;
	SpinnerModel start_model, end_model;
	JSpinner start_spinner, end_spinner;
	JTextArea area;
	JScrollPane scroll;
	JButton btn;
	
	public AddSchedule() {
		panel = new JPanel();
		txt = new JTextField(16);
		start_label = new JLabel("시작시간");
		end_label = new JLabel("종료시간");
		start_model = new SpinnerDateModel();
		end_model = new SpinnerDateModel();
		start_spinner = new JSpinner(start_model);
		end_spinner = new JSpinner(end_model);
		area = new JTextArea();
		scroll = new JScrollPane(area);
		btn = new JButton("등록");
		
		area.setPreferredSize(new Dimension(200, 100));
		
		panel.add(txt);
		panel.add(start_label);
		panel.add(start_spinner);
		panel.add(end_label);
		panel.add(end_spinner);
		panel.add(scroll);
		panel.add(btn);
		
		add(panel);
		
		setSize(200,270);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
