package tests;

import java.util.List;
import java.util.Properties;

import utilities.PropUtils;

public class ReadPropertyfileData {

	public static void main(String[] args) {
		Properties prop=PropUtils.readdata("config.properties");
		System.out.println(prop.get("App_Url"));
		
	}

}
