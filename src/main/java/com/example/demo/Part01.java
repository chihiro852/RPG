package com.example.demo;

public class Part01 {

	static String name = "アーサー";
	static int lv = 30;

	public static void main(String[] args) throws java.io.IOException {

		putJosyou();
		
		System.out.println( "1、すぐに魔王を倒しに行く" );
		System.out.println( "2、修行してから倒しに行く" );
		
		int c = System.in.read();
		
		if( c == '2' ) {
			lv = 100;
		}
		
		if(lv < 40) {
			putGameOver();
		} else {
			putGameClear();
		}

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
