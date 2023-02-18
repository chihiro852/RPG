package com.example.demo;

import java.awt.Color;
import java.awt.Font;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Graphic {
	
	static JPanel jp;

	public static void main(String[] args) throws IOException {
		System.out.println( "hellow world" );

		// ウィンドウフレームjfを作成、表示
		JFrame jf = new JFrame();
		jf.setBounds( 20, 30, 500, 500); // ウィンドウの大きさ
		jf.setVisible(true);
		jf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );

		// パネルjpを作成、フレームjfに貼り付け
		jp = new JPanel();
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
		// javax.swing.ImageIcon ii = new javax.swing.ImageIcon( "src\\main\\resources\\hero\\brave.png" );

		// 勇者の生成
		/*{
			File  file = new File( "src\\main\\resources\\hero\\brave.png" ); // ファイルを開く
			BufferedImage bAll = ImageIO.read( file ); // 画像全体を読み込む
			BufferedImage bPart = bAll.getSubimage( 32 * 0, 32 * 0, 32, 32 );
			ImageIcon ii = new ImageIcon( bPart ); // JLabel用に型変換
			JLabel jlImage = new JLabel ( ii ); // 画像のコンポーネントを作成
			jlImage.setSize( 32, 32 ); // 画像サイズを設定
			jp.add( jlImage ); // 画像を貼り付け
		}*/

		putMonster( 104, 120, "Odin.png");
		putMonster( 104, 120, "monster1.png");
		putMonster( 104, 120, "Ashura.png");
	}

	static void putMonster( int cx, int cy, String monsterName){
		ImageIcon ii = new ImageIcon( "src\\main\\resources\\enemy\\" + monsterName );
		JLabel jlImage = new JLabel ( ii ); // 画像のコンポーネントを作成
		jlImage.setSize( cx, cy ); // 画像サイズを設定
		jp.add( jlImage ); // 画像を貼り付け
	}
}
