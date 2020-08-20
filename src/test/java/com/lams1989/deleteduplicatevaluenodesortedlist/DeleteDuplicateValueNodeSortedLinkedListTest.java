package com.lams1989.deleteduplicatevaluenodesortedlist;


import com.lams1989.deleteduplicatevaluenodesortedlist.DeleteDuplicateValueNodeSortedLinkedList.SinglyLinkedList;
import com.lams1989.deleteduplicatevaluenodesortedlist.DeleteDuplicateValueNodeSortedLinkedList.SinglyLinkedListNode;

import junit.framework.TestCase;

public class DeleteDuplicateValueNodeSortedLinkedListTest extends TestCase{

		public void test1() {
			SinglyLinkedList  llist = new SinglyLinkedList();
			int[] llistItem = { 141, 302, 164, 164, 530, 474 };

			for (int i = 0; i < llistItem.length; i++) {
				SinglyLinkedListNode llist_head = DeleteDuplicateValueNodeSortedLinkedList.insertNodeAtHead(llist.head, llistItem[i]);
				llist.head = llist_head;
			}
			
		}
}
