package org.sridhar.dspractice.tree;

public class BinaryTre<T> implements ITree<T> {
  BinaryTre<T> tree;

  public static void main(String[] args) {
    // TODO Auto-generated method stub

  }

  public boolean addNode(T node) {
    // TODO Auto-generated method stub
    return false;
  }

  public T removeNode() {
    // TODO Auto-generated method stub
    return null;
  }

  public void clear() {
    // TODO Auto-generated method stub

  }

  public boolean contains() {
    // TODO Auto-generated method stub
    return false;
  }

  public int size() {
    // TODO Auto-generated method stub
    return 0;
  }

  public BinaryTre<T> buildTree() {
    return null;
  }

  public static class Node<T> {
    T data;
    Node<T> leftChild;
    Node<T> rightChild;

    public T getData() {
      return data;
    }

    public void setData(T data) {
      this.data = data;
    }

    public Node<T> getLeftChild() {
      return leftChild;
    }

    public void setLeftChild(Node<T> leftChild) {
      this.leftChild = leftChild;
    }

    public Node<T> getRightChild() {
      return rightChild;
    }

    public void setRightChild(Node<T> rightChild) {
      this.rightChild = rightChild;
    }

  }

}
