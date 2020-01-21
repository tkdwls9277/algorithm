//신기한 수  // FIXME 1라인은 package 선언으로 남겨두고, 클래스에 주석으로 옮기시죠

package dev.tkdwls9277.algorithm;

import java.util.Scanner;

public class algorithm17618 {  // FIXME 클래스 이름 시작 대문자
    public static void main(String args[]) {
    	int a;
    	int mok=0, ext;
    	int sum=0;
    	int count=0;
    	Scanner s = new Scanner(System.in);  // FIXME stdin close 필요합니다
    	a = s.nextInt();
    	
    	for(int i=1;i<=a;i++) {
    		mok=i;
    		sum=0;
    		while(true) {
    			
    			if(mok==0)
    				break;
    			ext=mok%10;
    			mok=mok/10;
    			
    			sum=sum+ext;
    		}
    		
    		if(i%sum==0)
    			count++;
    	}
    	System.out.println(count);
    }
}
