package javabasic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public  class list {

	public static void main(String[] args) {
		//method1.add(15, 047);
		//function.add();
		//function.sub();
		// TODO Auto-generated method stub
		//Creating list
		
		List<String>list= new ArrayList<String>();
		list.add("dimple");
		list.add("java");
		list.add("selenium");
		list.add("12");
		list.add("java");
		list.add("selenium");
		list.add("apple");
		list.add("java");
		list.add("selenium");
		list.add("apple");
		list.add("java");
		for(String names:list) {
			System.out.println(names);}
	
		Set<String>hash_Set=new HashSet<String>();
		hash_Set.add("dimple");
		hash_Set.add("selenium");
		hash_Set.add("java");
		hash_Set.add("QA");
		hash_Set.add("dimple");
		hash_Set.add("selenium");
		hash_Set.add("java");
		hash_Set.add("QA");
		hash_Set.add("dimple");
		hash_Set.add("selenium");
		hash_Set.add("java");
		hash_Set.add("QA");
		hash_Set.add("dimple");
		hash_Set.add("selenium");
		hash_Set.add("java");
		hash_Set.add("QA");
		hash_Set.add("testng");
System.out.println(hash_Set);
		
		List<Integer> list1=new ArrayList<>();  
		 //Adding elements in the List  
		 list1.add(12);  
		 list1.add(14);  
		 list1.add(16);  
		list1.add(89);
		list1.add(13);
		list1.add(12);  
		 list1.add(14);  
		 list1.add(16);  
		list1.add(89);
		list1.add(13);
		//Iterating the List element using for-each loop  
		 for(int fruit:list1)  
		  System.out.println(fruit);  
		  } 

	}



