package com.allen.tool;

import java.awt.Container;
import java.awt.GridLayout;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 * @author ZKL
 * 2016-8-23
 *
 */
public class Tool
{
//	private static JFrame frame;
	public static void main(String []args)
	{
//		创建底层窗口、获取容器、指定布局管理器
		JFrame frame=new JFrame("Tools For Better Life");
		frame.setSize(600, 100);
//		frame.setLocation(700,250);
		frame.setLocation(new Point(700,500));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container=frame.getContentPane();		
		GridLayout layout=new GridLayout(0,3);
		container.setLayout(layout);
		
		JLabel label=new JLabel("定时关机");
		JLabel label1=new JLabel("定时关机");		
		JTextField text=new JTextField("");
		JTextField text1=new JTextField("");
		JButton button=new JButton("确定");
		button.addActionListener(new MyActionListener(button,label));
		JButton button1=new JButton("确定");
		
		container.add(label);
		container.add(text);
		container.add(button);
		container.add(label1);
		container.add(text1);
		container.add(button1);
		frame.setVisible(true);
	}
	
	
}

class MyActionListener implements ActionListener
{
	 private JButton button;
	 private JLabel label;
	 public MyActionListener(JButton button,JLabel label)
	 {
		 this.button=button;
		 this.label=label;
	 }
	@Override
	public void actionPerformed(ActionEvent e)
	{
//		Date first_date=new Date();
//		DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//		String time=format.format(first_date); 
//		button.setText(time);
		
		for(int i=0;i<10;i++)
		{
			try
			{
				Thread.sleep(2000);
			} catch (InterruptedException f)
			{
				// TODO Auto-generated catch block
				f.printStackTrace();
			}
			
			MyThread thread1=new MyThread();
			thread1.start();
			label.setVisible(true);
//			Date current_date=new Date();
//			DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//			String current_time=format.format(current_date); 
//			
//			label.setText(current_time);
//			String lableStr=label.getText();
//			System.out.println("lableStr is"+current_time);
//			System.out.println(current_time);
			
		}
		
		// TODO Auto-generated method stub
		System.out.println("sucess");
//		try
//		{
//			Thread.sleep(5000);
//			System.out.println("stop");
//		} catch (InterruptedException e)
//		{
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
	
	class MyThread extends Thread
	{
		public void run()
		{
			Date current_date=new Date();
			DateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String current_time=format.format(current_date); 
			
			label.setText(current_time);
			
			String lableStr=label.getText();
			System.out.println("lableStr is"+current_time);
			System.out.println(current_time);
		}
	}
}



