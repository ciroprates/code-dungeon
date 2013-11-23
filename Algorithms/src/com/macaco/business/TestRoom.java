package com.macaco.business;

import com.macaco.interfaces.LinkedList;

public class TestRoom {
	public static void main(String[] args) {
		// LinkedList ll = new MyLinkedList();
		LinkedList ll = new MyDoublyLinkedList();
		ll.addFirst("a");
		ll.addFirst("b");
		ll.addFirst("c");
		ll.addFirst("d");

		System.out.println("Show 1:" + ll.show());
		System.out.println("Show 2:" + ll.invertedShow());

		ll.removeFirst();
		ll.removeFirst();
		ll.removeFirst();
		ll.removeFirst();

		System.out.println("Show 3:" + ll.show());

		ll.addLast("a");
		ll.addLast("b");
		ll.addLast("c");
		ll.addLast("d");

		System.out.println("Show 4:" + ll.show());

		ll.removeLast();
		ll.removeLast();

		System.out.println("Show 5:" + ll.show());
		System.out.println("Show 6:" + ll.invertedShow());

	}
}
