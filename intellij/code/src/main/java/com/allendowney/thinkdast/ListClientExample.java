package com.allendowney.thinkdast;

import java.util.ArrayList;
import java.util.List;

public class ListClientExample {
	private List<Integer> list;

	public ListClientExample() {
		list = new ArrayList<>();
	}

	public List<Integer> getList() {
		return list;
	}

	public static void main(String[] args) {
		ListClientExample lce = new ListClientExample();
		List<Integer> list = lce.getList();
		System.out.println(list);
	}
}
