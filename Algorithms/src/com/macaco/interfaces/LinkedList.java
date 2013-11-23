package com.macaco.interfaces;

import com.macaco.model.Node;

public interface LinkedList {

	public void addFirst(String data);

	public void addLast(String data);

	public String show();

	public String invertedShow();

	public void removeFirst();

	public void removeLast();

	public void removeBefore(Node node);

	public void removeAfter(Node node);

	public void addBefore(Node node, Node newNode);

	public void addAfter(Node node, Node newNode);

}
