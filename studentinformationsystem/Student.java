package studentinformationsystem;

 public class Student {

    private int studentID;
    private String studentName;
    private double studentCGPA;
    public Course[] courseTaken = new Course[3];
    int courseIdx=0;
    Student() {
        courseIdx=0;
    }

    public Student(int ID, String Name, double CGPA) {
        courseIdx=0;
        this.studentID=ID;
        //studentID = ID;
        studentName = Name;
        studentCGPA = CGPA;

    }

    public int getstudentID() {
        return studentID;
    }

    public void setstudentID(int studentID) {
        this.studentID = studentID;

    }

    public String getstudentName() {
        return studentName;
    }

    public void setstudentName(String studentName) {
        this.studentName = studentName;
    }

    public double getstudentCGPA() {
        return studentCGPA;
    }

    public void setstudentCGPA(double studentCGPA) {
        this.studentCGPA = studentCGPA;
    }
    
    
    public String tostring() {
        
        return " Student Id: " + studentID + " Student Name: " + studentName + " Student CGPA : " + studentCGPA;        
    }

 }
