package stream;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class StringFrequencyCount {
	
	public static Map<String,Integer> sortedByKey(Map<String,Integer> hm) {
		
		List<Map.Entry<String, Integer>> l1=new LinkedList<Map.Entry<String,Integer>>(hm.entrySet());
		
		Collections.sort(l1,(p1,p2)->p1.getKey().compareTo(p2.getKey()));
		Collections.sort(l1,(p1,p2)->p1.getValue().compareTo(p2.getValue()));
//	Collections.sort(l1,(p1,p2)->p1.getKey().compareToIgnoreCase(p2.getKey()));
		
		HashMap<String,Integer> templhm=new LinkedHashMap<String,Integer>();
		
		for(Map.Entry<String,Integer> e:l1) {
			templhm.put(e.getKey(), e.getValue());
		}
		
		return templhm;
	}
	
	public static void main(String[] args) {
		
		ArrayList<String> l=new ArrayList<>(List.of("cat","dog","fox","cat","cat","dog","hen","cat","ox","ox"));
	
		Map<String,Integer> map=new HashMap<String,Integer>();
		map.put("Sourabh",50);
		map.put("Suman",80);
		map.put("Soma",90);
		map.put("Sachin",100);
		map.put("Sebhag",50);
		map.put("Silpa",30);
		
		Map<String,Integer> m=new HashMap<>();
		
		for(String s:l) {
			if(m.containsKey(s)) {
				m.put(s,m.get(s)+1);
			}
			else {
				m.put(s,1);
			}
		}
	//	System.out.println(m);
	//	Map<String,Integer> m2=sortedByKey(m);
	//	System.out.println(m2);
		System.out.println(map);
		Map<String,Integer> m3=sortedByKey(map);
		System.out.println(m3);
	}

}
