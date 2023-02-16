package com.example.demo;

public class Graphic {

	public static void main(String[] args) {
		System.out.println( "hellow world" );

		javax.swing.JFrame jf = new javax.swing.JFrame();
		jf.setBounds( 20, 30, 400, 400); // ウィンドウの大きさ
		jf.setVisible(true);
		jf.setDefaultCloseOperation( javax.swing.JFrame.EXIT_ON_CLOSE );
		
		javax.swing.JLabel jl = new javax.swing.JLabel( "hellow world" );
		jl.setFont( new java.awt.Font( null, 0, 30 ) );	// 文字の大きさ
		jl.setForeground( java.awt.Color.RED ); // 文字の色
		jf.add( jl );
	}

}
