import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.net.URLConnection;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Downloader {
    public void download(URI uri, String filPath, String fileName) throws IOException {
        URL url = uri.toURL();
        URLConnection connection = url.openConnection();
//        String type = connection.getContentType();
        InputStream inputStream = connection.getInputStream();

//        type = type.substring(type.lastIndexOf("/") + 1);
//        int k = type.indexOf(";");
//        if (k > 0)
//            type = type.substring(0, k);
//        File file = Paths.get(filPath).resolve(fileName + "." + type).normalize().toFile();
        File file = Paths.get(filPath).normalize().toFile();
        file.mkdirs();
        file = new File(file, fileName);
        if (file.exists())
            file.delete();
        System.out.println(file.getPath());
        Files.copy(inputStream, file.toPath());
    }
}
