package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class DBUtil {

static Properties prop=new Properties();

public static ResultSet getData(String Query) throws SQLException
{
	try {
		FileInputStream fis=new FileInputStream(System.getProperty("user.dir")+"\\config\\"+"config.properties");
		try {
			prop.load(fis);
		} catch (IOException e) {
			
			e.printStackTrace();
		}
} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	}
	ResultSet dataset=null;
	String URL=prop.getProperty("DB_URL");
	String Username=prop.getProperty("DB_Username");
	String Password=prop.getProperty("DB_Password");
	Connection connection=DriverManager.getConnection(URL,Username,Password);
	dataset=connection.createStatement().executeQuery(Query);
	return dataset;
}
public static List<Map<String,String>> readdata(String Query) throws SQLException
{
List<Map<String,String>>datalist=new ArrayList<>();	
ResultSet dataset=getData(Query);
while(dataset.next())
{
	Map<String,String>rowdata=new HashMap<>();
	for(int c=1;c<dataset.getMetaData().getColumnCount();c++)
	{
	String ColumnName=dataset.getMetaData().getColumnName(c);
	String ColumnValue=dataset.getString(c);
	rowdata.put(ColumnName, ColumnValue);
	}
	datalist.add(rowdata);
}
return datalist;
}
}
