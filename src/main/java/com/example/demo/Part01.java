package com.example.demo;

public class Part01 {

	static String name = "アーサー";	// player name
	static int lv = 1;					// level
	static int hp = 10;					// hit point
	static int gold = 100;				// 所持金

	public static void main(String[] args) throws java.io.IOException {

		putJosyou(); // 序章を表示
		
		putCommand(); // コマンドを表示

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
		System.out.println( "1、魔王を倒しに行く" );
		System.out.println( "2、修行する" );
		System.out.println( "3、宿屋に泊まる" );
		
		int c = inputCommand();
		if( c == '1' ) { // 魔王と闘う
			System.out.println( "魔王が現れた" );
		} else if( c == '2' ) { // 修行する
			lv = lv + 5;
			hp = hp - 2;
			if( hp < 0 ) {
				hp = 0;
			}
			System.out.println( "レベルが" + lv + "になった" );
			putStatus();

			if( hp <= 0) {
				System.out.println( "HPが0になった" );
				System.out.println("GAME OVER");
			} else {
				putCommand();
			}
		} else if( c == '3' ) { // 宿屋に泊まる
			if( gold >= 11 ) {
				hp = hp + 10;
				gold = gold - 10;
			}
			
			putStatus();
			putCommand();
		}
	}
	
	public static int inputCommand() throws java.io.IOException {
		int c = System.in.read();
		
		if( c == 10 || c == 13) {
			return( inputCommand() );
		}
		return( c );

	}

	// 序章
	public static void putJosyou() {
		System.out.println("魔王が世界を滅ぼ そうとしています。");
		putStatus();
	}
	
	public static void putStatus() {
		System.out.println( "----------------------------------------" );
		System.out.println( "　" + name +  "　Lv：" + lv + "　HP：" + hp + "　所持金：" + gold + "G");
		System.out.println( "----------------------------------------" );
	}

	static void putGameOver() {
		System.out.println(name + "は魔王に敗れました");
		System.out.println("GAME OVER");
	}

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

	static void put( String str ) {
		System.out.println(str);
	}
}
