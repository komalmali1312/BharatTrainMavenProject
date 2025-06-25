package assignments;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Assignment9_Conditionalstmtloops {

	public static void main(String[] args) {
		String[] Names = { "Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green" };
		Double[] BaseSalary = { 75000.0, 68000.0, 82000.0, 90000.0, 60000.0 };
		Double[] Exp = { 5.1, 3.2, 7.1, 10.2, 2.4 };
		Double[] Rating = { 4.2, 3.8, 4.5, 2.5, 3.5 };
		Map<String, Double> Output = new LinkedHashMap<>();
		for (int i = 0; i < Names.length; i++) {
			int bonus = 0, reward = 0;
			double varpay = 0;
			if (Exp[i] > 5) {
				reward = 5000;
			}
			if (Rating[i] >= 4) {
				varpay = 15.0;
				bonus = 1500;

			} else if (Rating[i] >= 3 && Rating[i] < 4) {
				varpay = 10.0;
				bonus = 1200;

			} else if (Rating[i] < 3.0) {
				varpay = 3.0;
				bonus = 300;

			}
			double Hike = (BaseSalary[i] * varpay) + bonus + reward;
			double Hikeper = Hike / BaseSalary[i];
			Output.put(Names[i], Hikeper);
		}

	//System.out.println(Output);
	System.out.println(Output.entrySet());

	}
}