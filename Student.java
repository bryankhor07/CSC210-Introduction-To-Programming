/*
 Assignment: 6
 Description: This program creates a class for Student and there are several concepts implemented in the class
 Name: Bryan Khor
 ID: 922228564
 Class: CSC 210-07
 Semester: Fall
*/

public class Student {

    public static void main(String[] args) {

        // Object number 1
        Student stud1 = new Student();
        System.out.println(stud1.toString() + "\n"); // Print student 1 details

        // Object number 2
        Student stud2 = new Student(12345678, "Bryan Khor", "jacrispy07@gmail.com", "Computer Science");
        System.out.println(stud2.toString() + "\n"); // Print student 2 details

        stud2.setStudentID(22557711);
        stud2.setName("Bryan Khor Zhi An");

        System.out.println(stud2.toString() + "\n"); // Print student 2 details after modifications

        // Object number 3
        Student stud3 = new Student(75349123, "Garrett", "garrettcooler@gmail.com", "Criminal Justice");
        System.out.println(stud3.toString()); // Print student 3 details
        System.out.println(stud3.getDeptName()); // Get individual detail from student 3
        System.out.println(stud3.getEmail() + "\n");

        System.out.println("Number of objects: " + Student.getCount()); // Get the count for the number objects created
    }

    // Create 4 data fields called studentID, name, email and deptName
    private int studentID;
    private String name;
    private String email;
    private String deptName;
    static int count = 0;

    // Default constructor
    public Student() {
        this.studentID = 0;
        this.name = " ";
        this.email = " ";
        this.deptName = " ";
        count++; // Increment object count everytime a new object is created
    }

    // Constructor with parameters(ID and name)
    public Student(int id, String name) {
        this.studentID = id;
        this.name = name;
        this.email = "123";
        this.deptName = "abc";
        count++;
    }

    // Constructor with parameters
    public Student(int id, String name, String email, String dept) {
        this.studentID = id;
        this.name = name;
        this.email = email;
        this.deptName = dept;
        count++; // Increment object count everytime a new object is created
    }

    // This method prints out the details of the student
    public String toString() {
        return "Student ID: " + this.studentID + " Name: " + this.name + " Email: " + this.email + " Department: " + this.deptName;
    }

    // This method gets the count for the number of objects created
    static int getCount() {
        return count;
    }

    // This method gets the student ID
    public int getStudentID() {
        return studentID;
    }

    // This method gets the name of the student
    public String getName() {
        return name;
    }

    // This method gets the email of the student
    public String getEmail() {
        return email;
    }

    // This method gets the department name of the student
    public String getDeptName() {
        return deptName;
    }

    // This method sets a new ID for the student
    public void setStudentID(int newStudentID) {
        studentID = newStudentID;
    }

    // This method sets a new name for the student
    public void setName(String newName) {
        name = newName;
    }

    // This method sets a new email for the student
    public void setEmail(String newEmail) {
        email = newEmail;
    }

    // This method sets a new department name for the student
    public void setDeptName(String newDeptName) {
        deptName = newDeptName;
    }
}
