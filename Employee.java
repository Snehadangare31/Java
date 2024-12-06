import java.util.Scanner;

class Employee
{
   String fname;
   String lname;
   double salary1;

Employee(String f,String l,double s)
{
  this.fname=f;
  this.lname=l;
  this.salary1=s;
}

void setfname(String f)
{
   fname=f;
}

void setlname(String l)
{
  lname=l;
}

void setsalary1(double s)
{
  salary1=s;
}

String getfname()
{
 return fname;
}

String getlname()
{
   return lname;

}

double getsalary1()
{
  return salary1;
}

double raise()
{
  salary1=salary1+(salary1+0.1);
return salary1;
}
}
class EmployeeTest
{
public static void main(String []args)
{
Scanner sc=new Scanner(System.in);
System.out.println("Enter first name:");
String name1=sc.nextLine();
System.out.println("Enter last name:");
String name2=sc.nextLine();
System.out.println("Enter salary:");
double salary1=sc.nextDouble();


Employee E=new Employee(name1,name2,salary1);
double s=E.getsalary1();
System.out.println("The salary is:"+s);
double S2=E.raise();
E.setsalary1(S2);
double y=E.getsalary1();
System.out.println("salary="+y);
}
}


  