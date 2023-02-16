package com.example.demo;

public class Part01 {

	static String name = "ヨシヒコ";	// player name
	static int lv = 1;					// level
	static int hp = 10;					// hit point
	static long gold = 100;				// 所持金

	public static void main(String[] args) throws java.io.IOException {

		Console.putJosyou(); 	// 序章を表示
		
		putCommand(); 	// コマンドを表示

		if( hp <= 0 ) {
			return;
		}
		
		if(lv < 40) {
			Console.putGameOver();
		} else {
			Console.putGameClear();
		}

	}
	
	public static void putCommand() throws java.io.IOException {
		Console.character( "1、魔王を倒しに行く" );
		Console.character( "2、修行する" );
		Console.character( "3、宿屋に泊まる" );

		switch( inputCommand() ) {
			case '1':{ // 魔王と闘う
				Console.character( "魔王が現れた" );
				break;
			}
			case '2':{ // 修行する
				syugyou();
				break;
			}
			case '3':{ // 宿屋に泊まる
				if( gold >= 11 ) {
					hp = hp + 10;
					gold = gold - 10;
				}
				
				Console.putStatus();
				
				putCommand();
			}
		}
	}
	
	/*
	 * 修行コマンド
	 */
	public static void syugyou() throws java.io.IOException {
		// 摘出減数
		java.util.Random r = new java.util.Random();
		int e = r.nextInt( 3 ) + 1;
		Console.character( "敵が" + e + "匹現れた！" );
		
		String m = "●";
		String s = "";
		
		for( int i = 0; i < e; i = i + 1) {
			s = s + m;
		}
		
		Console.character( s );
		
		// damage
		int d = r.nextInt( 8 );
		hp = hp - d;
		if( hp < 0 ) {
			hp = 0;
		}
		Console.character( name + "は、" + d + "ポイントのダメージをうけた！" );
		
		// level
		int l = r.nextInt( 3 );
		lv = lv + l;
		Console.character( "レベルが" + lv + "になった" );
		
		Console.putStatus();
		if( hp <= 0) {
			Console.character( "HPが0になった" );
			Console.character("GAME OVER");
		} else {
			putCommand();
		}
	}
	
	/*
	 * 
	 */
	public static int inputCommand() throws java.io.IOException {
		int c = System.in.read();
		
		if( c == 10 || c == 13) {
			return( inputCommand() );
		}
		return( c );

	}
}
