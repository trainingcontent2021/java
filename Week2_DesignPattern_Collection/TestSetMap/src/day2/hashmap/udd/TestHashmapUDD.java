package day2.hashmap.udd;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TestHashmapUDD {
	public static void main(String[] args) {
		Map<Integer, Employee>  hashMap = new HashMap<Integer, Employee>();
		
		Employee e1= new Employee(101, "Alex");
		Employee e2= new Employee(101, "Alex");
		Employee e3= new Employee(103, "Wrox");
		Employee e4= new Employee(104, "Ginni");
		
		// System.out.println(e1.equals(e2));
		
		hashMap.put(e1.getEmpNo(),e1);
		hashMap.put(e2.getEmpNo(),e2);
		hashMap.put(e3.getEmpNo(),e3);
		hashMap.put(e4.getEmpNo(),e4);
			
		
		Set<Map.Entry<Integer,Employee>> entries = hashMap.entrySet();
		
		for(Map.Entry<Integer,Employee>  emp : entries )
		{
			System.out.println(emp.getKey());
			Employee employee= emp.getValue();
			System.out.println(employee);
		}
		
		
		//Using Iterator
		Iterator< Integer> it = hashMap.keySet().iterator();
		while(it.hasNext())
		{
			Employee emp= hashMap.get(it.next());
			System.out.println(emp);
		}
}

}
