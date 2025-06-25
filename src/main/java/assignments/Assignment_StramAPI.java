package assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Assignment_StramAPI {
	static List<String>mylist=List.of("DemoTest");
	static List<Integer>Numberinput=List.of(2,3,8,9,4,5,12,80);
	List<Integer>Numberoutput=new ArrayList<Integer>();
//Stratswith	
	public static void startswith(List<String>mylist) {
		boolean hasmatch3=mylist.stream().anyMatch(x->x.startsWith("T"));
		System.out.println(hasmatch3);
	}
//Contains
	public static boolean Containsmethod2(List<String>mylist) {
		boolean status = mylist.stream().anyMatch(x->x.contains("Komal"));
		return status;
	}
	public static void main(String[] args) {
		List<String>mylist=List.of("DemoTest");
//Equals		
		boolean hasmatch=mylist.stream().allMatch(x->x.equals("demotest"));
		System.out.println(hasmatch);
//EqualsIgnorecase
		boolean hasmatch1=mylist.stream().anyMatch(x->x.equalsIgnoreCase("demotest"));
		System.out.println(hasmatch1);
//Stratswith method calling
		startswith(mylist);
//Contains method calling
		System.out.println(Containsmethod2(mylist));
//Division and Multiplication Maths Operation
		List<Integer>Numberoutput=Numberinput.stream().map(x->x/1*5).collect(Collectors.toList());
		System.out.println(Numberoutput);
//indexOf character in String
		List<Integer>indexes=mylist.stream().map(x->x.indexOf('T')).collect(Collectors.toList());
		System.out.println(indexes.get(0));
//Odd Number from List	
		List<Integer>Numberoutput2=Numberinput.stream().filter(x->x%2!=0).collect(Collectors.toList());
		System.out.println(Numberoutput2);
//Concatination
		List<String>mylist1=List.of("DemoTest","Testing","Application");
		List<String> concatenated = mylist1.stream().map(s -> s + " Java").collect(Collectors.toList());   
		System.out.println(concatenated);
	}

}
