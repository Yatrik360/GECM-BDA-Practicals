import java.io.*;
import java.util.*;
class Student
{
	String Name,Department;
	int Age,id,Year;
	public Student()
	{
		Name=Department= "NULL";
		Age=id=Year=0;
	}
	public Student(String N,int A,int I,int Y,String Dept)
	{
		Name = N;
		Age = A;
		id = I;
		Year = Y;
		Department = Dept;
	}
	public void display()
	{
		System.out.print("\n Name="+Name+"\n Age="+Age+"\n Id="+id+"\n Year="+Year+"\n Department="+Department);
		System.out.println("\n");
	}
}
public class pract1
{
	public static void main(String args[]) throws Exception
	{
		Student s1 = new Student("Yatrik",21,015,2016,"IT");
		Student s2 = new Student("Ronak",21,025,2016,"CE");
		
		Map<String,Student> map = new HashMap<String,Student>();
		map.put("Stud1",s1);
		map.put("Stud2",s2);
		
		Set set = map.entrySet();
		Iterator i = set.iterator();
		while(i.hasNext())
		{
			Map.Entry m = (Map.Entry)i.next();
			System.out.println("key is:"+m.getKey()+" & Value is: ");
			Student s = (Student)m.getValue();
			s.display();
		}
	}
}