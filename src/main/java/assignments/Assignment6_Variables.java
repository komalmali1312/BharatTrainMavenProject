package assignments;

public class Assignment6_Variables {

public static void main(String[] args) {

//1. Create two arrays to store student names ["Suresh","Mahesh","Naresh"] and marks [75, 80, 82]		
String[] Names={"Suresh","Mahesh","Naresh"};
int[] Marks= {75, 80, 82};
int a=10;
//2.Add 10 marks to each students using assignment operators and store it into another array

Marks[0]+=a;
Marks[1]+=a;
Marks[2]+=a;

//3.identify the average marks of all students
float avg=(Marks[0]+Marks[1]+Marks[2])/3;

//Expected Output:
//Updated Marks:
//Suresh: 85
//Mahesh: 90
//Naresh: 92
//Average Marks: 89.0
System.out.println("Updated Marks:");
System.out.println(Names[0]+": "+Marks[0]);
System.out.println(Names[1]+": "+Marks[1]);
System.out.println(Names[2]+": "+Marks[2]);
System.out.println("Average Marks:"+avg);
	}

}
