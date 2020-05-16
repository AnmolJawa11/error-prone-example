package edu.gradstudy.softTesting;

import java.util.HashSet;
import java.util.Set;

public class App {
	public static void main(String[] args) {
		Set<Short> s = new HashSet<>();
		for (short i = 0; i < 100; i++) {
			s.add(i);
			s.remove(i - 1);
		}
		System.out.println(s.size());
		System.out.println(App.doSomething(1));

	}

	private static int doSomething(int i) {
		return i++;
	}
}
