import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Download extends Thread {

    private int size;
    private Path pathToMainFile;
    private URLConnection connection;

    public Download(String uriText) {
        try {
            URI uri = new URI(uriText);
            connection = uri.toURL().openConnection();

            String type = connection.getContentType();
            type = type.substring(type.lastIndexOf("/") + 1);
            int k = type.indexOf(";");
            if (k > 0)
                type = type.substring(0, k);

            size = connection.getContentLength();
            pathToMainFile = Paths.get("").toAbsolutePath().resolve("file." + type).normalize();
        } catch (IOException e) {
//            e.printStackTrace();
        } catch (URISyntaxException e) {
            System.out.println("Wrong link");
        }
    }

    @Override
    public void run() {
        try {
            InputStream inputStream = connection.getInputStream();
            Files.copy(inputStream, pathToMainFile);
        } catch (IOException e) {
//            e.printStackTrace();
        }
    }

    public float getPercents() {
        try {
            if (size < 0) return -1;
            return (Files.size(pathToMainFile) * 1.0f / size) * 100;
        } catch (IOException e) {
            System.out.println("Can't calculate downloading status");
        }
        return 0;
    }
}
