package collections;

/*
 * NodeStack is a custom class created to represent
 * a node based data structure that follows a 
 * Last-In-First-Out (LIFO) pattern. 
 */
public class NodeStack {
	/*
	 * Reference to the last node added to the stack
	 */
	private Node top;
	
	/*
	 * The push method allows us to add a node to the 
	 * top of our stack
	 */
	public void push(int element) {
		Node node = new Node(element);
		push(node);
	}
	
	// Overloaded push method
	public void push(Node node) {
		/*
		 * setNext changes the reference for the new
		 * node we are adding, to the last node
		 * that was on top of our stack
		 */
		node.setNext(top);
		
		/*
		 * the new 'top' of our stack, is the node
		 * we are adding
		 */
		this.top = node;
	}
	
	/*
	 * The pop method allows us to remove the topmost 
	 * node from the stack, and return it
	 */
	public Node pop() {
		Node poppedNode = top;
		top = top.getNext();
		poppedNode.setNext(null);
		return poppedNode;
	}

	// The peek method is used to view the current 'top' node
	public Node peek() {
		return top;
	}
}
