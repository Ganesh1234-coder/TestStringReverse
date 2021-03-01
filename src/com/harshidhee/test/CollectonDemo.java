package com.harshidhee.test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectonDemo {

	public static void main(String[] args) {
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "A");
		map.put(2, "B");
		map.put(3, "C");
		map.put(4, "E");
		map.put(5, "F");
		
		List<Integer> collect = map.keySet().stream().collect(Collectors.toList());
		
		collect.forEach(System.out::println);
	}
}
