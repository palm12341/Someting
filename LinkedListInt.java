package eecs233hw2;

public class LinkedListInt {
	LLNode head;

	public LinkedListInt() {
		head = null;
	}

	public LLNode getHeadNode() {
		return head;
	}

	public void setHeadNode(LLNode newHead) {
		head = newHead;
	}

	public void rotate(int x) {

		for (int i = 0; i < x; i++) {
			// Find last node
			LLNode nodeInst = head;
			while (nodeInst.next != null && nodeInst.next.next !=null) {
				nodeInst = nodeInst.next;
			}
			
			//LLNode secondToLast = nodeInst;
			
			LLNode tempNode = head;
			head = nodeInst.next;
			head.next = tempNode;
			nodeInst.next = null;			
			/*
			LLNode tempNode = nodeInst.next;
			nodeInst.next = null;
			//this is the last node
			nodeInst = tempNode.next;
			// Now nodeInst is the tail node. Set it's pointer to the current head, then
			// make nodeInst head.
			nodeInst.next = head;
			
			this.setHeadNode(this.getHeadNode());
			*/

		}
	}

	public static void main(String[] args) {
		LinkedListInt test = new LinkedListInt();
		test.setHeadNode(new LLNode(5,new LLNode(2,new LLNode(4,new LLNode(3,null)))));
		
		LLNode nodeInst = test.getHeadNode();

		while (nodeInst.next != null) {
			System.out.println(nodeInst.value);
			nodeInst = nodeInst.next;
		}
		System.out.println(nodeInst.value);
		
		test.rotate(2);
		nodeInst = test.getHeadNode();

		System.out.println("rot");
		while (nodeInst.next != null) {
			System.out.println(nodeInst.value);
			nodeInst = nodeInst.next;
		}
		System.out.println(nodeInst.value);
		
	}
}
