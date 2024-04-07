package javabasic;
import java.util.HashMap;
import java.util.Map;
public class hashmap {
  public static void main(String[] args) {
	        // Creating a HashMap
	        Map<String, Integer> hashMap = new HashMap<>();
	        Map<String, Integer> hashMap1 = new HashMap<>();
	        // Adding key-value pairs to the HashMap
	        hashMap.put("emp1", 10);
	        hashMap.put("emp2", 20);
	        hashMap.put("emp3", 17);
	        hashMap.put("emp4", 14);
	        hashMap.put("emp5",15);
int a= hashMap.size();
	        // Accessing values using keys
	        System.out.println("Value for key 'emp1': " + hashMap.get("emp1"));
	        System.out.println("Value for key 'emp4': " + hashMap.get("emp4"));

	        // Updating the value for an existing key
	        hashMap.put("emp2", 25);
	        System.out.println("Updated value for key 'emp2': " + hashMap.get("emp2"));

	        // Removing a key-value pair
	        hashMap.remove("emp3");
	        System.out.println("Value for key 'emp3' (after removal): " + hashMap.get("emp3"));

	        // Iterating over the HashMap
	        System.out.println("\nIterating over the HashMap:");
	        for (Map.Entry<String, Integer> entry : hashMap.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }

	        // Checking if the HashMap contains a key
	        System.out.println("\nContains key 'emp2'? " + hashMap.containsKey("emp2 "));

	        // Checking if the HashMap contains a value
	        System.out.println("Contains value '14'? " + hashMap.containsValue(14));

	        // Getting the size of the HashMap
	        System.out.println("Size of the HashMap: " + hashMap.size());
System.out.println(a);
	        // Clearing the HashMap
	        hashMap.clear();
	        System.out.println("Size of the HashMap (after clearing): " + hashMap.size());
	    }
	}


