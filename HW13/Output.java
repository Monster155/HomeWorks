import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.yaml.YAMLFactory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class Output extends Writer {

    private FileWriter fileWriter;
    private ObjectMapper mapper;

    public Output(FileWriter fileWriter, String typeOfFile) {
        this.fileWriter = fileWriter;
        if (typeOfFile.toLowerCase().equals("yaml"))
            mapper = new ObjectMapper(new YAMLFactory());
        else mapper = new ObjectMapper(new JsonFactory());
    }

    public void writeStudent(Student student) throws IOException {
        mapper.writeValue(fileWriter, student);
    }

    @Override
    public void write(char[] cbuf) throws IOException {
        fileWriter.write(cbuf);
    }

    @Override
    public void write(String str) throws IOException {
        fileWriter.write(str);
    }

    @Override
    public Writer append(CharSequence csq) throws IOException {
        return fileWriter.append(csq);
    }

    @Override
    public Writer append(CharSequence csq, int start, int end) throws IOException {
        return fileWriter.append(csq, start, end);
    }

    @Override
    public Writer append(char c) throws IOException {
        return fileWriter.append(c);
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        fileWriter.write(cbuf, off, len);
    }

    @Override
    public void flush() throws IOException {
        fileWriter.flush();
    }

    @Override
    public void close() throws IOException {
        fileWriter.close();
    }
}
