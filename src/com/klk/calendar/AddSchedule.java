package com.klk.calendar;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerModel;

public class AddSchedule extends JFrame{
	JPanel panel;
	JTextField txt;
	SpinnerModel start_model, end_model;
	JSpinner start_spinner, end_spinner;
	
	public AddSchedule() {
		panel = new JPanel();
		txt = new JTextField(15);
		start_model = new SpinnerDateModel();
		end_model = new SpinnerDateModel();
		start_spinner = new JSpinner(start_model);
		end_spinner = new JSpinner(end_model);
		
		panel.add(txt);
		panel.add(start_spinner);
		panel.add(end_spinner);
		
		add(panel);
		
		setSize(200,300);
		setLocationRelativeTo(null);
		setVisible(true);
	}
}
