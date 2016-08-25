package com.allen.tool;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Point;


/**
 * @author ZKL
 * 2016-8-21
 * 通过GridBagLayout来实现容器内各组件的布局控制。未达到对应效果。
 */
public class Tools
{
	public static void main (String []aegs){
//		创建底层窗口
		JFrame frame=new JFrame("Tools For Better Life");
		frame.setSize(300, 300);
//		frame.setLocation(700,250);
		frame.setLocation(new Point(700,500));
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container container=frame.getContentPane();
//		添加布局管理器	
		GridBagLayout layour=new GridBagLayout();
		container.setLayout(layour);
		GridBagConstraints ctr=new GridBagConstraints();
//		创建基本元素		
		JLabel label=new JLabel("w");
		JTextField text= new JTextField();
		JButton but1=new JButton("yes");
		JButton but2=new JButton("no");
		JButton but3=new JButton("12");
//		通过布局管理器设置组件布局
		ctr.gridx=0;
		ctr.gridy=0;
		ctr.gridwidth=1;
		ctr.gridheight=1;
		ctr.fill=GridBagConstraints.NONE;
		container.add(but3,ctr);
		
//		ctr.gridx=1;
//		ctr.gridy=0;
//		ctr.gridwidth=1;
//		ctr.gridheight=1;
//		ctr.fill=GridBagConstraints.HORIZONTAL;
//		container.add(but1,ctr);
//		
//		ctr.gridx=0;
//		ctr.gridy=1;
//		ctr.gridwidth=4;
//		ctr.gridheight=1;
//		ctr.fill=GridBagConstraints.HORIZONTAL;
//		container.add(but2,ctr);
//		
//		显示窗口
		frame.setVisible(true);
		
		
	}
}
