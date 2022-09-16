package com.git.upload;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;

public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashMap<String,String> map=new LinkedHashMap<String,String>();
map.put("10", "Shweta");
map.put("11", "Somesh");
map.put("12", "Sai");
Set<String> set=map.keySet();
for(String s:set)
{
System.out.println(s);	
System.out.println(map.get(s));
}
	}

}
