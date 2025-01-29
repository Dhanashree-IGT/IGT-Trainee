import java.util.Scanner;
class B
{

   int id, salary, age;
   String name, designation;
     B()
{

   Scanner sc = new Scanner(System.in);

   System.out.print("Enter your name:");
    name = sc.next();

   System.out.print("Enter ID:");
    id = sc.nextInt();

   System.out.print("Enter Salary:");
    salary = sc.nextInt();

   System.out.print("Enter age:");
    age = sc.nextInt();

   System.out.print("Enter your Designation:");
   designation = sc.next();
}


void display()
{
  System.out.println("****************************************");
  System.out.println(" My Name is:"+ name);
  System.out.println(" My ID :"+ id);
  System.out.println(" My salary :"+ salary);
  System.out.println(" My age :"+ age);
  System.out.println(" My Designation is:"+ designation);
}
}


class Sys1
{
   public static void main(String args[])
{
    B b= new B();
    b.display();

}   
 }    
    
     
    




