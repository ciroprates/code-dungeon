package com.macaco.model;
public class Node {

	private Node next;

	private String data;

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node(String data,Node next) {
		super();
		this.next = next;
		this.data = data;
	}

	@Override
	public String toString() {
		return String.format("Node [next=%s, data=%s]", next, data);
	}

	

}
