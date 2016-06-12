package org.sridhar.dspractice.tree;

public interface ITree<T> {
  public boolean addNode(T node);

  //public T removeLeftChild();
  //public T removeRightChild();
  public T removeNode();

  public void clear();

  public boolean contains();

  public int size();
  
  

}
