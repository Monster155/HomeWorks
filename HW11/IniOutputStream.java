import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class IniOutputStream extends OutputStream {

    private DataOutputStream dos;

    public IniOutputStream(DataOutputStream dos) {
        this.dos = dos;
    }

    public void writeIni(Map<String, String> map) throws IOException {
        Set<String> keys = map.keySet();
        Collection<String> values = map.values();
        while (keys.iterator().hasNext() && values.iterator().hasNext()) {
            writeChars(keys.iterator().next() + values.iterator().next());
        }
    }

    @Override
    public void write(int b) throws IOException {
        dos.write(b);
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
