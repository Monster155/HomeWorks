import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Downloader downloader;
    private static Path path;
    private static ArrayList<String> downloaded;

    public static void main(String[] args) throws IOException, URISyntaxException {
        Scanner sc = new Scanner(System.in);
        downloader = new Downloader();
        downloaded = new ArrayList<>();
//        URI link = new URI(sc.nextLine());
        URI link = new URI("http://damir.bos.ru/index.html");
        path = Paths.get("").toAbsolutePath().resolve("Website").normalize();
        download(link);
    }

    private static void download(URI uri) throws IOException, URISyntaxException {
        String text = uri.getPath();
        if (downloaded.contains(text))
            return;
        System.out.println(uri.toString());
        Document doc = Jsoup.connect(uri.toString()).get();
        downloader.download(uri, path.toString(), text);
        downloaded.add(text);

        Elements links = doc.select("a");
        for (Element e : links) {
            URI newUri = new URI(e.attr("href"));
            if (!newUri.isAbsolute())
                download(new URI("http://" + uri.getHost() + "/" + e.attr("href")));
        }

    }
}
