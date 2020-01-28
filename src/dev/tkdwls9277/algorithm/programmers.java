package dev.tkdwls9277.algorithm;

public class programmers {

	public static void main(String[] args) {
		int[][] paths = {{1,2},{2,3},{3,4},{8,7},{7,6}};
		int[] answer = solution(paths);
		for(int i=0;i<answer.length;i++) {
			System.out.println(answer[i]);
		}
	}
	static int[] solution(int[][] paths) {
		int[] answer = new int[paths.length*2];
		int[] temp = new int[paths.length*2];
		int count=0,counttemp=0;
		for(int i=0;i<paths.length;i++) {
			if(paths[i][0]<paths[i][1]) {
				boolean flag=false;
				for(int j=0;j<answer.length;j++) {
					if(answer[j]==paths[i][0]) {
						answer[j]=paths[i][1];
						flag=true;
					}
					else if(answer[j]==paths[i][1]) {
						answer[j]=paths[i][0];
						flag=true;
					}
				}
				if(!flag) {
					answer[count]=paths[i][0];
					count++;
					answer[count]=paths[i][1];
					count++;
				}
			}
			else if(paths[i][0]>paths[i][1]){
				boolean flag=false;
				for(int j=0;j<answer.length;j++) {
					if(temp[j]==paths[i][0]) {
						temp[j]=paths[i][1];
						flag=true;
					}
					else if(temp[j]==paths[i][1]) {
						temp[j]=paths[i][0];
						flag=true;
					}
				}
				if(!flag) {
					temp[counttemp]=paths[i][0];
					counttemp++;
					temp[counttemp]=paths[i][1];
					counttemp++;
				}
			}
		}
		for(int i=0;i<counttemp;i++) {
			answer[count]=temp[i];	
			count=count+1;
			}
		int[] realanswer=new int[count];
		for(int i=0;i<count;i++) {
			realanswer[i]=answer[i];
		}
		return realanswer;
	}

}
