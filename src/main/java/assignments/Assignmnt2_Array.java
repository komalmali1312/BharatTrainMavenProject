package assignments;

public class Assignmnt2_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. Create a 3D array to represent the following data:
//Sem1:		
String[] sem1sub= {"Mathematics I","Physics", "Chemistry", "Computer Programming", "Engineering Drawing", "Basic Electrical Eng."};
String[] sem1marks= {"Pass(78)","Pass(85)","Fail(21)","Pass(74)","Pass(88)","Pass(79)"};
String[][]sem1= {sem1sub,sem1marks};
//Sem2:		
String[] sem2sub= {"Mathematics II", "Mechanics", "Environmental Sci.","Basic Electronics", "Engineering Physics", "Engineering Graphics"};
String[] sem2marks= {"Pass(82)","Pass(77)","Pass(93)","Fail(19)","Fail(24)","Pass(90)"};
String[][]sem2= {sem2sub,sem2marks};
//Sem3:		
String[] sem3sub= {"Data Structures", "Discrete Mathematics","Digital Electronics","Operating Systems","Signals and Systems","Object-Oriented Prog."};
String[] sem3marks= {"Pass(88)","Pass(81)","Pass(76)","Fail(32)","Pass(85)","Pass(78)"};
String[][]sem3= {sem3sub,sem3marks};
//Sem4:		
String[] sem4sub= {"Algorithms","Computer Networks","Database Systems","Microprocessors", "Communication Eng.","Software Engineering",};
String[] sem4marks= {"Pass(91)","Pass(73)","Fail(19)","Pass(80)","Pass(76)","Pass(87)"};
String[][]sem4= {sem4sub,sem4marks};
//Sem5:		
String[] sem5sub= {"Probability & Stats","Machin Learning","Compiler Design","Theory of Computation","Embedded Systems","Computer Graphics"};
String[] sem5marks= {"Pass(86)","Pass(88)","Pass(84)","Pass(95)","Pass(73)","Pass(90)"};
String[][]sem5= {sem5sub,sem5marks};


        		
        String[][][]Academicdata= {sem1,sem2,sem3,sem4,sem5};   		

 //Print Semester 2 Subject 4 and Subject 5 names.
        System.out.println("Print Semester 2 Subject 4 name is:"+Academicdata[1][0][3]);
        System.out.println("Print Semester 2 Subject 5 name is:"+Academicdata[1][0][4]);
      
 //Print the Status/Marks of Semester 4 Subject 3 and Subject 6.       		
        System.out.println("Print the Status/Marks of Semester 4 Subject 3 is:"+Academicdata[3][1][2]);
        System.out.println("Print the Status/Marks of Semester 4 Subject 6 is:"+Academicdata[3][1][5]);
	}

}
