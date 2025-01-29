import java.util.Scanner;
class Developer
{

   int id;
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
}
  void display()
{

  System.out.println(" My Name is:"+ name);
  System.out.println(" My ID :"+ id);
  System.out.println(" My salary :"+ salary);
  System.out.println(" My Age :"+ age);
  System.out.println(" My Designation is:"+ designation);
}
  void raisesalary()
    {
       salary = salary+40000;
  }


}


class Tester
{

double id;
int age;
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
    void raisesalary()
     {
          salary=salary+20000; 
     }
}

class Clerk
{

     int id;
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
    void raisesaalry()
      {
         salary=salary+10000;
      }
}

class Sys3
{
   public static void main(String args[])
{
    Developer d= new Developer();
    d.display();
    d.raisesalary();


   Tester t = new Tester();
   t.show();
   t.raisesalary();

   Clerk c =new Clerk();
   c.showcase();
   c.raisesalary();

    Scanner sc = new Scanner(System.in);
    int ch, ch1=0,ch2=0;
     

   do{
           System.out.println("1) Display");
           System.out.println("2) Create");
           System.out.println("3) Exit");
           ch1=sc.nextInt();

           if(ch1==1)
         {
          do{
                System.out.println("1) Developer");
                System.out.println("2) Tester");
                System.out.println("3) Clerk");
                System.out.println("4) Exit");
                ch2=sc.nextInt();
                if(ch2==1){ d=new Developer();}
                 if(ch2==2){ t=new Tester();}
                   if(ch2==3){ c=new Clerk();}
                      
                 }while(ch2!=5);

          }
           {
                
                System.out.println("1) Developer");
                System.out.println("2) Tester");
                System.out.println("3) Clerk");
                System.out.println("4) Exit");

            ch1=sc.nextInt();

           }
          

       }while(ch!=4);

      if(ch1==2)
           {
              do{
                  System.out.println("1) Developer");
                  System.out.println("2) Tester");
                  System.out.println("3) Clerk");
                  System.out.println("4) Exit");
                 ch2=sc.nextInt();
                 if(ch1==1){d.display();}
                 if(ch2==2){t.show();}
                   if(ch2==3){c.showcase();}

                     
                  }while(ch2!=5);


           }
               if(ch1==3)
                 {
                     System.out.println("Thank U!!!");
                     System.exit(0);
               }
}   
 }    
    
     
    




