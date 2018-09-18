package edu.bu.datastructures;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.datastructures.list.ArrayBasedList;

public class ArrayBasedListTest {
	@Test
	public void testSizeOfEmptyList() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		assertEquals(0, list.size());
	}

	@Test
	public void testAddingToList() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		list.add(3);
		assertEquals(3, (int) list.get(0));
	}

	@Test
	public void testAddingToListAtPosition() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		list.add(3);
		list.add(0, 5);

		int actual = (int) list.get(0);
		assertEquals(5, actual);

		assertEquals(2, list.size());
	}

	@Test
	public void testRemovingFromList() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		list.add(3);
		list.add(4);
		Integer removed = list.remove(1);
		assertEquals(4, (int) removed);
		assertEquals(1, list.size());
	}

	@Test(expected = Exception.class)
	public void testRemovingFromEmptyList() throws Exception {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		list.remove(0);
	}

	@Test
	public void testAddingToFullList() {

		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();

		for (int i = 0; i < 20; i++) {
			list.add((int) Math.random() * 100);
		}

		list.add(99);

		int actual = 99;

		assertEquals(99, (int) list.get(20));
	}

	@Test(expected = Exception.class)
	public void testGetMethodExceptions() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();

		list.get(1);
		list.add(42);
		list.get(-1);
		list.get(20);
		 
	}
	
	@Test(expected = Exception.class)
	public void testSetMethodExceptions() {
		ArrayBasedList<Integer> list = new ArrayBasedList<Integer>();
		
		list.get(0);

		for (int i = 0; i < 20; i++) {
			list.add((int) Math.random() * 100);
		}
		
		list.get(-1);
		list.get(21);
		 
	}

	// TODO: add more tests 1) test removing from empty list 2)adding to full list
	// 3)add test for cases that expect exception
}
