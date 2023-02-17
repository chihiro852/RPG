package com.example.demo;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Graphic {

	public static void main(String[] args) {
		System.out.println( "hellow world" );

		JFrame jf = new JFrame();
		jf.setBounds( 20, 30, 500, 500); // ウィンドウの大きさ
		jf.setVisible(true);
		jf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		JPanel jp = new JPanel();
		jp.setBackground( Color.black );
		jf.add( jp );
		
		JLabel jl = new JLabel( "hellow world" );
		jl.setFont( new Font( null, 0, 30 ) );	// 文字のスタイル、サイズ(string name, int style, int size)
		jl.setForeground( new Color( 255, 128, 0 ) ); // 文字の色
		jp.add( jl );
	}
}
