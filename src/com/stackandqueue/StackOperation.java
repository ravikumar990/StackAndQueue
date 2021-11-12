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

	public static void peek() {
		Stack<Integer> list = new Stack<>();
		list.push(70);
		list.push(30);
		list.push(56);
		System.out.println(list.peek());
	}

	public static void pop() {
		System.out.println("Before Pop:");
		Stack<Integer> list = new Stack<>();
		list.push(56);
		list.push(30);
		list.push(70);
		System.out.println(list);
		list.pop();
		System.out.println("After Pop:");
		System.out.println(list);
	}
}