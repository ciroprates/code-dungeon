package com.macaco.model;

public class DoublyLinkedNode {

	String data;

	DoublyLinkedNode next;

	DoublyLinkedNode previous;

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public DoublyLinkedNode getNext() {
		return next;
	}

	public void setNext(DoublyLinkedNode next) {
		this.next = next;
	}

	public DoublyLinkedNode getPrevious() {
		return previous;
	}

	public void setPrevious(DoublyLinkedNode previous) {
		this.previous = previous;
	}

	@Override
	public String toString() {
		return String.format("DoublyNode [data=%s, next=%s, previous=%s]",
				data, next, previous);
	}

	public DoublyLinkedNode(String data, DoublyLinkedNode next, DoublyLinkedNode previous) {
		super();
		this.data = data;
		this.next = next;
		this.previous = previous;
	}

}
