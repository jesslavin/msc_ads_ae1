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
		// 1. Initialise new node n, set n.next to null
		Node<E> n = new Node<>(elem, null);
		// 2. If the SLL is empty:
		if (first == null) {
			// a. Set first to n
			first = n;
			// 3. Else, if elements are present in the SLL:
		} else {
			// a. Initialise new node current, set current to first
			Node<E> curr = first;
			// b. Traverse current till it is the last node in the SLL
			while (curr.next != null) {
				curr = curr.next;
			}
			// c. Set current.next to n
			curr.next = n;
		}
		// 4. Return
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
		// 2. Else, initialise new nodes previous and current, set previous to first and current to first.next
		Node<E> prev = first;
		Node<E> curr = first.next;
		// 3. While neither the previous or current are empty, repeat:
		while (prev != null && curr != null)
		{
			// a. Free current by setting previous.next to current.next
			prev.next = curr.next;
			// b. Empty the contents of current
			curr = null;
			// c. Set previous to previous.next
			prev = prev.next;
			// d. If previous is not empty set current to previous.next
			if (prev != null) {
				curr = prev.next;
			}
		}
		// 4. Return
		return;
	}

	// Helper function (mergeTwo):
	public AssessmentSLL<E> mergeTwo(AssessmentSLL<E> listB) {
		// a. Create new empty SLL, temp
		AssessmentSLL<E> tempList = new AssessmentSLL<E>();
		// b. Initialise first node of list a and list b
		Node<E> listANode = this.first;
		Node<E> listBNode = listB.first;
		// c. While a and b are not empty, repeat:
		while (listANode != null && listBNode != null) {
			// i. If a < b add a to end of temp, set a to a.next
			if (listANode.element.compareTo(listBNode.element) < 0) {
				tempList.insertTail(listANode.element);
				listANode = listANode.next;
				// ii. Else add b to end of temp, set b to b.next
			} else {
				tempList.insertTail(listBNode.element);
				listBNode = listBNode.next;
			}
		}
		// d. While a is not empty, repeat:
		while (listANode != null) {
			// i. Add a to end of temp, set a to a.next
			tempList.insertTail(listANode.element);
			listANode = listANode.next;
		}
		// e. While b is not empty, repeat:
		while (listBNode != null) {
			// i. Add b to end of temp, set a to b.next
			tempList.insertTail(listBNode.element);
			listBNode = listBNode.next;
		}
		// f. Return temp
		return tempList;
	}

	// Helper function (removeDups):
	public AssessmentSLL<E> removeDups(){
		// a. Initialise new node current as list.first
		Node<E> curr = this.first;
		// b. While current is not empty:
		while (curr != null) {
			// i. Initialise new node counter as current
			Node<E> counter = curr;
			// ii.	While counter is not empty and counter equals current, set counter to counter.next
			while(counter != null && counter.element == curr.element){
				counter = counter.next;
			}
			// c. Set current.next to counter
			curr.next = counter;
			// d. Set current to current.next
			curr = curr.next;
		}
		// e. Return
		return this;
	}

	/**
	 * method to merge two ordered lists with this one whilst removing duplicates
	 * order should be preserved
	 * you need to replace the type list1, list2 and list3 and the return type
	 * with the new name of this class
	 */
	public AssessmentSLL<E> merge(AssessmentSLL<E> list1, AssessmentSLL<E> list2) {
		// 1. Create new empty SLL, L3
		AssessmentSLL<E> mergedList = new AssessmentSLL<E>();
		// 2. Set L3 to result of helper function mergeTwo (L, L1)
		mergedList = this.mergeTwo(list1);
		// 3. Set L3 to result of helper function mergeTwo (L2, L3)
		mergedList = list2.mergeTwo(mergedList);
		// 4. Remove any duplicates from L3 using helper function (removeDups):
		mergedList = mergedList.removeDups();
		// 5. Return L3
		return mergedList;
	}
}

