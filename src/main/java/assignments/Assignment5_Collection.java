package assignments;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Assignment5_Collection {

public static void main(String[] args) {
//StudentDetails
	Map<String, Map<String, String>> studentDetails = new HashMap<>();
//JohnDoeDetails	
	Map<String,String>JohnDoeDetails=new HashMap<>();
	JohnDoeDetails.put("Age","Twenty");
	JohnDoeDetails.put("Gender","Male");
	JohnDoeDetails.put("Roll Number","SBA12345");
	JohnDoeDetails.put("Grade","A++");
	JohnDoeDetails.put("Major","Computer Science");
	JohnDoeDetails.put("GPA","A3.8");
	JohnDoeDetails.put("Email","john@example.com");
	JohnDoeDetails.put("PAN Number","SDF6543210");
	JohnDoeDetails.put("Address","123 Elm St");
	JohnDoeDetails.put("name","John Doe");
	studentDetails.put("John Doe",JohnDoeDetails);
	//System.out.println(studentDetails.get("John Doe").get("PAN Number"));
//JaneSmithDetails	
	Map<String,String>JaneSmithDetails=new HashMap<>();
	JaneSmithDetails.put("Age","Twenty One");
	JaneSmithDetails.put("Gender","Female");
	JaneSmithDetails.put("Roll Number","SBA12346");
	JaneSmithDetails.put("Grade","B+");
	JaneSmithDetails.put("Major","Mathematics");
	JaneSmithDetails.put("GPA","A3.5");
	JaneSmithDetails.put("Email","jane@example.com");
	JaneSmithDetails.put("PAN Number","REW6543211");
	JaneSmithDetails.put("Address","456 Oak St");
	JaneSmithDetails.put("name","Jane Smith");
	studentDetails.put("Jane Smith",JaneSmithDetails);
	//System.out.println(studentDetails.get("Jane Smith").get("Roll Number"));
//MikeBrownDetails	
	Map<String,String>MikeBrownDetails=new HashMap<>();
	MikeBrownDetails.put("Age","Twenty Two");
	MikeBrownDetails.put("Gender","Male");
	MikeBrownDetails.put("Roll Number","SBA12347");
	MikeBrownDetails.put("Grade","A+");
	MikeBrownDetails.put("Major","Physics");
	MikeBrownDetails.put("GPA","A3.9");
	MikeBrownDetails.put("Email","mike@example.com");
	MikeBrownDetails.put("PAN Number","TYR6543212");
	MikeBrownDetails.put("Address","789 Pine St");
	MikeBrownDetails.put("name","Mike Brown");
	studentDetails.put("Mike Brown",MikeBrownDetails);
	//System.out.println(studentDetails.get("Mike Brown").get("GPA"));
	
//EmployeeDetails
			Map<String, Map<String, String>> EmployeeDetails = new HashMap<>();
	//AliceGreenDetails	
			Map<String,String>AliceGreenDetails=new HashMap<>();
			AliceGreenDetails.put("name","Alice Green");
			AliceGreenDetails.put("Age","Thirty");
			AliceGreenDetails.put("Gender","Female");
			AliceGreenDetails.put("Department","Engineering");
			AliceGreenDetails.put("Position","Software Engineer");
			AliceGreenDetails.put("Salary","75K Pounds");
			AliceGreenDetails.put("Email","alice@example.com");
			AliceGreenDetails.put("PAN Number","SDF6543210");
			AliceGreenDetails.put("Employee ID","E001");
			EmployeeDetails.put("E001",AliceGreenDetails);
			//System.out.println(EmployeeDetails.get("E001").get("PAN Number"));
	//BobJohnsonDetails	
			Map<String,String>BobJohnsonDetails=new HashMap<>();
			BobJohnsonDetails.put("name","Bob Johnson");
			BobJohnsonDetails.put("Age","Thirty Five");
			BobJohnsonDetails.put("Gender","Male");
			BobJohnsonDetails.put("Department","Marketing");
			BobJohnsonDetails.put("Position","Marketing Manager");
			BobJohnsonDetails.put("Salary","85K Pounds");
			BobJohnsonDetails.put("Email","bob@example.com");
			BobJohnsonDetails.put("PAN Number","REW6543211");
			BobJohnsonDetails.put("Employee ID","E001");
			EmployeeDetails.put("E002",BobJohnsonDetails);
			//System.out.println(EmployeeDetails.get("E002").get("Email"));
	//CarolWhiteDetails	
			Map<String,String>CarolWhiteDetails=new HashMap<>();
			CarolWhiteDetails.put("name","Carol White");
			CarolWhiteDetails.put("Age","Thirty Eight");
			CarolWhiteDetails.put("Gender","Female");
			CarolWhiteDetails.put("Department","Sales");
			CarolWhiteDetails.put("Position","Sales Executive");
			CarolWhiteDetails.put("Salary","65K Pounds");
			CarolWhiteDetails.put("Email","carol@example.com");
			CarolWhiteDetails.put("PAN Number","TYR6543212");
			CarolWhiteDetails.put("Employee ID","E003");
			EmployeeDetails.put("E003",CarolWhiteDetails);
			//System.out.println(EmployeeDetails.get("E003").get("Department"));
			
//ProductDetails
			Map<String, Map<String, String>> ProductDetails = new HashMap<>();
	//LaptopDetails	
			Map<String,String>LaptopDetails=new HashMap<>();
			LaptopDetails.put("name","Laptop");
			LaptopDetails.put("Category","Electronics");
			LaptopDetails.put("Price","12K Pounds");
			LaptopDetails.put("Stock Quantity","Not Available");
			LaptopDetails.put("Supplier","Tech Suppliers");
			LaptopDetails.put("Warrenty","2 Years");
			LaptopDetails.put("Rating","4.5Stars");
			LaptopDetails.put("Manufacturing Date","Aug 2023");
			LaptopDetails.put("Expiry Date","Aug 2028");
			LaptopDetails.put("Product ID","P001");
			ProductDetails.put("P001",LaptopDetails);
			//System.out.println(ProductDetails.get("P001").get("Rating"));
	//DeskChairDetails	
			Map<String,String>DeskChairDetails=new HashMap<>();
			DeskChairDetails.put("name","Desk Chair");
			DeskChairDetails.put("Category","Furniture");
			DeskChairDetails.put("Price","150 Pounds");
			DeskChairDetails.put("Stock Quantity","Two");
			DeskChairDetails.put("Supplier","Office Depot");
			DeskChairDetails.put("Warrenty","1 Year");
			DeskChairDetails.put("Rating","4 Stars");
			DeskChairDetails.put("Manufacturing Date","Sept 2024");
			DeskChairDetails.put("Expiry Date","N/A");
			DeskChairDetails.put("Product ID","P002");
			ProductDetails.put("P002",DeskChairDetails);
			//System.out.println(ProductDetails.get("P002").get("Supplier"));
	//CoffeeMakerDetails	
			Map<String,String>CoffeeMakerDetails=new HashMap<>();
			CoffeeMakerDetails.put("name","Coffee Maker");
			CoffeeMakerDetails.put("Category","Kitchen");
			CoffeeMakerDetails.put("Price","75K Pounds");
			CoffeeMakerDetails.put("Stock Quantity","Two Hundread");
			CoffeeMakerDetails.put("Supplier","KitchenWorld");
			CoffeeMakerDetails.put("Warrenty","6 months");
			CoffeeMakerDetails.put("Rating","4.2 Stars");
			CoffeeMakerDetails.put("Manufacturing Date","Jan 2025");
			CoffeeMakerDetails.put("Expiry Date","Jan 2027");
			CoffeeMakerDetails.put("Product ID","P003");
			ProductDetails.put("P003",CoffeeMakerDetails);
			//System.out.println(ProductDetails.get("P003").get("Expiry Date"));	
			
			List<Map<String,String>> finaldata=new ArrayList();
			finaldata.add(CoffeeMakerDetails);
			finaldata.add(DeskChairDetails);
			finaldata.add(LaptopDetails);
			
			finaldata.add(JaneSmithDetails);
			finaldata.add(JohnDoeDetails);
			finaldata.add(MikeBrownDetails);
			
			finaldata.add(AliceGreenDetails);
			finaldata.add(BobJohnsonDetails);
			finaldata.add(CarolWhiteDetails);
			
			System.out.println(finaldata.get(1).get("Supplier"));
}

}
