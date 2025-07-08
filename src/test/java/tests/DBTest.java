package tests;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import utilities.DBUtil;

public class DBTest {

	public static void main(String[] args) throws SQLException {
	List<Map<String,String>>data=DBUtil.readdata(Queries.Tablevalues);
	System.out.println(data);
	System.out.println(data.get(1).get("emp_name"));
	}

}
