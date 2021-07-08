package iteration;

import java.util.Iterator;

import generics.GenericNode;

public class GenericIterableNodeStack<T> implements Iterable<GenericNode<T>> {
	private GenericNode<T> top;
	/*
	 * Used to track which node is 'next' 
	 * in the iterator
	 */
	private GenericNode<T> cursor;
	
	public void push(T element) {
		GenericNode<T> node = new GenericNode<T>(element);
		push(node);
	}
	
	public void push(GenericNode<T> node) {
		node.setNext(top);
		this.top = (node);
		this.cursor = top;
	}
	
	public GenericNode<T> pop() {
		GenericNode<T> poppedNode = top;
		top = top.getNext();
		poppedNode.setNext(null);
		return poppedNode;
	}

	public GenericNode<T> peek() {
		return top;
	}
	
	@Override
	public Iterator<GenericNode<T>> iterator() {
		return new NodeIterator();
	}
	
	/*
	 * 'NodeIterator' is a nested class, i.e. a class created
	 * within another. A class is simply a template to create
	 * objects. Nested classes allow you to consolidate more 
	 * complex objects within the scope of where that object
	 * would be used. In this case, this class will control
	 * how we 'move through' a Node Stack, the example we
	 * previously examined.
	 */
	private class NodeIterator implements Iterator<GenericNode<T>> {
		NodeIterator() {
			cursor = top;
		}
		
		/*
		 * hasNext is a method from the Iterator interface
		 */
		@Override
		public boolean hasNext() {
			if (cursor != null)
				return true;
			
			return false;
		}

		/*
		 * next is a method from the Iterator interface
		 */
		@Override
		public GenericNode<T> next() {
			GenericNode<T> ret = cursor;
			if (cursor != null)
				cursor = ret.getNext();
			
			return ret;
		}
	}
}
