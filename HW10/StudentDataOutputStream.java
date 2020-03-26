import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class StudentDataOutputStream extends OutputStream {
    private DataOutputStream dos;

    public StudentDataOutputStream(DataOutputStream dos) {
        this.dos = dos;
    }

    @Override
    public void write(int b) throws IOException {
        dos.write(b);
    }

    public void writeStudent(Student student) throws IOException {
        writeChars(student.getName());
        writeBoolean(student.isMan());
        writeInt(student.getGroupNumber());
        writeInt(student.getYearOfBirth());
        writeInt(student.getMonthOfBirth());
        writeInt(student.getDayOfBirth());
    }

    public void writeBoolean(boolean v) throws IOException {
        dos.writeBoolean(v);
    }

    public void writeByte(int v) throws IOException {
        dos.writeByte(v);
    }

    public void writeShort(int v) throws IOException {
        dos.writeShort(v);
    }

    public void writeChar(int v) throws IOException {
        dos.writeChar(v);
    }

    public void writeInt(int v) throws IOException {
        dos.writeInt(v);
    }

    public void writeLong(long v) throws IOException {
        dos.writeLong(v);
    }

    public void writeFloat(float v) throws IOException {
        dos.writeFloat(v);
    }

    public void writeDouble(double v) throws IOException {
        dos.writeDouble(v);
    }

    public void writeBytes(String s) throws IOException {
        dos.writeBytes(s);
    }

    public void writeChars(String s) throws IOException {
        dos.writeChars(s);
    }

    public void writeUTF(String str) throws IOException {
        dos.writeUTF(str);
    }

    public int size() {
        return dos.size();
    }
}
