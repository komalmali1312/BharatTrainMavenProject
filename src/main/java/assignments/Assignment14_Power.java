package assignments;

public class Assignment14_Power {
//Calculate Power of Number
//PowerCalculate it is one method to calculate power of number	
	public double PowerCalculate(double num, int power) {
		double poweroutput = 1;
//If else loop because power is positive and negative.		
		if (power > 0) {
			// loop to calculate power of number till power count.
			for (int i = 0; i < power; i++) {
				// 2^5=2*2*2*2*2 so same number multiplies with previous output.
				poweroutput *= num;
			}
		} else {
			//-power :(-2)*(-)=2 loop will execute 2 times.
			for (int i = 0; i < -power; i++) {
				poweroutput *= num;
			}
			//Divide because 2^(-2)=1/2^2
			poweroutput = 1 / poweroutput;
		}
//method created with double return type so return statement needed.
		return poweroutput;
	}

	public static void main(String[] args) {
		Assignment14_Power obj = new Assignment14_Power();
		System.out.println("Output of 2^10 is: " + obj.PowerCalculate(2, 10));
		System.out.println("Output of (2.10000)^3 is: " + obj.PowerCalculate(2.1, 3));
		System.out.println("Output of (2.00000)^(-2) is: " + obj.PowerCalculate(2.00000, -2));

	}

}
