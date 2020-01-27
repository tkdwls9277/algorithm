package dev.tkdwls9277.algorithm;

/**
 * N과 M(백트레킹)
 * https://www.acmicpc.net/problem/15651
 * 
 * <pre>
 * 문제
 * 자연수 N과 M이 주어졌을 때, 아래 조건을 만족하는 길이가 M인 수열을 모두 구하는 프로그램을 작성하시오.
 * * 1부터 N까지 자연수 중에서 M개를 고른 수열
 * * 같은 수를 여러 번 골라도 된다.
 * 
 * 입력
 * 첫째 줄에 자연수 N과 M이 주어진다. (1 ≤ M ≤ N ≤ 7)
 * 
 * 출력
 * 한 줄에 하나씩 문제의 조건을 만족하는 수열을 출력한다. 
 * 중복되는 수열을 여러 번 출력하면 안되며, 각 수열은 공백으로 구분해서 출력해야 한다.
 * 
 * 수열은 사전 순으로 증가하는 순서로 출력해야 한다.
 * </pre>
 * 
 */
import java.util.*;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Algorithm15651 {
	static int[] arr;
	static boolean[] visit;
	static StringBuilder sb;
	
	public static void main(String[] args) throws Exception {
		//test1();
		//test2();
		//test3();
		showData();

		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write(sb.toString().trim());
		bw.close();
	}
	
	static void showData() {
		Scanner s = new Scanner(System.in);
		
		int first, second;
		first = s.nextInt();
		second = s.nextInt();
		
		arr=new int[second];
		sb=new StringBuilder();
		
		solution(first,second,0);
		
		s.close();
	}
	
	static void test1() {
		arr=new int[1];
		visit=new boolean[4];
		solution(3,1,0);
	}

	static void test2() {
		arr=new int[2];
		visit=new boolean[5];
		solution(4,2,0);
	}

	static void test3() {
		arr=new int[4];
		visit=new boolean[5];
		solution(4,4,0);
	}
	
	static void solution(int numN, int numM, int count)  {
		if(numM==count) {
			for(int i=0;i<arr.length;i++) {
				sb.append(arr[i]+" ");
			}
			sb.append("\n");
			return;
		}
		
		for(int i=1;i<=numN;i++) {
			arr[count]=i;
			solution(numN,numM,count+1);
		}
		return;
		
	}

}
