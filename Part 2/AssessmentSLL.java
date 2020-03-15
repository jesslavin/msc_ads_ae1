//add your name and matric number here
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
		// 1. create new node n, set next to null
		Node<E> n = new Node<E>(elem, null);
		// 2. If the SLL is empty:
		if (first == null) {
			// 2.1. Set n as SLL head
			first = n;
			// 2.2. Return
			return;
		}
		// 3. Else, if elements are present in the SLL:
		Node<E> curr = first;
		while (curr.next !=null) {
			// 3.1. Traverse till last node in the SLL
			curr = curr.next;
		}
		// 3.2. Change the next of the last node in the SLL to n
		curr.next = n;
		// 3.3. Return
		return;
	}

	/** delete every alternate element
	 *  imagine the elements are indexed 0, 1, 2, ... , n-1
	 *  delete all the odd indexed elements
	 *  so if list had values ant, badger, cat, dog
	 *  the method would delete nodes containing badger and dog
	 */
	public void deleteAlternate() {
		// 1. If the SLL is empty, return
		if (first == null) {
			return;
		}
		// 2. Else, initialise previous node and current node to the first and second nodes in the list
		Node prev = first;
		Node curr = first.next;
		// 3. While neither the previous node or current node are empty, repeat:
		while (prev != null && curr != null)
		{
			// 3.1. Change the next link of the previous node to the next link of the current node freeing the current node
			prev.next = curr.next;
			// 3.2. Empty the contents of current node
			curr = null;
			// 3.3. Traverse updating the previous and current nodes to the next set of nodes in the list
			prev = prev.next;
			if (prev != null) {
				curr = prev.next;
			}
		}
		// 4. Return
		return;
	}

	/**
	 * method to merge two ordered lists with this one whilst removing duplicates
	 * order should be preserved
	 * you need to replace the type list1, list2 and list3 and the return type
	 * with the new name of this class
	 */
	public AssessmentSLL<E> merge(AssessmentSLL<E> list1, AssessmentSLL<E> list2) {

		AssessmentSLL<E> mergedList = new AssessmentSLL<E>();

		while (list1.first != null && list2.first != null) {

			if (list1.first.element.compareTo(list2.first.element) < 0) {
				mergedList.insertTail(list1.first.element);
				list1.first = list1.first.next;
			} else {
				mergedList.insertTail(list2.first.element);
				if (list1.first.element.compareTo(list2.first.element) != 0) {
					list2.first = list2.first.next;
				} else {
					list1.first = list1.first.next;
					list2.first = list2.first.next;
				}
			}
		}
		while (list1.first != null) {
			mergedList.insertTail(list1.first.element);
			list1.first = list1.first.next;
		}
		while (list2.first != null) {
			mergedList.insertTail(list2.first.element);
			list2.first = list2.first.next;
		}
		return mergedList;
	}
}

