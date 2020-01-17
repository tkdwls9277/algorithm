//신기한 수



package test;

import java.util.Scanner;

public class algorithm17618 {
    public static void main(String args[]) {
    	int a;
    	int mok=0, ext;
    	int sum=0;
    	int count=0;
    	Scanner s = new Scanner(System.in);
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
