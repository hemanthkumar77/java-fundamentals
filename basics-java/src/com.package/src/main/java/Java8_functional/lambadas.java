package Java8_functional;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Scanner;
import java.util.Set;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class lambadas {
static class student
{
private int stu_id,dept_id;
private String stu_name,dept_name;
private double gpa;
@Override
public String toString() {
	return "student [stu_id=" + stu_id + ", dept_id=" + dept_id + ", stu_name=" + stu_name + ", dept_name=" + dept_name
			+ ", gpa=" + gpa + "]";
}
public student(int stu_id, int dept_id, String stu_name, String dept_name, double gpa) {
	super();
	this.stu_id = stu_id;
	this.dept_id = dept_id;
	this.stu_name = stu_name;
	this.dept_name = dept_name;
	this.gpa = gpa;
}
public int getStu_id() {
	return stu_id;
}
public int getDept_id() {
	return dept_id;
}
public String getStu_name() {
	return stu_name;
}
public String getDept_name() {
	return dept_name;
}
public double getGpa() {
	return gpa;
}

}
ArrayList<student>object=new ArrayList<student>();

public lambadas()
{
 	object.add(new student(101,100,"joker","CSC",3.7));
 	object.add(new student(102,100,"jigsaw","CSC",3.6));
 	object.add(new student(201,200,"batman","ECE",3.4));
 	object.add(new student(202,200,"robin","ECE",3.6));
 	object.add(new student(301,300,"wonderman","MEC",3.9));
 	object.add(new student(302,300,"flash","MEC",3.54));
 	object.add(new student(401,400,"ironman","robotics",3.99));
 	object.add(new student(402,400,"warbot","robotics",3.66));
 	//lambdas();
 	Streams_API();
}

private void Streams_API() 
{
// by using the filter api(predicate interface) we are getting the students whose gpa is greater then 3.66	
List<student>ins=object.stream().filter(student->student.getGpa()>3.66).collect(Collectors.toList());
ins.forEach(System.out::println);

// sort stream api we can able to sort the values
List<student>in=object.stream().sorted(Comparator.comparing(student::getGpa)).collect(Collectors.toList());
in.forEach(System.out::println);

// reverse steam api 
List<student>oper=object.stream().sorted(Comparator.comparing(student::getGpa).reversed()).collect(Collectors.toList());
oper.forEach(System.out::println);

// show the list of department alone without duplicate value
Set<String>de=object.stream().map(student->student.getDept_name()).collect(Collectors.toSet());
de.forEach(System.out::println);
 
// min gpa of ECE  
Optional<student>details=object.stream().filter(student->student.getDept_name().equals("ECE"))
.min(Comparator.comparing(student::getGpa));
System.out.println(details);

// groupingby department and displaying it 
Map<String, List<student>>map=object.stream().collect(Collectors.groupingBy(student::getDept_name));
map.forEach((department,stu)->{
	System.out.println("department: "+department);
	stu.forEach(System.out::println);
}
);
// listing the names of the student less than 3.5
Stream<String>det=object.stream().filter(student->student.getGpa()<3.7).map(student::getStu_name);
det.forEach(System.out::println);

List<student>jig=object.stream().filter(student->student.getDept_name().equals("CSC"))
.sorted(Comparator.comparing(student::getGpa)).collect(Collectors.toList());
jig.forEach(System.out::println);

}

private void lambdas() 
{
	Scanner num_inp=new Scanner(System.in);
	Scanner alp_inp=new Scanner(System.in);
	Scanner dou_inp=new Scanner(System.in);

	System.out.print("enter the id of the student: ");
    int id=num_inp.nextInt();
    System.out.print("enter the id of the department: ");
    int dep_id=num_inp.nextInt();
    System.out.print("enter the name of the student: ");
    String name=alp_inp.nextLine();
    System.out.print("enter the name of the department: ");
    String dept_name=alp_inp.nextLine();
    System.out.print("enter the gpa of the student: ");
    double gpa=dou_inp.nextDouble();
    student instance=new student(id,dep_id,name,dept_name,gpa);

    // it only takes one input that means only one arugument and gives the return value in the bollean
    Predicate<student>obj=(mark)->{
    if(mark.getGpa()>3.7)
    {
    	return true;
    }
    else
    {
    	return false;
    }
};	
   if(obj.test(instance))
   {
	   System.out.println("A");
   }
   else
   {
	   System.out.println("Not applicable for scholarship");
   }
   
  // funtion it takes the one argument input and then other arugument which return type
   Function<Double,String>ob=(val)->{
	   if(val>3.7)
	   {
		   return "scholarship";
	   }
	   else
	   {
		   return "Not applicable for scholarship";
	   }
   };
   System.out.println(ob.apply(instance.getGpa()));
   
   // Consumer it takes only the input what you gives
   Consumer<String>ins=(identity)->{
	   char[]r=identity.toCharArray();
	   for(int i=r.length-1;i>=0;i--)
	   {
		  System.out.print(r[i]);
	   }
	   System.out.print("\n");
   };
   ins.accept(instance.getStu_name());
   
   // Supplier it gives only the output to the users
   Supplier<String>delta=()->{
    String per=instance.getStu_name();
    return per;
   };
   System.out.print(delta.get());
}
 
public static void main(String args[])
{
	new lambadas();
}
}
