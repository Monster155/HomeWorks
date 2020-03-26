import java.io.Serializable;

public class Student implements Serializable {
    private String name;
    private boolean isMan;
    private int groupNumber;
    private int yearOfBirth, monthOfBirth, dayOfBirth;

    public Student(String name, boolean isMan, int groupNumber, int yearOfBirth, int monthOfBirth, int dayOfBirth) {
        this.name = name;
        this.isMan = isMan;
        this.groupNumber = groupNumber;
        this.yearOfBirth = yearOfBirth;
        this.monthOfBirth = monthOfBirth;
        this.dayOfBirth = dayOfBirth;
    }
    
    public String getName() {
        return name;
    }

    public boolean isMan() {
        return isMan;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public int getDayOfBirth() {
        return dayOfBirth;
    }

    @Override
    public String toString() {
        return "Student name: " + name +
                "\n Sex: " + (isMan ? "man" : "woman") +
                "\n Group number: " + groupNumber +
                "\n Date of birth: " + dayOfBirth + "." + monthOfBirth + "." + yearOfBirth;
    }
}
