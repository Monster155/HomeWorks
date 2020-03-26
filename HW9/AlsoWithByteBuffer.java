import java.util.ArrayList;

public class AlsoWithByteBuffer {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Damir", true, 902, 2001, 5, 18));
        list.add(new Student("Bulat", true, 902, 2001, 9, 4));
        list.add(new Student("Rinat", true, 902, 2001, 11, 22));

        Student.output(list, "text.txt");
        Student.input("text.txt").stream().forEach(AlsoWithByteBuffer::studentToString);
    }

    public static void studentToString(Student student) {
        System.out.println(student);
    }
}
