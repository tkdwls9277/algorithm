package dev.tkdwls9277.algorithm;

/**
 * N과 M(백트레킹)
 * https://www.acmicpc.net/problem/15649
 * 
 * <pre>
 * 문제
 * 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
 * 1부터 N까지 자연수 중에서 중복 없이 M개를 고른 수열
 * 
 * 입력
 * 첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 8)
 * 
 * 출력
 * 한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 
 * 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.
 * 수열은 사전 순으로 증가하는 순서로 출력해야 한다.
 * </pre>
 * 
 */
import java.util.*;

public class Algorithm15649 {
	public static void main(String[] args) {
		test1();
	}
	
	static void showData() {
		Scanner s = new Scanner(System.in);
		
		s.close();
	}
	
	static void test1() {
		solution(3,1);
	}

	static void test2() {
		solution(4,2);
	}

	static void test3() {
		solution(4,4);
	}
	static void solution(int numN, int numM) {
		
		
	}

}
