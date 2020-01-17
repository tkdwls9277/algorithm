//피보나치수 구하기(재귀)

package test;

import java.util.Scanner;

public class algorithm10870 {
	static int count=0;
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int first=0;
		int second=1;
		int getnum=s.nextInt();
		int result=zagui(first,second,getnum);
		System.out.println(result);
		
	}
	static int zagui(int a, int b, int breaknum) {
		if(count==breaknum)
			return a;
		count++;
		return zagui(b,a+b,breaknum);
	}

}
