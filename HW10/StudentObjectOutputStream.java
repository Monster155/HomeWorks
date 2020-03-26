import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class StudentObjectOutputStream extends OutputStream {

    private ObjectOutputStream oos;

    public StudentObjectOutputStream(ObjectOutputStream oos) {
        this.oos = oos;
    }

    @Override
    public void write(int b) throws IOException {
        oos.write(b);
    }

    public void writeStudent(Student student) throws IOException {
        writeChars(student.getName());
        writeBoolean(student.isMan());
        writeInt(student.getGroupNumber());
        writeInt(student.getYearOfBirth());
        writeInt(student.getMonthOfBirth());
        writeInt(student.getDayOfBirth());
    }

    public void useProtocolVersion(int version) throws IOException {
        oos.useProtocolVersion(version);
    }

    public void writeObject(Object obj) throws IOException {
        oos.writeObject(obj);
    }

    public void writeUnshared(Object obj) throws IOException {
        oos.writeUnshared(obj);
    }

    public void defaultWriteObject() throws IOException {
        oos.defaultWriteObject();
    }

    public ObjectOutputStream.PutField putFields() throws IOException {
        return oos.putFields();
    }

    public void writeFields() throws IOException {
        oos.writeFields();
    }

    public void reset() throws IOException {
        oos.reset();
    }

    public void writeBoolean(boolean val) throws IOException {
        oos.writeBoolean(val);
    }

    public void writeByte(int val) throws IOException {
        oos.writeByte(val);
    }

    public void writeShort(int val) throws IOException {
        oos.writeShort(val);
    }

    public void writeChar(int val) throws IOException {
        oos.writeChar(val);
    }

    public void writeInt(int val) throws IOException {
        oos.writeInt(val);
    }

    public void writeLong(long val) throws IOException {
        oos.writeLong(val);
    }

    public void writeFloat(float val) throws IOException {
        oos.writeFloat(val);
    }

    public void writeDouble(double val) throws IOException {
        oos.writeDouble(val);
    }

    public void writeBytes(String str) throws IOException {
        oos.writeBytes(str);
    }

    public void writeChars(String str) throws IOException {
        oos.writeChars(str);
    }

    public void writeUTF(String str) throws IOException {
        oos.writeUTF(str);
    }
}
