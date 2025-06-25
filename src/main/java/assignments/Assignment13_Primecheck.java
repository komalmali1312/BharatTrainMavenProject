package assignments;

public class Assignment13_Primecheck {

	public static void main(String[] args) {
		int[] num = { 7, 25, 1 };
		for (int i = 0; i < num.length; i++) {
			if (primecheck(num[i])) {
				System.out.print("Number is Prime:" + num[i]);
				System.out.println("     Output:" + primecheck(num[i]));
			} else {
				System.out.print("Number is Not Prime:" + num[i]);
				System.out.println("     Output:" + primecheck(num[i]));
			}
		}
	}

	public static boolean primecheck(int n) {
		if (n < 2) {
			return false;
		}
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;

	}

}
