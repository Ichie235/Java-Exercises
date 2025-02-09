package structure;

import bank.BankAccount;
import inventory.Inventory;
import inventory.Product;
import inventory.Warehouse;
import university.Course;
import university.Enrollment;
import university.Student;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.accountNumber = 2345333;
        account.accountHolder = "ichie chinemerem richard";
        account.balance = 100000033.00;

        // Exercise: Product Inventory
        Product product = new Product();
        product.productId = 12;
        product.price = 20.99;
        product.productName = "Rice";

        System.out.println("Product ID: " + product.productId);
        System.out.println("Product name: " + product.productName);
        System.out.println("Product price: " + product.price);

        Inventory inventory = new Inventory();
        inventory.product = product;
        inventory.quantity = 100;
        System.out.println("Inventory product ID: " + inventory.product.price + " " + "Inventory product Price: "
                + inventory.product.price + " " + "Inventory product name: " + inventory.product.productName);
        System.out.println("Inventory quantity: " + inventory.quantity);

        Warehouse warehouse = new Warehouse();
        warehouse.warehouseId = 21321;
        warehouse.warehouseName = "Warehouse Block C";
        System.out.println("Warehouse ID: " + warehouse.warehouseId);
        System.out.println("Warehouse name: " + warehouse.warehouseName);

        // Exercise: University Application
        Student student = new Student();
        student.studentId = 12329;
        student.name = "ichie chinemerem richard";
        System.out.println("Student ID: " + student.studentId );
        System.out.println("Student name: " + student.name);

        Course course = new Course();
        course.courseId = 2235;
        course.courseName = "Bio 101";
        System.out.println("Course ID: " +  course.courseId );
        System.out.println("Student name: " + course.courseName);

        Enrollment enrollment = new Enrollment();
        enrollment.course = course;
        enrollment.student = student;
        System.out.println("Enrollment course: " +  enrollment.course.courseId );
        System.out.println("Enrollment student: " + enrollment.student.name);
        
    }
}