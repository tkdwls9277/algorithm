package dev.tkdwls9277.algorithm;

import java.util.ArrayList;

public class Algorithm10828 {

	ArrayList<Integer> stack = new ArrayList<Integer>();
	int count=-1;
	
	public static void main(String[] args) {
		Algorithm10828 algo = new Algorithm10828();
		algo.push(4);
		algo.push(5);
		algo.push(6);
		System.out.println(algo.pop());
		for(int i=0;i<algo.count;i++) {
			System.out.print(algo.stack.get(i)+", ");
		}
	}
	
	public void push(int x) {
		stack.add(x);
		count++;
	}
	
	public int pop() {
		return stack.indexOf(count--);
	}

}
