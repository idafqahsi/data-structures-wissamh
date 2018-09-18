package edu.bu.datastructures.list;

import java.io.IOException;

public interface List<T> {
	public int size();

	public T get(int i);

	public void set(int i, T x);

	public void add(int i, T x);

	public void add(T x);

	public T remove(int i);
}
