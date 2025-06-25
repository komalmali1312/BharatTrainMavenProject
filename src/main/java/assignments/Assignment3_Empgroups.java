package assignments;

public class Assignment3_Empgroups {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] EmpnameArr = new String[3];
		int[] EmIDArr=new int[3];
		Assignment3_ClassandObjects Emp=new Assignment3_ClassandObjects();
		EmpnameArr[0]=Emp.Emp1;
		EmpnameArr[1]=Emp.Emp2;
		EmpnameArr[2]=Emp.Emp3;
		EmIDArr[0]=Emp.EmpID1;
		EmIDArr[1]=Emp.EmpID2;
		EmIDArr[2]=Emp.EmpID3;
		
		System.out.println("Employee 1 Details:"+EmpnameArr[0]+","+EmIDArr[0]);
		System.out.println("Employee 2 Details:"+EmpnameArr[1]+","+EmIDArr[1]);
		System.out.println("Employee 3 Details:"+EmpnameArr[2]+","+EmIDArr[2]);
	}

}
