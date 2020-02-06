package dev.tkdwls9277.algorithm;


import java.util.Scanner;
/**
 * N-Queen(백트레킹)
 * <a href = "https://www.acmicpc.net/problem/9663">https://www.acmicpc.net/problem/9663</a>
 * 
 * <pre>
 * 문제
 * N-Queen 문제는 크기가 N × N인 체스판 위에 퀸 N개를 서로 공격할 수 없게 놓는 문제이다.
 * N이 주어졌을 때, 퀸을 놓는 방법의 수를 구하는 프로그램을 작성하시오.
 * 
 * 입력
 * 첫째 줄에 N이 주어진다. (1 ≤ N < 15)
 * 
 * 출력
 * 첫째 줄에 퀸 N개를 서로 공격할 수 없게 놓는 경우의 수를 출력한다.
 * </pre>
 * 
 * 깃 업로드 완료<br>
 */
public class Algorithm9663 {

	private static int cols[];
	private static int count;
	
	public static void main(String[] args) {
		//test1();
		//test2();
		showData();
	}
	
	static void test1() {
		cols = new int[8];
		count=0;
		Nqueen(8, 0);
		System.out.println(count);
	}
	
	static void test2() {
		cols = new int[4];
		count=0;
		Nqueen(4, 0);
		System.out.println(count);
	}
	
	static void showData() {
		int Qnum;
		Scanner s = new Scanner(System.in);
		Qnum = s.nextInt();
		cols = new int[Qnum];
		count=0;
		Nqueen(Qnum, 0);
		System.out.println(count);
		s.close();
	}
	
	//퀸을 실질적으로 놓는 메소드
	static void Nqueen(int Qnum, int level) {
		if(level == Qnum) {
			count=count+1;
			return;
		}else {
			for(int i=0;i<Qnum;i++) {
				cols[level]=i;
				if(isPossible(level)) {
					Nqueen(Qnum,level+1);
				}
			}
		}
	}
	
	//현재 자리에 퀸을 놓을 수 있는지를 확인해주는 메소드
	static boolean isPossible(int level) {
		for(int i=0;i<level;i++) {
			if(cols[i]==cols[level] || Math.abs(level-i)==Math.abs(cols[level]-cols[i])) {
				return false;
			}
		}
		return true;
	}

}
