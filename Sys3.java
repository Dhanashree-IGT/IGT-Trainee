import java.util.Scanner;
class Developer
{

   double id;
   int age;
   String name;
String designation= "Trainee";
int salary =90000;

     Developer()
{

   Scanner s1 = new Scanner(System.in);

   System.out.print("Enter your Name:");
    name =s1.nextLine();

   System.out.print("Enter ID:");
   id =s1.nextInt();

   s1.nextLine();

   System.out.print("Enter Age:");
    age =s1.nextInt();

   s1.nextLine();


  System.out.println(" My Name is:"+ name);
  System.out.println(" My ID :"+ id);
  System.out.println(" My salary :"+ salary);
  System.out.println(" My Age :"+ age);
  System.out.println(" My Designation is:"+ designation);
}
}

class Tester
{

double id;
short age;
   String name;
String designation= "Trainee";
int salary =50000;

     Tester()
{

   Scanner s1 = new Scanner(System.in);
System.out.println("======================================");

   System.out.print("Enter your name:");
    name =s1.nextLine();

   System.out.print("Enter ID:");
    id =s1.nextInt();

   s1.nextLine();

   System.out.print("Enter age:");
    age =s1.nextInt();

   s1.nextLine();
}
void show()
{
  System.out.println(" My Name is:"+ name);
  System.out.println(" My ID :"+ id);
  System.out.println(" My salary :"+ salary);
  System.out.println(" My age :"+ age);
  System.out.println(" My Designation is:"+ designation);
}
}

class Clerk
{

     long id;
    int age;
   String name;
String designation= "Trainee";
int salary =60000;

     Clerk()
{

   Scanner s1 = new Scanner(System.in);
System.out.println("======================================");

   System.out.print("Enter your name:");
    name =s1.nextLine();

   System.out.print("Enter ID:");
    id =s1.nextInt();

   s1.nextLine();
   
   System.out.print("Enter age:");
    age =s1.nextInt();


   s1.nextLine();
}
void showcase()
{
  System.out.println(" My Name is:"+ name);
  System.out.println(" My ID :"+ id);
  System.out.println(" My salary :"+ salary);
  System.out.println(" My age :"+ age);
  System.out.println(" My Designation is:"+ designation);
}

}

class Sys3
{
   public static void main(String args[])
{
    Developer d= new Developer();


   Tester t = new Tester();
   t.show();

   Clerk c =new Clerk();
   c.showcase();

   
}   
 }    
    
     
    




