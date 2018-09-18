package edu.bu.datastructures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.datastructures.list.ArrayBasedList;
import edu.bu.datastructures.list.LinkedList;

public class LinkedListTest {
	@Test
	public void testGetFromList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(3);
		assertEquals(3, (int) list.get(0));
	}

	@Test(expected = NullPointerException.class)
	public void testRemovingFromEmptyList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		Object o = list.remove(1);

	}

	@Test(expected = Exception.class)
	public void testgetfromlist1Exception() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		Object o = list.get(-1);
		Object o1 = list.get(2);

	}

	@Test(expected = Exception.class)
	public void testremoveFromListException() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		list.add(0);
		Object o = list.remove(2);
		Object o1 = list.remove(-2);

	}

	@Test(expected = Exception.class)
	public void addToListAtPositionException() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		list.add(1, 0);
		list.add(-1, 0);
	}

	@Test
	public void testSizeOfEmptyList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		assertEquals(0, list.size());
	}

	@Test
	public void testSizeOfList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(3);
		list.add(4);
		assertEquals(2, list.size());
	}

	@Test
	public void testRemoveFromList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(3);
		list.add(4);
		list.add(98);
		list.remove(1);
		assertEquals(98, (int) list.get(1));
	}

	@Test
	public void testSetElementList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(3);
		list.set(0, 12);
		assertEquals(12, (int) list.get(0));
	}

	@Test
	public void testAddToList() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(64);
		assertEquals(64, (int) list.get(0));
	}

	@Test
	public void testAddingToListAtSpecificPosition() {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(3);
		list.add(0, 76);
		assertEquals(76, (int) list.get(0));
		assertEquals(2, list.size());
	}

	// TODO add remove test
	// TODO: add more tests 1) test removing from empty list 2)adding to full list
	// 3)add test for cases that expect exception
}
