package com.macaco.business;

import com.macaco.interfaces.LinkedList;
import com.macaco.model.DoublyLinkedNode;
import com.macaco.model.Node;

public class MyDoublyLinkedList implements LinkedList {

	private DoublyLinkedNode node;

	@Override
	public void addFirst(String data) {
		if (node == null) {
			// Primeiro item
			node = new DoublyLinkedNode(data, null, null);
		} else {
			DoublyLinkedNode oldFirst = node;
			DoublyLinkedNode newFirst = new DoublyLinkedNode(data, oldFirst,
					null);
			oldFirst.setPrevious(newFirst);
			node = newFirst;
		}

	}

	@Override
	public void addLast(String data) {
		if (node == null) {
			// Primeiro item
			node = new DoublyLinkedNode(data, null, null);
		} else {
			DoublyLinkedNode nodeCopy = node;

			while (nodeCopy.getNext() != null) {
				nodeCopy = nodeCopy.getNext();
			}

			DoublyLinkedNode newLast = new DoublyLinkedNode(data, null,
					nodeCopy);
			nodeCopy.setNext(newLast);
		}

	}

	@Override
	public String show() {
		StringBuilder sb = new StringBuilder();
		for (DoublyLinkedNode x = node; x != null; x = x.getNext()) {
			sb.append(x.getData());
		}
		return sb.toString();
	}

	@Override
	public void removeFirst() {
		if (node != null) {
			node = node.getNext();
			if (node != null) {
				node.setPrevious(null);
			}

		}

	}

	@Override
	public void removeLast() {
		if (node == null)
			return;

		DoublyLinkedNode nodeCopy = node;

		while (nodeCopy.getNext() != null) {
			nodeCopy = nodeCopy.getNext();
		}

		DoublyLinkedNode newLast = nodeCopy.getPrevious();

		if (newLast != null) {
			newLast.setNext(null);
		} else {
			// The list had only one elemente
			node = null;
		}

	}

	@Override
	public String invertedShow() {
		if (node == null)
			return "";

		DoublyLinkedNode temp = node;
		while (temp.getNext() != null) {
			temp = temp.getNext();
		}

		StringBuilder sb = new StringBuilder();

		while (temp != null) {
			sb.append(temp.getData());
			temp = temp.getPrevious();
		}

		return sb.toString();

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
