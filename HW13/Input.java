import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.CharBuffer;

public class Input extends Reader {

    private FileReader fileReader;
    private ObjectMapper mapper;

    public Input(FileReader fileReader) {
        this.fileReader = fileReader;
        mapper = new ObjectMapper();
    }

    public Student readStudent() throws IOException {
        return mapper.readValue(fileReader, Student.class);
    }

    @Override
    public int read(CharBuffer target) throws IOException {
        return fileReader.read(target);
    }

    @Override
    public int read(char[] cbuf) throws IOException {
        return fileReader.read(cbuf);
    }

    @Override
    public long skip(long n) throws IOException {
        return fileReader.skip(n);
    }

    @Override
    public boolean markSupported() {
        return fileReader.markSupported();
    }

    @Override
    public void mark(int readAheadLimit) throws IOException {
        fileReader.mark(readAheadLimit);
    }

    @Override
    public void reset() throws IOException {
        fileReader.reset();
    }

    @Override
    public int read(char[] cbuf, int off, int len) throws IOException {
        return fileReader.read(cbuf, off, len);
    }

    @Override
    public void close() throws IOException {
        fileReader.close();
    }
}
