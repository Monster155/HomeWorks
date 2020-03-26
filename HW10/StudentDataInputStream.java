import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class StudentDataInputStream extends InputStream {
    private DataInputStream dis;

    public StudentDataInputStream(DataInputStream in) {
        dis = in;
    }

    public static String readUTF(DataInput in) throws IOException {
        return DataInputStream.readUTF(in);
    }

    @Override
    public int read() throws IOException {
        return dis.read();
    }

    public Student readStudent() throws IOException {
        return new Student(readUTF(), readBoolean(), readInt(), readInt(), readInt(), readInt());
    }

    public void readFully(byte[] b) throws IOException {
        dis.readFully(b);
    }

    public void readFully(byte[] b, int off, int len) throws IOException {
        dis.readFully(b, off, len);
    }

    public int skipBytes(int n) throws IOException {
        return dis.skipBytes(n);
    }

    public boolean readBoolean() throws IOException {
        return dis.readBoolean();
    }

    public byte readByte() throws IOException {
        return dis.readByte();
    }

    public int readUnsignedByte() throws IOException {
        return dis.readUnsignedByte();
    }

    public short readShort() throws IOException {
        return dis.readShort();
    }

    public int readUnsignedShort() throws IOException {
        return dis.readUnsignedShort();
    }

    public char readChar() throws IOException {
        return dis.readChar();
    }

    public int readInt() throws IOException {
        return dis.readInt();
    }

    public long readLong() throws IOException {
        return dis.readLong();
    }

    public float readFloat() throws IOException {
        return dis.readFloat();
    }

    public double readDouble() throws IOException {
        return dis.readDouble();
    }

    @Deprecated
    public String readLine() throws IOException {
        return dis.readLine();
    }

    public String readUTF() throws IOException {
        return dis.readUTF();
    }
}
