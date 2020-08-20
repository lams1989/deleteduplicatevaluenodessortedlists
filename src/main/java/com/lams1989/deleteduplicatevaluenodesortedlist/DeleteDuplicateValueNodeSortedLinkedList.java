package com.lams1989.deleteduplicatevaluenodesortedlist;

public class DeleteDuplicateValueNodeSortedLinkedList {

	static class SinglyLinkedListNode {
		public int data;
		public SinglyLinkedListNode next;

		public SinglyLinkedListNode(int nodeData) {
			this.data = nodeData;
			this.next = null;
		}
	}

	static class SinglyLinkedList {
		public SinglyLinkedListNode head;
		public SinglyLinkedListNode tail;

		public SinglyLinkedList() {
			this.head = null;
			this.tail = null;
		}

	}

	public static void main(String args[]) {

		SinglyLinkedList llist = new SinglyLinkedList();
		int[] llistItem = { 141, 302, 164, 164, 530, 474 };

		for (int i = 0; i < llistItem.length; i++) {
			SinglyLinkedListNode llist_head = insertNodeAtHead(llist.head, llistItem[i]);
			llist.head = llist_head;
		}
		deleteNodeDuplicate(llist.head);
		printLinkedList(llist.head);
	}

	static SinglyLinkedListNode deleteNodeDuplicate(SinglyLinkedListNode head) {
		if (head == null)
			return null;
		SinglyLinkedListNode nextvalue = head.next;
		while (nextvalue != null && head.data == nextvalue.data) {
			nextvalue = nextvalue.next;
		}
		head.next = deleteNodeDuplicate(nextvalue);
		return head;
	}

	static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode head, int data) {
		SinglyLinkedListNode nodeInsert = new SinglyLinkedListNode(data);
		if (head == null) {
			return nodeInsert;
		}
		nodeInsert.next = head;
		return nodeInsert;
	}

	static void printLinkedList(SinglyLinkedListNode head) {

		while (head != null) {
			System.out.println(head.data);
			head = head.next;
		}

	}
}
