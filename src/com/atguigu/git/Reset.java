package com.atguigu.git;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sun.jndi.url.iiopname.iiopnameURLContextFactory;

public class Reset {
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		list.add("1");
		list.add("2");
		System.err.println(list.size());

		Set set = new HashSet<>();
		set.add(list);

		System.err.println(set);
		int i=1<<30;
		System.err.println();
		
	}

}
