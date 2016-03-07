package com.study;


import java.util.List;

import org.apache.commons.lang.StringUtils;

import com.google.common.collect.Lists;

public class MainTest {

	public static void main(String[] args) {
		System.out.println(StringUtils.equals("A", "B"));
		List<String> list=Lists.newArrayList();
		list.add("123");
		System.out.println(list);
		
	}
}
