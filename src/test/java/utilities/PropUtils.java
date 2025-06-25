package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropUtils {
public static Properties readdata(String Filename)
{
	Properties prop=new Properties();
	try {
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\config\\"+Filename);
		try {
			prop.load(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	return prop;
}
}
