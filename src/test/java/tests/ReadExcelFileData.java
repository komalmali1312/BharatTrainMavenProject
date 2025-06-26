package tests;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import utilities.ExcelUtils;

public class ReadExcelFileData {

	public static void main(String[] args) {
		//Print/Display 1st Sheet Data
		List<Map<String, String>> data = ExcelUtils.ReadExcelDatausingCollection("TestDataFile1.xlsx",
				"StudentDetails");
		System.out.println(data);
		
		//Print/Display 2nd Sheet Data
		List<Map<String, String>> data1 = ExcelUtils.ReadExcelDatausingCollection("TestDataFile1.xlsx",
				"EmployeeDetails");
		System.out.println(data1);
		
		//Print/Display 3rd Sheet Data
		List<Map<String, String>> data2 = ExcelUtils.ReadExcelDatausingCollection("TestDataFile1.xlsx",
				"ProductDetails");
		System.out.println(data2);
		
		//Print/Display 1st Sheet Data using 2D Array
		String [][]TestData=ExcelUtils.ReadExcelDatausing2DArray("TestDataFile1.xlsx",
				"ProductDetails");
		System.out.println(TestData);//Ljava.lang.String;@78383390
		
	}

}
