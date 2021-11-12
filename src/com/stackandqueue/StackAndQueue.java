package com.stackandqueue;

public class StackAndQueue {

	Node head;
	Node tail;
	Node top;

	public void push(int data) {
		Node newnode = new Node(data);
		if (head == null) {
			head = newnode;
			tail = newnode;
		} else {
			Node tempNode = head;
			this.head = newnode;
			newnode.next = tempNode;
		}
		top = head;
	}

	public void peek() {
		System.out.println("Top element is " + this.top.data);
	}

	public void pop() {
		Node temp = top;
		while (temp != null) {
			Node tempNode = this.head;
			this.head = tempNode.next;
			temp = temp.next;
		}
	}
}