package com.wangliping.tank;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame{
	public TankFrame() {//自己是个窗口，把自己显示出来就可以了
		setSize(800, 600);
		setResizable(false);//可以关闭窗口
		setTitle("tank war");
		setVisible(true);
		
		addWindowListener(new WindowAdapter(){

			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
			
		});
	}
	//窗口需要重新绘制的时候调用
	//paint:被系统自动调用；
	//Graphics:画笔
	@Override
	public void paint(Graphics g) {
		//坐标是从左上角开始，向右/下越大
		g.fillRect(200, 200, 50, 50);
		//System.out.println("paint");
	}
}
