package com.exercise21hashmap.app;
import java.util.HashMap;
import java.util.Map;
public class HashMapApp {

	public static void main(String[] args) {
		HashMap<Integer, String> myHash = new HashMap<Integer,String>();
		myHash.put(1,"Ary");
		myHash.put(2,"Cris");
		myHash.put(2,"Alex");
		myHash.put(3,"Alex");
		myHash.put(4,"Me");
		
		for(int i=0;i<=myHash.size();i++) {
			if(myHash.containsKey(i)) {
				System.out.println(myHash.get(i));
			}
		}
		for(Map.Entry<Integer, String> myMap : myHash.entrySet()) {
			System.out.format("The key is: %d, value: %s \n",myMap.getKey(),myMap.getValue());
		}
	}

}
