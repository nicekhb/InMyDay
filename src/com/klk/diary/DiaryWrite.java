package com.klk.diary;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DiaryWrite extends JFrame{

	JPanel p;
	JTextField t_title;
	JTextArea area;
	JButton bt_regist,bt_cancel,bt_photo;
	JScrollPane scroll;
	JFileChooser chooser;
	Canvas can;
	JLabel label_title;
	
	public DiaryWrite() {
		p=new JPanel();
		t_title=new JTextField(30);
		area = new JTextArea();
		scroll=new JScrollPane(area);
		bt_regist=new JButton("등록");
		bt_cancel=new JButton("취소");
		chooser = new JFileChooser();
		bt_photo=new JButton("사진 찾기");
		can= new Canvas();
		label_title= new JLabel("제목 :");
		
		can.setSize(350, 600);
		can.setBackground(Color.pink);
				
		area.setPreferredSize(new Dimension(600, 600));
		
		p.setPreferredSize(new Dimension(1000, 900));
		//p.setBackground(Color.white);
		
		bt_photo.addActionListener(new ActionListener() {
						
			public void actionPerformed(ActionEvent arg0) {
				openFile();
				
			}
		});
		
		p.add(label_title);
		p.add(t_title);
		p.add(bt_photo);
		
		p.add(scroll);
		p.add(can);
		
		p.add(bt_regist);
		p.add(bt_cancel);
		add(p);
		
		
		setSize(1000,900);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	public void openFile(){
		chooser.showOpenDialog(this);
	}
	
	public static void main(String[] args) {
		new DiaryWrite();
	}
}
