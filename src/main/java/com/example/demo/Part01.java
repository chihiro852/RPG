package com.example.demo;

public class Part01 {

	static String name = "アーサー";
	static int lv = 30;

	public static void main(String[] args) throws java.io.IOException {

		putJosyou();
		
		putCommand();
		
		if(lv < 40) {
			putGameOver();
		} else {
			putGameClear();
		}

	}
	
	public static void putCommand() throws java.io.IOException {
		System.out.println( "1、魔王を倒しに行く" );
		System.out.println( "2、修行する" );
		
		int c = inputCommand();
		if( c == '1' ) {
			System.out.println( "魔王が現れた" );
		} else if( c == '2' ) {
			lv = lv + 5;
			System.out.println( "レベルが" + lv + "になった" );
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
		System.out.println(name +  "はレベル" + lv + "のツワモノです。");
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
