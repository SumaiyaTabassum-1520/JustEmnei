package studentinformationsystem;

import java.util.Scanner;

public class StudentInformationSystem {
    Student[] studentList = new Student[100];
    Course[] course = new Course[100];
    Faculty[] faculty = new Faculty[100];
    Scanner input = new Scanner(System.in);
    int studentIdx, courseIdx, facultyIdx;

    StudentInformationSystem() {
        studentIdx = 0;
        courseIdx = 0;
        facultyIdx = 0;
    }

    public void addCourseToArray() {

        System.out.println("Enter course Id : ");
        input.nextLine();
        String ID = input.nextLine();
        System.out.println("Enter course Name : ");
        String Name = input.nextLine();
        System.out.println("Enter course credit : ");
        double cdt = input.nextDouble();
        course[courseIdx] = new Course(ID, Name, cdt);
        courseIdx++;

    }

    public void printCourses() {

        if (courseIdx == 0) {
            System.out.println("No student added");
        }
        for (int i = 0; i < courseIdx; i++) {
            System.out.println(course[i].tostring());

        }
    }

    public int SearchCourse(String ID) {
        int foundIdx = -1;
        for (int i = 0; i < courseIdx; i++) {
            if (ID.equals(course[i].getcourseId())) {
                foundIdx = i;
                break;
            }

        }

        return foundIdx;
    }

    public void DeleteCourse() {

        System.out.println("Enter course name to delete");
        String name = input.nextLine();
        int found = SearchCourse(name);
        Course temp;
        if (found == -1) {
            System.out.println("Not found");
        } else {

            temp = course[found];
            course[found] = course[courseIdx - 1];
            courseIdx--;
            System.out.println("Deleted student: " + temp.tostring());
        }
    }

    public void Updatecourse() {
        System.out.println("Enter course id to update");
        int Id = input.nextInt();
        int found = Searchstudent(Id);
        if (found == -1) {
            System.out.println("Not found");
        } else {

            System.out.println("Enter course Name : ");
            input.nextLine();
            String Name = input.nextLine();
            course[found].setcourseTitle(Name);
            System.out.println("Enter student CGPA : ");
            double CDT = input.nextDouble();
            course[found].setcredit(CDT);
        }
    }

    public void addStudentToArray() {

        System.out.println("Enter student Id : ");
        int ID = input.nextInt();
        System.out.println("Enter student Name : ");
        input.nextLine();
        String Name = input.nextLine();
        System.out.println("Enter student CGPA : ");
        double CG = input.nextDouble();
        studentList[studentIdx] = new Student(ID, Name, CG);
        studentIdx++;

    }

    public void printAllStudents() {

        if (studentIdx == 0) {
            System.out.println("No student added");
        }
        for (int i = 0; i < studentIdx; i++) {
            System.out.println(studentList[i].tostring());

        }
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

    public void DeleteStudent() {

        System.out.println("Enter student id to delete");
        int Id = input.nextInt();
        int found = Searchstudent(Id);
        Student temp;
        if (found == -1) {
            System.out.println("Not found");
        } else {

            temp = studentList[found];
            studentList[found] = studentList[studentIdx - 1];
            studentIdx--;
            System.out.println("Deleted student: " + temp.tostring());
        }
    }

    public void UpdateStudent() {
        System.out.println("Enter student id to update");
        int Id = input.nextInt();
        int found = Searchstudent(Id);
        if (found == -1) {
            System.out.println("Not found");
        } else {

            System.out.println("Enter student Name : ");
            input.nextLine();
            String Name = input.nextLine();
            studentList[found].setstudentName(Name);
            System.out.println("Enter student CGPA : ");
            double CG = input.nextDouble();
            studentList[found].setstudentCGPA(CG);
        }
    }

    public void addFacultyToArray() {

        System.out.println("Enter Faculty Id : ");
        int ID = input.nextInt();
        System.out.println("Enter Faculty Name : ");
        input.nextLine();
        String Name = input.nextLine();
        System.out.println("Enter Faculty position : ");
        String position = input.nextLine();
        faculty[facultyIdx] = new Faculty(ID, Name, position);
        facultyIdx++;

    }

    public void printAllfaculties() {

        if (facultyIdx == 0) {
            System.out.println("No student added");
        }
        for (int i = 0; i < facultyIdx; i++) {
            System.out.println(faculty[i].tostring());

        }
    }

    public void enrollCourse() {
        System.out.println("Search a Course ");
        System.out.println("Enter course Id : ");
        input.nextLine();
        String ID = input.nextLine();
        int found = SearchCourse(ID);
        if (found == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Enter student Id : ");
            int stID = input.nextInt();
            int foundst = Searchstudent(stID);
            if (foundst == -1) {
                System.out.println("Not found");
            } else {
                course[found].addStudent(studentList[foundst]);
                //studentList[foundst].course(course[found]);
            }
        }
    }

    public void dropCourse() {
        System.out.println("Search a Course ");
        System.out.println("Enter course Id : ");
        input.nextLine();
        String ID = input.nextLine();
        int found = SearchCourse(ID);
        if (found == -1) {
            System.out.println("Not found");
        } else {
            System.out.println("Enter student Id : ");
            int stID = input.nextInt();
            course[found].dropStudent(stID);
        }
    }

    public int SearchFaculty(int FId) {
        int foundIdx = -1;
        for (int i = 0; i < facultyIdx; i++) {
            if (FId == faculty[i].getfacultyID()) {
                foundIdx = i;
                break;
            }
        }

        return foundIdx;
    }

    public void DeleteFaculty() {

        System.out.println("Enter Faculty id to delete");
        int Id = input.nextInt();
        int found = SearchFaculty(Id);
        Faculty temp;
        if (found == -1) {
            System.out.println("Not found");
        } else {

            temp = faculty[found];
            faculty[found] = faculty[facultyIdx - 1];
            facultyIdx--;
            System.out.println("Deleted faculty: " + temp.tostring());
        }
    }

    public void Updatefaculty() {
        System.out.println("Enter faculty id to update");
        int Id = input.nextInt();
        int found = SearchFaculty(Id);
        if (found == -1) {
            System.out.println("Not found");
        } else {

            System.out.println("Enter Faculty Name : ");
            input.nextLine();
            String Name = input.nextLine();
            faculty[found].setfacultyName(Name);
            System.out.println("Enter faculty CGPA : ");
            String position = input.nextLine();
            faculty[found].setfacultyPosition(position);
        }
    }

    public void printallStudentincourse() {
        System.out.println("Enter course Id : ");
        input.nextLine();
        String ID = input.nextLine();
        int found = SearchCourse(ID);
        if (found == -1) {
            System.out.println("Not found");
        } else {
            course[found].printAllStudents();

        }
    }

    int breakLoop = 0;

    public void run() {
        while (printMenu() == 1) {
            int options = input.nextInt();
            switch (options) {
                case 1:
                    printAdd();
                    char add = input.next().charAt(0);
                    switch (add) {
                        case 'a':
                            System.out.println("Enter student information");
                            addStudentToArray();
                            break;
                        case 'b':
                            System.out.println("Enter course information");
                            addCourseToArray();
                            break;
                        case 'c':
                            System.out.println("Enter faculty information");
                            addFacultyToArray();
                            break;
                        case 'd':
                            System.out.println("Enter Enroll Information");
                            enrollCourse();
                            break;
                        case 'e':
                            System.out.println("Enter drop Infromation");
                            dropCourse();
                            break;

                    }
                    break;

                case 2:
                    printDelete();
                    char delete = input.next().charAt(0);
                    switch (delete) {
                        case 'a':
                            System.out.println("delete student");
                            DeleteStudent();
                            break;
                        case 'b':
                            System.out.println("delete course");
                            DeleteCourse();
                            break;
                        case 'c':
                            System.out.println("delete faculty");
                            DeleteFaculty();
                            break;

                    }
                    //delete();
                    break;
                case 3:
                    printUpdate();
                    char update = input.next().charAt(0);
                    switch (update) {
                        case 'a':
                            System.out.println("update student information");
                            UpdateStudent();
                            break;
                        case 'b':
                            System.out.println("update course");
                            Updatecourse();
                            break;
                        case 'c':
                            System.out.println("update faculty");
                            Updatefaculty();
                            break;
                    }
                    //update();
                    break;
                case 4:
                    printInformation();
                    char print = input.next().charAt(0);
                    switch (print) {
                        case 'a':
                            System.out.println("Print all students");
                            printAllStudents();
                            break;
                        case 'b':
                            System.out.println("Print all course ");
                            printCourses();
                            break;
                        case 'c':
                            System.out.println("Print all faculties");
                            printAllfaculties();
                            break;
                        case 'd':
                            System.out.println("Print information of a student");
                            System.out.println("Search a Student");
                            System.out.println("Enter student Id : ");
                            int Id = input.nextInt();
                            int found = Searchstudent(Id);
                            if (found == -1) {
                                System.out.println("Not found");
                            } else {
                                System.out.println(studentList[found].tostring());
                            }
                            break;
                        case 'e':
                            System.out.println("Print information of a course");
                            System.out.println("Search a Course ");
                            System.out.println("Enter course Id : ");
                            String ID = input.nextLine();
                            found = SearchCourse(ID);
                            if (found == -1) {
                                System.out.println("Not found");
                            } else {
                                System.out.println(course[found].tostring());
                            }
                            break;
                        case 'f':
                            System.out.println("Print information of a faculty ");
                            System.out.println("Search a faculty");
                            System.out.println("Enter faculty Id : ");
                            Id = input.nextInt();
                            found = SearchFaculty(Id);
                            if (found == -1) {
                                System.out.println("Not found");
                            } else {
                                System.out.println(faculty[found].tostring());
                            }
                            break;
                        case 'g':
                            System.out.println("Print student list and faculty information of a course");
                            printallStudentincourse();
                            break;
                        case 'h':
                            System.out.println("Print courses taken by a student");
                            break;
                    }
                    //print();
                    break;
                case 5:
                    printSearchInformation();
                    char search = input.next().charAt(0);
                    switch (search) {
                        case 'a':
                            System.out.println("Search a Student");
                            System.out.println("Enter student Id : ");
                            int Id = input.nextInt();
                            int found = Searchstudent(Id);
                            if (found == -1) {
                                System.out.println("Not found");
                            } else {
                                System.out.println(studentList[found].tostring());
                            }
                            break;
                        case 'b':
                            System.out.println("Search a Course ");
                            System.out.println("Enter course Id : ");
                            input.nextLine();
                            String ID = input.nextLine();
                            found = SearchCourse(ID);
                            if (found == -1) {
                                System.out.println("Not found");
                            } else {
                                System.out.println(course[found].tostring());
                            }
                            break;
                        case 'c':
                            System.out.println("Search a faculty");
                            System.out.println("Enter faculty Id : ");
                            Id = input.nextInt();
                            found = SearchFaculty(Id);
                            if (found == -1) {
                                System.out.println("Not found");
                            } else {
                                System.out.println(faculty[found].tostring());
                            }
                            break;
                        case 'd':
                            System.out.println("Search whether a student takes a course");
                            break;
                        case 'e':
                            System.out.println("Search whether a faculty teaches a course");
                            break;
                        case 'f':
                            System.out.println("Search courses taken by a student");
                            break;
                        case 'g':
                            System.out.println("Search courses taught by a faculty");
                            break;
                    }
                    break;
                case 6:
                    breakLoop = 1;
                    break;
                default:
                    printErorrMessage();
                    break;
            }
            if (breakLoop == 1) {
                break;
            }

        }
    }

    public static int printMenu() {
        System.out.println("\t Enter 1 to add");
        System.out.println("\t Enter 2 to delete");
        System.out.println("\t Enter 3 to update");
        System.out.println("\t Enter 4 to print");
        System.out.println("\t Enter 5 to search");
        System.out.println("\t Enter 6 to exit");
        return 1;
    }

    public static void printAdd() {
        System.out.println("Enter a to add student");
        System.out.println("Enter b to add course");
        System.out.println("Enter c to add faculty");
        System.out.println("Enter d to enroll");
        System.out.println("Enter e to drop");
    }

    public static void printDelete() {
        System.out.println("Enter a to delete student");
        System.out.println("Enter b to delete course");
        System.out.println("Enter c to delete faculty");
    }

    public static void printUpdate() {
        System.out.println("Enter a to update student");
        System.out.println("Enter b to update course");
        System.out.println("Enter c to update faculty");
    }

    public static void printInformation() {
        System.out.println("Enter a to print all students");
        System.out.println("Enter b to print all course ");
        System.out.println("Enter c to print all faculties");
        System.out.println("Enter d to print information of a student");
        System.out.println("Enter e to print information of a course");
        System.out.println("Enter f to print information of a faculty ");
        System.out.println("Enter g to print student list and faculty information of a course");
        System.out.println("Enter h to print courses taken by a student");
    }

    public static void printSearchInformation() {
        System.out.println("Enter a to search a Student");
        System.out.println("Enter b to search a Course");
        System.out.println("Enter c to search a Faculty");
        System.out.println("Enter d to search whether a student takes a course");
        System.out.println("Enter e to search whether a faculty teaches a course");
        System.out.println("Enter f to search courses taken by a student");
        System.out.println("Enter g to searchcourses taught by a faculty");
    }

    public static void printErorrMessage() {

        System.out.println("You choose Wrong option.Please Enter another option");
    }

    public static void main(String[] args) {

        StudentInformationSystem driver = new StudentInformationSystem();
        driver.run();

    }

}

