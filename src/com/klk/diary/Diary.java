package com.klk.diary;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class Diary extends JFrame{
	JPanel p_center;	//����, ��� ū �г� 
	JButton bt_add;
	JPanel p_list,p_bigview,p_day,p_detail;//���� ����Ʈ�г�, ��� ������ �г�, �����г� ,�����г�
	JScrollPane scroll;
	JPanel p_no;
	JButton bt_year,bt_month,bt_date;
	
	public Diary() {
		p_center= new JPanel();
		p_list= new JPanel();
		p_bigview=new JPanel();
		p_day= new JPanel();
		p_no=new JPanel();
		p_detail=new JPanel();
				
		scroll= new JScrollPane(p_list);
		
		bt_add= new JButton("�ϱ� �߰�");
		bt_year=new JButton("����");
		bt_month=new JButton("����");
		bt_date=new JButton("�ϰ�");
		
		
		p_center.setLayout(new FlowLayout(FlowLayout.LEFT));
		p_center.setBackground(Color.YELLOW);
		
		p_day.setPreferredSize(new Dimension(1000, 50));
		p_no.setPreferredSize(new Dimension(800, 50));
		
		p_list.setPreferredSize(new Dimension(300, 600));
		p_list.setBackground(Color.PINK);
		
		p_detail.setPreferredSize(new Dimension(290, 200));	//������ ������
		p_detail.setBackground(Color.black);
	
		p_bigview.setPreferredSize(new Dimension(670, 600));
		p_bigview.setBackground(Color.WHITE);
				
		p_list.add(p_detail);
				
		p_center.add(p_day);
		p_day.add(p_no);//���� �г�
		p_day.add(bt_add);
		
		p_center.add(scroll);
		p_center.add(p_bigview);
		
		p_center.add(bt_year);
		p_center.add(bt_month);
		p_center.add(bt_date);
				
		
		add(p_center);
				
		setLocation(50, 50);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1000, 900);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new Diary();

	}

}
