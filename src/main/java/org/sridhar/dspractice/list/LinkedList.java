package org.sridhar.dspractice.list;

public class LinkedList<T> {
  int size;
  Node<T> start;
  Node<T> currPosion;

  public LinkedList() {
    this.size = 0;
    this.start = null;
    this.currPosion = null;
  }

  public void printList() {
    Node<T> beg = this.start;
    do {
      if (beg == null || isEmpty()) {
        return;
      }
      System.out.println(beg.getData());
      beg = beg.getNext();
    } while (beg != null);

  }

  private int incrementSize() {
    return ++size;
  }

  public void printListInReverse() {

  }

  public boolean addItemAtNthPosFromBeginning(int n, Node<T> data) {
    if (n < this.size && data != null) {
      Node<T> beg = this.start;
      while (n > 0 && beg != null) {
        beg = beg.getNext();
        n--;
      }
      Node<T> temp = beg.next;
      data.setNext(temp);
      beg.setNext(data);
      incrementSize();
      return true;
    } else {
      return false;
    }
  }

  public boolean addItemAtNthPosFromEnd(int n, Node<T> data) {
    Node<T> slowPtr = this.start;
    Node<T> fastPtr = this.start;
    if (n < this.size && n >= 0 && data != null) {
      while (n > 0 && fastPtr != null) {
        fastPtr = fastPtr.getNext();
        n--;
      }
      while (fastPtr != null) {
        slowPtr = slowPtr.getNext();
        fastPtr = fastPtr.getNext();
      }
      Node<T> temp = slowPtr.getNext();
      data.setNext(temp);
      slowPtr.setNext(data);
      incrementSize();
      return true;
    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    LinkedList<String> ll = new LinkedList<String>();
    ll.addItemToLinkedList(ll.createNode("sridhar"));
    ll.addItemToLinkedList(ll.createNode("hari"));
    ll.addItemToLinkedList(ll.createNode("mom"));
    ll.addItemToLinkedList(ll.createNode("visu"));
    ll.addItemToLinkedList(ll.createNode("manu"));
    ll.addItemToLinkedList(ll.createNode("abhi"));
    ll.addItemToLinkedList(ll.createNode("ravi"));
    ll.addItemToLinkedList(ll.createNode("kash"));
    System.out.println(ll.getSize());
    ll.printList();
  }

  public boolean addItemToLinkedList(Node<T> data) {
    if (this.isEmpty()) {
      this.start = data;
      this.currPosion = this.start;
    } else {
      this.currPosion.setNext(data);
      this.currPosion = this.currPosion.getNext();
    }
    incrementSize();
    return true;
  }

  private boolean isEmpty() {
    return (this.size == 0 ? true : false || (this.start == null) ? true : false);
  }

  public int getSize() {
    return this.size;
  }

  public Node<T> createNode(T data) {
    return new Node<T>(data);
  }

  public static class Node<T> {
    T data;
    Node<T> next;

    Node(T data) {
      this.data = data;
    }

    public void setNext(Node<T> next) {
      this.next = next;
    }

    public Node<T> getNext() {
      return this.next;
    }

    public T getData() {
      return this.data;
    }

    @Override
    public String toString() {
      return "Node [data=" + data + ", next=" + next + "]";
    }

  }
}
