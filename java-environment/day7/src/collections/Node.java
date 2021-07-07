package collections;

/*
 * Node is a custom class we are creating to represent
 * individual pieces of data within a data structure
 */
public class Node {
	// data is the information our node is 'holding' onto
	private Integer data;
	
	// next is a reference to another node in our collection
	private Node next;
	
	// Constructor for our node
	public Node(Integer data) {
		this.data = data;
	}
	
	// getters and setters
	public Integer getData() {
		return data;
	}
	public void setData(Integer data) {
		this.data = data;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}

	/*
	 * Overriding the toString method, simply so
	 * that we can print out the nodes with some
	 * meaningful information
	 */
	@Override
	public String toString() {
		return "Node [data=" + data + "]";
	}
}
