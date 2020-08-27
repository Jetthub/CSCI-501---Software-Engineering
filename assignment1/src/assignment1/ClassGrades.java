package assignment1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class ClassGrades {
	Map<String,String> classList = new HashMap<String, String>();
	public ClassGrades() {
		classList.put("Bob", "A");
		classList.put("Mary", "C");
		classList.put("Sarah", "B");
		classList.put("Philip", "A");
		classList.put("Greg", "F");
	}
	public void PrintClassList() {
		Iterator<Entry<String,String>> entries = classList.entrySet().iterator();
		while(entries.hasNext()) {
			Entry<String,String> entry = entries.next();
			System.out.println("key = " + entry.getKey() + " , value = " + entry.getValue());	
		}
	}
	
	public void PrintClassList2() {
		for(Map.Entry<String,String> entry : classList.entrySet()) {
			System.out.println("key = " + entry.getKey() + " , Value = " + entry.getValue());
		}
		
		for (String key : classList.keySet()) {
			System.out.println("key = " + key);
		}
		
		for(String value : classList.values()) {
			System.out.println("value = " + value);
		}
	}
	
	
	public static void main(String[] args) {
		System.out.println("I hear and I forget, I see and I remember, I do and I understand.");
		ClassGrades myClassList = new ClassGrades();
		myClassList.PrintClassList();
		myClassList.PrintClassList2();
	}
}
