package edu.bu.datastructures.list;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayBasedList<T> implements List<T> {
	private static final int DEFAULT_CAPACITY = 20;
	private T[] elements;
	private int size;

	public static void main(String[] args) {

	}

	public ArrayBasedList() {
		this(DEFAULT_CAPACITY);
	}

	public ArrayBasedList(int capacity) {
		elements = (T[]) new Object[capacity];

	}

	public int size() {
		return size;
	}

	public T get(int i) {
		if (i < 0) {
			throw new IllegalArgumentException("input can't be negative!");

		} else if (i > size) {
			throw new IllegalArgumentException("input can't be larger than the size!");

		}
		if (this.size == 0) {
			throw new IllegalArgumentException("The list is empty!");
		}

		// TODO:do bounds check (negative i? empty data? i>size?)->throw exception.
		return elements[i];
	}

	public void set(int i, T x) {

		if (i < 0) {
			throw new IllegalArgumentException("input can't be negative!");

		} else if (i >= size) {
			throw new IllegalArgumentException("input can't be larger than the size!");

		}
		if (this.size == 0) {
			throw new IllegalArgumentException("The list is empty!");
		}

		else {

			// TODO: check if i>= size? i<0?-->throw exception.
			// size exceeds the array capacity?-->resize the array. not allowed
			elements[i] = x;
		}
	}

	public void add(int i, T x) {
		// TODO: check if capacity allows addition and resize the array if
		// needed. Check
		// if i>=size-> throw exception
		if (i < 0) {
			throw new IllegalArgumentException("Invalid index: Negative index");
		} else if (i > size()) {
			throw new IllegalArgumentException("Invalid index: " + i);
		}

		else {
			if (i == elements.length) {
				int DoubleElements = elements.length * 2;
				elements = Arrays.copyOf(elements, DoubleElements);
			}
			shiftForwards(i);
			elements[i] = x;
			size++;
		}
	}

	public void add(T x) {
		// TODO: check if capacity allows addition and resize the array if
		// needed
		if (size() == elements.length) {
			int DoubleElements = elements.length * 2;
			elements = Arrays.copyOf(elements, DoubleElements);
		}
		elements[size] = x;
		size++;
	}

	private void shiftForwards(int startShiftingIndex) {
		for (int i = size; i > startShiftingIndex; i--) {
			elements[i] = elements[i - 1];
		}
	}

	public T remove(int i) {
		// TODO: do bounds check (i>size? data is empty?--? throw exception)

		if (i > size) {
			throw new IllegalArgumentException("input can't be larger than the size!");

		}
		if (this.size == 0) {
			throw new IllegalArgumentException("The list is empty!");
		}

		T x = elements[i];
		shiftBack(i);
		size--;
		return x;
	}

	private void shiftBack(int startShiftingIndex) {
		for (int i = startShiftingIndex; i < size - 1; i++) {
			elements[i] = elements[i + 1];
		}
	}

	public T[] copyArray(T[] elements1, T[] elements2) {

		elements2 = (T[]) new Object[elements1.length * 2];

		for (int j = 0; j > elements.length; j++) {
			elements1[j] = elements2[j];
		}

		return elements2;

	}

}
