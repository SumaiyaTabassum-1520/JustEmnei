package studentinformationsystem;

import java.util.*;

public class Course {

    private String courseId;
    private String courseTitle;
    private double credit;
    private Student[] studentList = new Student[40];
    private int numberOfStudents;
    private Faculty faculty;
    Scanner input = new Scanner(System.in);
    int studentIdx, courseIdx, facultyIdx;

    Course() {

    }

    public Course(String cID, String cTitle, double Cdt) {

        courseId = cID;
        courseTitle = cTitle;
        credit = Cdt;
    }

    public String getcourseId() {
        return courseId;
    }

    public void setcourseId(String courseId) {
        this.courseId = courseId;

    }

    public String getcourseTitle() {
        return courseTitle;
    }

    public void setcourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;

    }

    public double getcredit() {
        return credit;
    }

    public void setcredit(double credit) {
        this.credit = credit;

    }

    public int getnumberOfStudents() {
        return numberOfStudents;
    }

    public void setnumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;

    }

    public Student[] getstudentList() {
        return studentList;
    }

    public void setstudentList(Student[] studentList) {
        this.studentList = studentList;

    }

    public Faculty getfaculty() {
        return faculty;
    }

    public void setfaculty(Faculty faculty) {
        this.faculty = faculty;

    }

    public String tostring() {

        return "Course Id: " + courseId + "Course Title: " + courseTitle + "Course credit : " + credit;//+ student.tostring();

    }

    public void addStudent(Student st) {
        studentList[studentIdx] = st;
        studentIdx++;
        System.out.println(st.tostring());
        System.out.println("was added to" + this.tostring());
    }

    public int Searchstudent(int Id) {
        int foundIdx = -1;
        for (int i = 0; i < studentIdx; i++) {
            if (Id == studentList[i].getstudentID()) {
                foundIdx = i;
                break;
            }
        }

        return foundIdx;
    }

    public void dropStudent(int studentID) {

        int found = Searchstudent(studentID);
        if (found == -1) {
            System.out.println("This Id is not taken this course");
        } else {
            Student temp = studentList[found];
            studentList[found] = studentList[studentIdx - 1];
            studentIdx--;
            System.out.println("Drop sucessfully: " + temp.tostring());
        }
    }

    public void addFaculty(Faculty faculty) {

    }

    public void dropFaculty() {

    }

    public void printAllStudents() {

        if (studentIdx == 0) {
            System.out.println("No student added");
        }
        for (int i = 0; i < studentIdx; i++) {
            System.out.println(studentList[i].tostring());

        }
    }

}
