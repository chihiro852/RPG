package com.example.demo;

public class Part01 {

	static String name = "ヨシヒコ";	// player name
	static int lv = 1;					// level
	static int hp = 10;					// hit point
	static long gold = 100;				// 所持金

	public static void main(String[] args) throws java.io.IOException {

		putJosyou(); 	// 序章を表示
		
		putCommand(); 	// コマンドを表示

		if( hp <= 0 ) {
			return;
		}
		
		if(lv < 40) {
			putGameOver();
		} else {
			putGameClear();
		}

	}
	
	public static void putCommand() throws java.io.IOException {
		put( "1、魔王を倒しに行く" );
		put( "2、修行する" );
		put( "3、宿屋に泊まる" );
		
		int c = inputCommand();
		if( c == '1' ) { 			// 魔王と闘う
			put( "魔王が現れた" );
		} else if( c == '2' ) { 	// 修行する
			syugyou();
		} else if( c == '3' ) { 	// 宿屋に泊まる
			if( gold >= 11 ) {
				hp = hp + 10;
				gold = gold - 10;
			}
			
			putStatus();
			
			putCommand();
		}
	}
	
	/*
	 * 修行コマンド
	 */
	public static void syugyou() throws java.io.IOException {
		// 摘出減数
		java.util.Random r = new java.util.Random();
		int e = r.nextInt( 3 ) + 1;
		put( "敵が" + e + "匹現れた！" );
		
		
		// damage
		int d = r.nextInt( 8 );
		hp = hp - d;
		if( hp < 0 ) {
			hp = 0;
		}
		put( name + "は、" + d + "ポイントのダメージをうけた！" );
		
		// level
		int l = r.nextInt( 3 );
		lv = lv + l;
		put( "レベルが" + lv + "になった" );
		
		putStatus();
		if( hp <= 0) {
			put( "HPが0になった" );
			put("GAME OVER");
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

	/*
	 * 序章
	 */
	public static void putJosyou() {
		put("魔王が世界を滅ぼ そうとしています。");
		putStatus();
	}
	
	/*
	 * ステータス表示
	 */
	public static void putStatus() {
		put( "----------------------------------------" );
		put( "　" + name +  "　Lv：" + lv + "　HP：" + hp + "　所持金：" + gold + "G");
		put( "----------------------------------------" );
	}

	/*
	 * GAME OVER
	 */
	static void putGameOver() {
		put(name + "は魔王に敗れました");
		put("GAME OVER");
	}
 
	/*
	 * GAME CLEAR
	 */
	static void putGameClear() {
		String clear = name + "は魔王を倒しました。";
		put(clear);
		
		System.out.print("レベル" + lv);

		if( lv > 100) {
			put("なので楽勝でした");
		} else if( lv > 80) {
			put("なので倒せました");
		}else if( lv > 50) {
			put("なので苦戦しました");
		}else{
			put("なのでギリギリでした");
		}

		put("GAME CLEAR!");
	}

	/*
	 * 文字表示
	 */
	static void put( String str ) {
		System.out.println(str);
	}
}
