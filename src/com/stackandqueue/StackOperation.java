package com.stackandqueue;

import java.util.Stack;

public class StackOperation {
	public static void addElement() {
		Stack<Integer> list = new Stack<>();
		list.push(56);
		list.push(30);
		list.push(70);
		System.out.println(list);
	}
}