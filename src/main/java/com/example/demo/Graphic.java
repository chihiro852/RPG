package com.example.demo;

import java.awt.Color;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Graphic {

	public static void main(String[] args) {
		System.out.println( "hellow world" );

		// ウィンドウフレームjfを作成、表示
		JFrame jf = new JFrame();
		jf.setBounds( 20, 30, 500, 500); // ウィンドウの大きさ
		jf.setVisible(true);
		jf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		
		// パネルjpを作成、フレームjfに貼り付け
		JPanel jp = new JPanel();
		jp.setBackground( Color.green );
		jf.add( jp );
		
		// ラベルjlを作成し、パネルjpに貼り付け
		JLabel jl = new JLabel( "魔王が世界を滅ぼそうとしています。" );
		jl.setFont( new Font( null, 0, 30 ) );	// 文字のスタイル、サイズ(string name, int style, int size)
		jl.setForeground( new Color( 255, 128, 0 ) ); // 文字の色
		jp.add( jl );
		
		// パネルjpChildを作成し、パネルjpに貼り付け
		JPanel jpChild = new JPanel();
		jpChild.setBackground( Color.black );
		jp.add( jpChild );
		
		// ラベルjlを作成し、パネルjpに貼り付け
		JLabel jlChild = new JLabel( "ヨシヒコ　Lv：1　HP：10／10" );
		jlChild.setFont( new Font( null, 0, 30 ) );	// 文字のスタイル、サイズ(string name, int style, int size)
		jlChild.setForeground( new Color( 255, 255, 255 ) ); // 文字の色
		jpChild.add( jlChild );
		
		// 画像付きラベルを作成し、パネルjpに貼り付け
		JLabel jlImage = new JLabel ( new javax.swing.ImageIcon( "src\\main\\resources\\hero\\brave.png" ) );
		jlImage.setBounds( 0, 0, 96, 128 );
		jp.add( jlImage );
		
	}
}
