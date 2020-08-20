package com.lams1989.deleteduplicatevaluenodesortedlist;

import com.lams1989.deleteduplicatevaluenodesortedlist.DeleteDuplicateValueNodeSortedLinkedList.SinglyLinkedList;
import com.lams1989.deleteduplicatevaluenodesortedlist.DeleteDuplicateValueNodeSortedLinkedList.SinglyLinkedListNode;

import junit.framework.TestCase;

public class DeleteDuplicateValueNodeSortedLinkedListTest extends TestCase {

	public void test1() {
		SinglyLinkedList llist = new SinglyLinkedList();
		int[] llistItem = { 530, 474, 302, 164, 164, 141 };

		for (int i = 0; i < llistItem.length; i++) {
			SinglyLinkedListNode llist_head = DeleteDuplicateValueNodeSortedLinkedList.insertNodeAtHead(llist.head,
					llistItem[i]);
			llist.head = llist_head;
		}

		DeleteDuplicateValueNodeSortedLinkedList.deleteNodeDuplicate(llist.head);

		int[] llistexpected = { 141, 164, 302, 474, 530 };
		int[] llistactual = new int[llistexpected.length];
		for (int i = 0; i < llistexpected.length; i++) {
			llistactual[i] = llist.head.data;
			llist.head = llist.head.next;
		}

		for (int i = 0; i < llistactual.length; i++) {
			assertEquals(llistexpected[i], llistactual[i]);
		}
	}
}
