//add your name and matric number here
//Jessica Lavin
//2495543L
//do not include package statement 
//do not import any classes
//just complete the methods indicated,
//namely:
//insertTail
//deleteAlternate and
//merge

public class AssessmentSLL<E extends Comparable<E>> {

	// Each SLL object is the header of
	// a singly-linked-list

	private Node<E> first;

	/**
	 * constructor
	 */
	public AssessmentSLL() {
		// Construct an empty SLL.
		first = null;
	}

	// //////// Inner class //////////
	private static class Node<E> {
		// Each Node object is a node of a
		// singly-linked-list.
		protected E element;
		protected Node<E> next;

		public Node(E elem, Node<E> n) {
			element = elem;
			next = n;
		}

	}

	// ////////////////////////////////

	/**
	 * print all elements starting from first node
	 */
	public void printFirstToLast() {
		// Print all elements in this SLL, in first-to-last order.
		Node<E> curr = first;
		while (curr != null) {
			System.out.println(curr.element);
			curr = curr.next;
		}
	}

	/**
	 * insert new node containing elem at front of list
	 *
	 */
	public void insert(E elem) {
		Node<E> newNode = new Node<E>(elem, first);
		first = newNode;
	}

	/**
	 * add new node to end of list
	 */
	public void insertTail(E elem) {
		Node<E> n = new Node<>(elem, null);
		if (first == null) {
			first = n;
		} else {
			Node<E> curr = first;
			while (curr.next != null) {
				curr = curr.next;
			}
			curr.next = n;
		}
		return;
	}

	/** delete every alternate element
	 *  imagine the elements are indexed 0, 1, 2, ... , n-1
	 *  delete all the odd indexed elements
	 *  so if list had values ant, badger, cat, dog
	 *  the method would delete nodes containing badger and dog
	 */
	public void deleteAlternate() {
		if (first == null) {
			return;
		}
		Node<E> prev = first;
		Node<E> curr = first.next;
		while (prev != null && curr != null)
		{
			prev.next = curr.next;
			curr = null;
			prev = prev.next;
			if (prev != null) {
				curr = prev.next;
			}
		}
		return;
	}

	public AssessmentSLL<E> mergeTwo(AssessmentSLL<E> listB) {
		AssessmentSLL<E> tempList = new AssessmentSLL<E>();
		Node<E> listANode = this.first;
		Node<E> listBNode = listB.first;
		while (listANode != null && listBNode != null) {
			if (listANode.element.compareTo(listBNode.element) < 0) {
				tempList.insertTail(listANode.element);
				listANode = listANode.next;
			} else {
				tempList.insertTail(listBNode.element);
				listBNode = listBNode.next;
			}
		}
		while (listANode != null) {
			tempList.insertTail(listANode.element);
			listANode = listANode.next;
		}
		while (listBNode != null) {
			tempList.insertTail(listBNode.element);
			listBNode = listBNode.next;
		}
		return tempList;
	}

	public AssessmentSLL<E> removeDups(){
		Node<E> curr = this.first;
		while (curr != null) {
			Node<E> counter = curr;
			while(counter != null && counter.element == curr.element){
				counter = counter.next;
			}
			curr.next = counter;
			curr = curr.next;
		}
		return this;
	}

	/**
	 * method to merge two ordered lists with this one whilst removing duplicates
	 * order should be preserved
	 * you need to replace the type list1, list2 and list3 and the return type
	 * with the new name of this class
	 */
	public AssessmentSLL<E> merge(AssessmentSLL<E> list1, AssessmentSLL<E> list2) {
		AssessmentSLL<E> mergedList = new AssessmentSLL<E>();
		mergedList = this.mergeTwo(list1);
		mergedList = list2.mergeTwo(mergedList);
		mergedList = mergedList.removeDups();
		return mergedList;
	}
}

