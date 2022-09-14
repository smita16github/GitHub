package com.git.upload;


import java.util.Arrays;
import java.util.List;


public class ArrayDemo {

	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(2,3,4,5,6,7);
list.stream().filter(n->(n%2==0)).forEach(s->System.out.println(s));;

	}

}
