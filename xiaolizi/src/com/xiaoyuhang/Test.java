package com.xiaoyuhang;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author Administrator
 * @version 修改时间：2015年9月28日 下午1:38:05
 */
public class Test extends JFrame implements ActionListener {
	private int now_s = 0;

	public Test() {
		new Timer(1000, this).start();
		while (true)
			;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("now_s=" + now_s);
		now_s++;
	}

	public static void main(String[] args) {
		new Test();
	}
}