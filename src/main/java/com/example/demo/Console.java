package com.example.demo;

public class Console {
	/*
	 * 序章
	 */
	public static void putJosyou() {
		character("魔王が世界を滅ぼ そうとしています。");
		putStatus();
	}
	
	/*
	 * ステータス表示
	 */
	public static void putStatus() {
		character( "----------------------------------------" );
		character( "　" + Part01.name +  "　Lv：" + Part01.lv + "　HP：" + Part01.hp + "　所持金：" + Part01.gold + "G");
		character( "----------------------------------------" );
	}

	/*
	 * GAME OVER
	 */
	static void putGameOver() {
		character(Part01.name + "は魔王に敗れました");
		character("GAME OVER");
	}
 
	/*
	 * GAME CLEAR
	 */
	static void putGameClear() {
		String clear = Part01.name + "は魔王を倒しました。";
		character(clear);
		
		System.out.print("レベル" + Part01.lv);

		if( Part01.lv > 100) {
			character("なので楽勝でした");
		} else if( Part01.lv > 80) {
			character("なので倒せました");
		}else if( Part01.lv > 50) {
			character("なので苦戦しました");
		}else{
			character("なのでギリギリでした");
		}

		character("GAME CLEAR!");
	}

	/*
	 * 文字表示
	 */
	static void character( String str ) {
		System.out.println(str);
	}
}
