//피보나치 수(재귀)

package dev.tkdwls9277.algorithm;

import java.util.Scanner;

public class algorithm10870 {  // FIXME 클래스 명 첫글자 대문자요
	static int count=0;  // FIXME static 클래스 변수로 선언할 필요가 없어요, 함수 인자로 변경하는게 좋아 보입니다.
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int first=0;  // FIXME first = 0; 처럼 작성하는게 가독성이 좋다고 하더군요... 뭐 개인 취향
		int second=1;
		int getnum=s.nextInt();
		int result=zagui(first,second,getnum);  // FIXME 쉼표 띄워쓰기도 가독성... 뭐 개인 취향이요
		System.out.println(result);
		
	}
	static int zagui(int a, int b, int breaknum) {
		if(count==breaknum)  // FIXME 중괄호 넣거나, 안넣거나 통일성이 필요합니다.
			return a;
		count++;
		return zagui(b,a+b,breaknum);
	}

}
