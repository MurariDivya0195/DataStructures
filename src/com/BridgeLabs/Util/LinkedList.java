package com.BridgeLabs.Util;

public class LinkedList<T> {

	 
		private Node<T> head;
		private Node<T> tail;
		private int size = 0;
		static String[] stringArray = new String[100];
		static int[] intArray = new int[100];
		static LinkedList<?> newList = new LinkedList<Object>();

		public boolean isEmpty() {
			return head == null;
		}

		@SuppressWarnings("unchecked")
		public String addElement(String key) {
			Node<T> node = new Node<T>();
			node.setValue((T) key);
			size++;

			/**
			 * check if the list is empty
			 */
			if (isEmpty()) {
				// since there is only one element, both head and
				// tail points to the same object.
				head = node;
				tail = node;
			} else {
				// set current tail next link to new node
				tail.setNextRef(node);
				// set tail as newly created node
				tail = node;
			}
			return null;
		}

		public void traverse() {

			Node<T> tmp = head;
			while (true) {
				if (tmp == null) {
					break;
				}
				System.out.println(tmp.getValue());
				tmp = tmp.getNextRef();
			}

		}

		public void get() {

			Node<T> tmp = head;
			int k = 0;
			while (true) {
				if (tmp == null) {
					break;
				}
				stringArray[k] = String.valueOf(tmp.getValue());
				k++;
				tmp = tmp.getNextRef();
			}
		}

		public void get1() {

			Node<T> tmp = head;
			int k = 0;
			while (true) {
				if (tmp == null) {
					break;
				}
				intArray[k] = (int) tmp.getValue();
				k++;
				tmp = tmp.getNextRef();
			}
		}

		public LinkedList<?> searchKey(LinkedList<T> list, String key) {
			Node<T> current = head;
			boolean status = false;
			for (int i = 0; i < stringArray.length - 1; i++) {
				if (stringArray[i] != null && stringArray[i].equals(key)) {
					status = true;
					stringArray[i] = null;
					current = current.getNextRef();
					break;
				}
			}
			for (int i = 0; i < stringArray.length; i++) {
				if (stringArray[i] != null)
					newList.addElement(stringArray[i]);
			}
			if (status) {
				System.out.println("Element is present in the list ");
			} else {
				System.out.println("Element is not present in the list ");
				newList.addElement(key);
			}

			return newList;
		}

		public String toString() {
			Node<T> temp = head;
			String elements = "";
			while (temp.getNextRef() != null) {
				elements += " " + temp.getValue() + " ";
				temp = temp.getNextRef();
			}
			return elements + temp.getValue();
		}

		public void sort(LinkedList<Integer> str) {
			Node<T> current = head;
			str.get1();
			for (int i = 0; i < intArray.length - 1; i++) {
				if (intArray[i] >= intArray[i + 1]) {
					int temp = intArray[i];
					intArray[i] = intArray[i + 1];
					intArray[i + 1] = temp;
					current = current.getNextRef();
					break;
				}
			}

			for (int i = 0; i < intArray.length; i++) {
				if (intArray[i] != 0)
					newList.addElement(stringArray[i]);
			}
		}

	}

