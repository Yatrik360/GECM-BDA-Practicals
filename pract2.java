import java.io.*;
import java.util.*;
class Employee
{
	String Name,Designation;
	public Employee()
	{
		Name=Designation= "NULL";
	}
	public Employee(String N,String Des)
	{
		Name = N;
		Designation = Des;
	}
}
public class pract2
{
	public static void main(String args[]) throws Exception
	{
		Employee s1 = new Employee("Yatrik","Software Engineer");
		Employee s2 = new Employee("Ronak","Project Manager");
		Employee s3 = new Employee("Bharat","Project Manager");
		Employee s4 = new Employee("Parth","Software Engineer");
		Employee s5 = new Employee("Dhruv","Architect");
		Employee s6 = new Employee("Sagar","Software Engineer");
		Employee s7 = new Employee("Nikhil","Software Engineer");
		Employee s8 = new Employee("Harshal","Architect");
		Employee s9 = new Employee("Mayur","Architect");
		Employee s10 = new Employee("Abhdish","Project Manager");
		Employee s11 = new Employee("Dharmik","Project Manager");
		
		Map<String,Employee> map = new HashMap<String,Employee>();
		map.put("Stud1",s1);
		map.put("Stud2",s2);
		map.put("Stud3",s3);
		map.put("Stud4",s4);
		map.put("Stud5",s5);
		map.put("Stud6",s6);
		map.put("Stud7",s7);
		map.put("Stud8",s8);
		map.put("Stud9",s9);
		map.put("Stud10",s10);
		map.put("Stud11",s11);
		
		Set set = map.entrySet();
		Iterator i = set.iterator();
		boolean bb = true;
		while(bb)
		{
		System.out.println("----------------------------------------------------------------------------------");
		System.out.println("Enter Your choice:\n1. Search for an employees designation.\n2. Search for all employees with a given designation.\n3. List all employees.");
		System.out.println("4. Add Employee.\n5. Remove Employee.\n6. Clear the dictionary.\n7. Exit");
		System.out.println("----------------------------------------------------------------------------------");
		
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ch = sc.nextInt();
		
		switch(ch)
		{
			case 1:set = map.entrySet();
				i = set.iterator();
				System.out.println("Enter Employee's name:");
				 String name = sc.next();
				while(i.hasNext())
					{
						Map.Entry m = (Map.Entry)i.next();
						Employee e = (Employee)m.getValue();
						if(name.equals(e.Name) )
						{
							System.out.println("Designation is:"+e.Designation);
						}
					}
				break;
				
			case 2:set = map.entrySet();
				i = set.iterator();
				System.out.println("Enter Designation:");
			 	String des = br.readLine();
			 	System.out.println("Employees are:");
			 	while(i.hasNext())
				{
					Map.Entry m = (Map.Entry)i.next();
					Employee e = (Employee)m.getValue();
					if(des.equals(e.Designation))
					{
						System.out.println(e.Name);
					}
				}
			 	break;
			
			case 3:System.out.println("List of Employee:");
				set = map.entrySet();
				i = set.iterator();
				while(i.hasNext())
				{
					Map.Entry m = (Map.Entry)i.next();
					Employee e = (Employee)m.getValue();
					System.out.println(e.Name);
				}
				break;
				
			case 4:System.out.println("Enter Employee's Name:");
				String n = br.readLine();
				System.out.println("Enter Employee's Designation:");
				String d = br.readLine();
				int q = 12;
				Employee s = new Employee(n,d);
				map.put("Stud"+q, s);
				q++;
				set = map.entrySet();
				i = set.iterator();
				System.out.println("Employee added successfully.");
				break;
			
			case 5:System.out.println("Enter Employee's Name:");
				String na = br.readLine();
				while(i.hasNext())
				{
					Map.Entry m = (Map.Entry)i.next();
					Employee e = (Employee)m.getValue();
					if(na.equals(e.Name))
					{
						String str = m.getKey().toString();
						System.out.println(str);
						map.remove(str);
						set = map.entrySet();
						i = set.iterator();
					}
				}
				System.out.println("Remove Employee Successfully.");
				break;
				
			case 6: map.clear();
				set = map.entrySet();
				i = set.iterator();
				System.out.println("Clear dictionary successfully.");
				break;
				
			case 7: bb=false;
				break;
					
			default: System.out.println("Enter right choice.");
				break;
		}
		}
	}
}