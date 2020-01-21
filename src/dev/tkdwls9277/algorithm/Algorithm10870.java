package dev.tkdwls9277.algorithm;

import java.util.Scanner;

//피보나치 수(재귀)
public class Algorithm10870 {
	
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int first = 0;
		int second = 1;
		int count=0;
		int getnum = s.nextInt();
		int result=zagui(first, second, getnum, count);
		System.out.println(result);
		s.close();
	}
	
	static int zagui(int a, int b, int breaknum, int count) {
		if(count==breaknum) {
			return a;
		}
		count++;
		return zagui(b, a+b, breaknum, count);
	}

}
