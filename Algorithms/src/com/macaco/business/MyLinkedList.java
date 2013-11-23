package com.macaco.business;

import com.macaco.interfaces.LinkedList;

import com.macaco.model.Node;

public class MyLinkedList implements LinkedList {

	private Node node;

	@Override
	public void addFirst(String data) {
		if (node == null) {
			// Primeiro item
			node = new Node(data, null);
		} else {
			Node oldFirst = node;
			node = new Node(data, oldFirst);
		}
	}

	@Override
	public void addLast(String data) {

		if (node == null) {
			// Primeiro item
			node = new Node(data, null);
		} else {
			Node nodeCopy = node;

			while (nodeCopy.getNext() != null) {
				nodeCopy = nodeCopy.getNext();
			}

			Node newLast = new Node(data, null);
			nodeCopy.setNext(newLast);
		}
	}

	@Override
	public String show() {

		StringBuilder sb = new StringBuilder();
		for (Node x = node; x != null; x = x.getNext()) {
			sb.append(x.getData());
		}
		return sb.toString();
	}

	@Override
	public void removeFirst() {
		if (node != null) {
			node = node.getNext();
		}
	}

	@Override
	public void removeLast() {
		throw new RuntimeException("Not possible!");
	}

	@Override
	public String invertedShow() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void removeBefore(Node node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAfter(Node node) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addBefore(Node node, Node newNode) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void addAfter(Node node, Node newNode) {
		// TODO Auto-generated method stub
		
	}

}
