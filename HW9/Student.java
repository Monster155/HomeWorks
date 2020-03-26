import java.io.*;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;

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

    public static void output(Collection<Student> students, String path) {
        try (FileOutputStream fos = new FileOutputStream(path)) {

            ByteBuffer buffer = ByteBuffer.allocate(4);
            buffer.putInt(students.size());
            fos.write(buffer.array());
            fos.flush();
            buffer.clear();

            for (Student s : students) {
                buffer = ByteBuffer.allocate(4 + s.name.getBytes().length + 5 * 4);
                buffer.putInt(s.name.getBytes().length);
                buffer.put(s.name.getBytes());

                if (s.isMan) buffer.putInt(1);
                else buffer.putInt(0);

                buffer.putInt(s.groupNumber);

                buffer.putInt(s.yearOfBirth);
                buffer.putInt(s.monthOfBirth);
                buffer.putInt(s.dayOfBirth);

                fos.write(buffer.array());
                fos.flush();
                buffer.clear();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Collection<Student> input(String path) {
        try (FileInputStream fis = new FileInputStream(path)) {
            ByteBuffer buffer = ByteBuffer.allocate(4);
            fis.read(buffer.array());
            int studentsCount = buffer.getInt();

            ArrayList<Student> list = new ArrayList<>();

            for (int i = 0; i < studentsCount; i++) {
                buffer = ByteBuffer.allocate(4);
                fis.read(buffer.array());
                byte[] name = new byte[buffer.getInt()];
                fis.read(name);

                buffer = ByteBuffer.allocate(5 * 4);
                fis.read(buffer.array());
                list.add(new Student(new String(name),
                        buffer.getInt() > 0 ? true : false,
                        buffer.getInt(),
                        buffer.getInt(),
                        buffer.getInt(),
                        buffer.getInt()
                ));
            }
            return list;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
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
