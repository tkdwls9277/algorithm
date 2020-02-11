package dev.tkdwls9277.algorithm;

import java.util.Scanner;

/**
 * �뵾蹂대굹移� �닔(�옱洹�)
 * <a href="https://www.acmicpc.net/problem/10870">https://www.acmicpc.net/problem/10870</a>
 * 
 * <pre>
 * 
 * 臾몄젣
 * �뵾蹂대굹移� �닔�뒗 0怨� 1濡� �떆�옉�븳�떎. 0踰덉㎏ �뵾蹂대굹移� �닔�뒗 0�씠怨�, 1踰덉㎏ �뵾蹂대굹移� �닔�뒗 1�씠�떎. 
 * 洹� �떎�쓬 2踰덉㎏ 遺��꽣�뒗 諛붾줈 �븵 �몢 �뵾蹂대굹移� �닔�쓽 �빀�씠 �맂�떎.
 * �씠瑜� �떇�쑝濡� �뜥蹂대㈃ Fn = Fn-1 + Fn-2 (n>=2)媛� �맂�떎.
 * n=17�씪�븣 源뚯� �뵾蹂대굹移� �닔瑜� �뜥蹂대㈃ �떎�쓬怨� 媛숇떎.
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
 * n�씠 二쇱뼱議뚯쓣 �븣, n踰덉㎏ �뵾蹂대굹移� �닔瑜� 援ы븯�뒗 �봽濡쒓렇�옩�쓣 �옉�꽦�븯�떆�삤.
 * 
 * �엯�젰
 * 泥レ㎏ 以꾩뿉 n�씠 二쇱뼱吏꾨떎. n�� 20蹂대떎 �옉嫄곕굹 媛숈� �옄�뿰�닔 �삉�뒗 0�씠�떎.
 * 
 * 異쒕젰
 * 泥レ㎏ 以꾩뿉 n踰덉㎏ �뵾蹂대굹移� �닔瑜� 異쒕젰�븳�떎.
 * </pre>
 * 
 * 源� �뾽濡쒕뱶 �셿猷� <br>
 * �떚�뒪�넗由� �뾽濡쒕뱶 �셿猷�
 */
public class Algorithm10870 {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int first = 0;
		int second = 1;
		int count = 0;
		int getnum = s.nextInt();
		int result=zagui(first, second, getnum, count);
		System.out.println(result);
		s.close();
	}
	
	static int zagui(int a, int b, int breaknum, int count) {
		if(count == breaknum) {
			return a;
		}
		count++;
		return zagui(b, a+b, breaknum, count);
	}

}
