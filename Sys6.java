import java.util.Scanner;

class Developer {
    int id;
    int age;
    String name;
    String designation = "Trainee";
    int salary = 20000;

    Developer() {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter your Name: ");
        name = s1.nextLine();

        System.out.print("Enter ID: ");
        id = s1.nextInt();
        s1.nextLine();

        System.out.print("Enter Age: ");
        age = s1.nextInt();
        s1.nextLine();
    }

    void display() {
        System.out.println("My Name is: " + name);
        System.out.println("My ID: " + id);
        System.out.println("My salary: " + salary);
        System.out.println("My Age: " + age);
        System.out.println("My Designation is: " + designation);
    }

    void raisesalary() {
        salary = salary + 40000;
        System.out.println("Salary raised! New salary: " + salary);
    }
}

class Tester {
    double id;
    int age;
    String name;
    String designation = "Trainee";
    int salary = 50000;

    Tester() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("======================================");

        System.out.print("Enter your name: ");
        name = s1.nextLine();

        System.out.print("Enter ID: ");
        id = s1.nextDouble();
        s1.nextLine();

        System.out.print("Enter age: ");
        age = s1.nextInt();
        s1.nextLine();
    }

    void show() {
        System.out.println("My Name is: " + name);
        System.out.println("My ID: " + id);
        System.out.println("My salary: " + salary);
        System.out.println("My age: " + age);
        System.out.println("My Designation is: " + designation);
    }

    void raisesalary() {
        salary = salary + 20000;
        System.out.println("Salary raised! New salary: " + salary);
    }
}

class Clerk {
    int id;
    int age;
    String name;
    String designation = "Trainee";
    int salary = 60000;

    Clerk() {
        Scanner s1 = new Scanner(System.in);
        System.out.println("======================================");

        System.out.print("Enter your name: ");
        name = s1.nextLine();

        System.out.print("Enter ID: ");
        id = s1.nextInt();
        s1.nextLine();

        System.out.print("Enter age: ");
        age = s1.nextInt();
        s1.nextLine();
    }

    void showcase() {
        System.out.println("My Name is: " + name);
        System.out.println("My ID: " + id);
        System.out.println("My salary: " + salary);
        System.out.println("My age: " + age);
        System.out.println("My Designation is: " + designation);
    }

    void raisesalary() {
        salary = salary + 10000;
        System.out.println("Salary raised! New salary: " + salary);
    }
}

class Sys3 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        Developer d = null;
        Tester t = null;
        Clerk c = null;

        int ch1 = 0, ch2 = 0;

        do {
            System.out.println("1) Display");
            System.out.println("2) Create");
            System.out.println("3) Raise Salary");
            System.out.println("4) Exit");
            System.out.print("Enter your choice: ");
            ch1 = sc.nextInt();

            if (ch1 == 1) {
                
                if (d != null) d.display();
                if (t != null) t.show();
                if (c != null) c.showcase();
            } else if (ch1 == 2) {
                
                do {
                    System.out.println("1) Developer");
                    System.out.println("2) Tester");
                    System.out.println("3) Clerk");
                    System.out.println("4) Back");
                    System.out.print("Enter your choice: ");
                    ch2 = sc.nextInt();

                    if (ch2 == 1) {
                        d = new Developer();  
                    } else if (ch2 == 2) {
                        t = new Tester();  
                    } else if (ch2 == 3) {
                        c = new Clerk();  
                    }

                } while (ch2 != 4);  
            } else if (ch1 == 3) {
                // Raise salary
                if (d != null) {
                    System.out.println("Raising salary for Developer...");
                    d.raisesalary();
                } else if (t != null) {
                    System.out.println("Raising salary for Tester...");
                    t.raisesalary();
                } else if (c != null) {
                    System.out.println("Raising salary for Clerk...");
                    c.raisesalary();
                } else {
                    System.out.println("No employee has been created yet.");
                }
            } else if (ch1 == 4) {
                // Exit the program
                System.out.println("Thank you!");
                System.exit(0);
            } else {
                System.out.println("Invalid choice, please try again.");
            }
        } while (ch1 != 4);      }
}
