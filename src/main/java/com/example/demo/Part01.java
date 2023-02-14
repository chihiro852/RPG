package com.example.demo;

public class Part01 {

	static String name = "アーサー"; // player
	static int lv = 1; // level
	static int hp = 10; // hit point

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
			System.out.println( "レベルが" + lv + "になった" );
			System.out.println( "HPが" + hp + "になった" );

			if( hp <= 0) {
				System.out.println("GAME OVER");
			} else {
				putCommand();
			}
		} else if( c == '3' ) { // 宿屋に泊まる
			hp = hp + 10;
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
	static void putJosyou() {
		System.out.println("魔王が世界を滅ぼ そうとしています。");
		System.out.println(name +  "はレベル：" + lv + "、HP：" + hp + "です。");
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
