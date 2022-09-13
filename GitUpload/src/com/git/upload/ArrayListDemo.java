package com.git.upload;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> list=new ArrayList<String>();
list.add("Smita");
list.add("Saiee");
list.add("Somesh");
list.add("Shree");
Iterator itr=list.iterator();
for(String s:list)
{
	System.out.println(s);
}
	};

}
