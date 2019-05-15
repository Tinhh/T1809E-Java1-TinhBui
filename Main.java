import java.util.Scanner;

public class Main {
    public static void main(String args[]){
     EmployeePartime employeePartime = new EmployeePartime();

     EmployeeFullTime employeeFullTime = new EmployeeFullTime();
     Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap vao muc luong can ban full time");
        employeeFullTime.baseSalary = scanner.nextFloat();

        System.out.println("Nhap vao muc luong co ban pastime");
        employeePartime.baseSalary = scanner.nextFloat();

        employeeFullTime.getSalary();
        System.out.println("Luong fulltime la:" + employeeFullTime.getSalary() );

        employeePartime.getSalary();
        System.out.println("Luong pastime la:" + employeePartime.getSalary() );




    }
}
