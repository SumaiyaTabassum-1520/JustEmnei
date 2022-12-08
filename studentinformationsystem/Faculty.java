package studentinformationsystem;

public class Faculty {

    private int facultyID;
    private String facultyName;
    private String facultyPosition;

    Faculty() {

    }

    Faculty(int fID, String fName, String fPosition) {

        facultyID = fID;
        facultyName = fName;
        facultyPosition = fPosition;

    }

    public int getfacultyID() {
        return facultyID;
    }

    public void setfacultyID(int facultyID) {
        this.facultyID = facultyID;

    }

    public String getfacultyName() {
        return facultyName;
    }

    public void setfacultyName(String facultyName) {
        this.facultyName = facultyName;
    }

    public String getfacultyPosition() {
        return facultyPosition;
    }

    public void setfacultyPosition(String facultyPosition) {
        this.facultyPosition = facultyPosition;
    }

    public String tostring() {
        String text = "Faculty Id: " + facultyID + "Faculty Name: " + facultyName + "Faculty position : " + facultyPosition;
        return text;
    }

}
