package assignments;

public class Assignment12_Methods {
	
	public static void main(String[] args) {
		int[] prices = {7,6,4,3,1};
		Assignment12_Methods obj = new Assignment12_Methods();
		System.out.println(obj.profitcal(prices));

	}

	public int profitcal(int arr[]) {
		int maxprofit = 0;
		int profitvalue = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] < arr[j]) {
					profitvalue = arr[j] - arr[i];
					if (maxprofit < profitvalue)
						maxprofit = profitvalue;
				} else {
					profitvalue = 0;
				}
			}
		}
		return maxprofit;

	}

}
