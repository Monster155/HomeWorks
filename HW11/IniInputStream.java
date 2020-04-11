import java.io.DataInput;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;

public class IniInputStream extends InputStream {

    private DataInputStream is;

    public IniInputStream(DataInputStream is) {
        this.is = is;
    }

    public static String readUTF(DataInput in) throws IOException {
        return DataInputStream.readUTF(in);
    }

    public Map<String, String> readIni() throws IOException {
        Map<String, String> map = new HashMap<>();
        String a = readUTF();
        int k = a.indexOf('=');
        while (k != -1) {
            map.put(a.substring(0, k - 1), a.substring(k + 1, a.length() - 1));
            a = readUTF();
            k = a.indexOf('=');
        }
        return map;
    }

    @Override
    public int read() throws IOException {
        return is.read();
    }

    public void readFully(byte[] b) throws IOException {
        is.readFully(b);
    }

    public void readFully(byte[] b, int off, int len) throws IOException {
        is.readFully(b, off, len);
    }

    public int skipBytes(int n) throws IOException {
        return is.skipBytes(n);
    }

    public boolean readBoolean() throws IOException {
        return is.readBoolean();
    }

    public byte readByte() throws IOException {
        return is.readByte();
    }

    public int readUnsignedByte() throws IOException {
        return is.readUnsignedByte();
    }

    public short readShort() throws IOException {
        return is.readShort();
    }

    public int readUnsignedShort() throws IOException {
        return is.readUnsignedShort();
    }

    public char readChar() throws IOException {
        return is.readChar();
    }

    public int readInt() throws IOException {
        return is.readInt();
    }

    public long readLong() throws IOException {
        return is.readLong();
    }

    public float readFloat() throws IOException {
        return is.readFloat();
    }

    public double readDouble() throws IOException {
        return is.readDouble();
    }

    @Deprecated
    public String readLine() throws IOException {
        return is.readLine();
    }

    public String readUTF() throws IOException {
        return is.readUTF();
    }
}
