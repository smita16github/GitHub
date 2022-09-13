package com.git.upload;

import java.util.HashSet;
import java.util.Iterator;

public class SetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet<Integer> set=new HashSet<>();
set.add(101);
set.add(105);
set.add(109);
set.add(107);
Iterator itr=set.iterator();
while(itr.hasNext())
{
	System.out.println(itr.next());
}
	}

}
