package Zadanie1;

import java.util.Scanner;

public class MyList {
	static final int DEFAULT_VOLUME = 50;
	Object[] array;
	int number;
	int volume;

	public MyList() {
		this(DEFAULT_VOLUME);
	}

	public MyList(int volume) {
		this.volume = volume;
		array = new Object[volume];
		number = 0;
	}

	public int firstIndexOf() {
		String text = "c";
		int l = -1;
		try {
			for (int i = 0; i < number; i++) {
				l++;
				if (array[i].equals(text)) {
					break;
				}
			}
		} catch (NullPointerException e) {
			System.out.println("list is empty");
		}
		return l;

	}

	public void add(Object a) {
		array[number] = a;
		number++;

	}

	public Object get(int index) {
		if (index < 0 || index >= number) {
			return "index out of bounds";
		}
		return array[index];
	}

	public void removeAllElement() {
		for (int i = number - 1; i >= 0; i--) {
			array[i] = null;
		}
	}

	public void removeLastElement() {

		try {
			number--;
			array[number] = null;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(" list is empty");
		}
	}

	public boolean isEmpty() {
		for (int i = 0; i < number; i++) {
			if (array[i] == null) {
			} else {
				return false;
			}
		}
		return true;

	}

	public void set() { 
		int count = 3; // przykladowo
		if (number > count) {
			array[count] = "g";
		}

	}

}