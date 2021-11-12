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

	// print the list
	public void printFun() {
		if (head == null) {
			System.out.println("Linked List is Empty");
		} else {
			Node temp = head;
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.next;
			}
		}
	}
}