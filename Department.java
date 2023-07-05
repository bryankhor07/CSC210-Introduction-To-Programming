/*
 Assignment: 6
 Description: This program creates a class for Department and there are several concepts implemented in the class
 Name: Bryan Khor
 ID: 922228564
 Class: CSC 210-07
 Semester: Fall
*/

import java.util.Arrays;

public class Department {

    private String name; // Department name
    private int count = 0; // Number of students
    private int departmentSize = 500; // Size of the department
    private Student[] students = new Student[departmentSize]; // Student array

    // Default constructor
    public Department() {

    }

    // Constructor with parameter
    public Department(String name) {
        setName(name);
    }

    // Method to add student
    public void add(Student student) {
        int size = students.length;

        if (count == size) {
            return;
        }

        students[this.count] = student;
        student.setDeptName(this.name);
        this.count++;
    }

    // Method to remove student
    public void remove(Student student) {
        int size = students.length;

        if (count == 0) {
            return;
        }

        for (int i = 0; i < this.count; i++) {
            //If the student is in the array, execute body
            if (students[i].equals(student)) {
                //Sort array via loop
                for (int j = i; j < this.count; j++) {
                    //Initialize temp variable to hold the other object
                    Student temp = students[j + 1];
                    //Shift/replace objects in array
                    students[j] = temp;
                }
                //Decrease count because a student was removed
                this.count--;
                //Break loop and return to caller
                break;
            }
        }

        student.setDeptName("N/A");
    }

    // Method to transfer student to another department
    public void transferTo(Student student, Department department) {
        department.add(student);
        this.remove(student);
        student.setDeptName(department.getName());
    }

    // Method to transfer student from another department
    public void transferFrom(Student student, Department department) {
        department.remove((student));
        this.add(student);
        student.setDeptName(department.getName());
    }

    // Method to print the details of the department including every student
    public void print() {
        System.out.println(this.name);
        for(int i = 0; i < this.count; i++)
            System.out.println(students[i].toString());
    }

    // This method returns the name of the department
    public String getName() {
        return name;
    }

    // This method returns the students
    public Student[] getStudent() {
        return students;
    }

    // This method returns the count which is the number of students
    public int getCount() {
        return count;
    }

    // This method returns the size of the department
    public int getDepartmentSize() {
        return departmentSize;
    }

    // This method sets the name of a department
    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Department dept1 = new Department("CS"); // Department 1
        Department dept2 = new Department("HR"); // Department 2

        Student s1 = new Student(1111, "Aaa"); // Student 1
        Student s2 = new Student(2222, "Bbb"); // Student 2
        Student s3 = new Student(3333, "CCC"); // Student 3

        dept1.add(s1);
        dept1.add(s2);
        dept2.add(s3);

        dept1.print();
        dept2.print();

        dept1.transferTo(s1, dept2); // from dept1 transfer to dept2
        dept2.print();

        dept1.transferFrom(s3, dept2); // transfer from dept2 transfer to dept1
        dept1.print();

    }
}
