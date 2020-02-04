package dev.tkdwls9277.algorithm;
import java.util.Scanner;
/**
 * 문제
 * 리그 경기 횟수 구하기
 * 리그에 속해있는 팀의 수 n이 주어지고 각 팀은 자신을 제외한 모든 팀과 한 경기씩 치루어 순위를 가리는
 * 스포츠 리그전에서 치루어지는 경기의 수를 구하는 프로그램
 * 
 * 2팀 -> 1경기
 * 3팀 -> 3경기
 * 4팀 -> 6경기
 */
public class Goorm2 {
	public static void main(String[] args) throws Exception {
		Scanner s = new Scanner(System.in);
		int input = s.nextInt();
		//int input=4;
		//int input=10;
		int result=0;
		for(int i=input-1;i>0;i--){
			result=result+i;
		}
		s.close();
		System.out.println(result);
	}
}
