package assignments;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Assignment19_DefaultInterface {
	// Pedistic
	public static void predicatemethod1(String s) {
		Predicate<String> pc3 = x -> x.startsWith("Koma");
		System.out.println(pc3.test(s));
	}

	public static boolean predicatemethod2(String s) {

		Predicate<String> pc3 = x -> x.contains("prachi");
		boolean status = pc3.test(s);
		return status;
	}

	// Function
	public static void Functiondefault1(String s) {
		Function<String, Boolean> Fc3 = x -> x.contains("mal");
		System.out.println(Fc3.apply(s));
	}

	// Supplier
	public static void Supplierdefault1(int n) {
		Supplier<Boolean> sp2 = () -> {
			if (n % 2 == 0)
				return true;
			else
				return false;
		};
		System.out.println(sp2.get());
	}

	// Consumer
	public void Consumerdefault1(int num) {
		Consumer<Integer> cs2 = number -> System.out.println(number + " is Sum Number");
		cs2.accept(num);
	}

	public static void main(String[] args) {
		// Pedistic
		Predicate<String> pc = x -> x.equals("test");
		System.out.println(pc.test("DemoTest"));

		Predicate<String> pc2 = x -> x.equalsIgnoreCase("komal");
		System.out.println(pc2.test("Komal"));

		predicatemethod1("KomalTest");
		System.out.println(predicatemethod2("KomalTest"));

		// Function Default Functional Interface
		Function<Integer, Integer> Fc = x -> x / 2 * 5;
		System.out.println(Fc.apply(10));
		Function<String, Integer> Fc2 = x -> x.indexOf('l');
		System.out.println(Fc2.apply("Komal"));
		Functiondefault1("Komal");

		// Supplier
		Supplier<String> sp = () -> {
			String s = "Komal" + "Mali";
			return s;
		};
		System.out.println(sp.get());
		Supplierdefault1(50);
		// Consumer
		Consumer<String> cs = myname -> System.out.println("Hello " + myname);
		cs.accept("Komal");
		Assignment19_DefaultInterface classobject = new Assignment19_DefaultInterface();
		classobject.Consumerdefault1(2);
	}

}
