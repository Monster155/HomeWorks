import java.util.Scanner;

public class Main {

    static Download downloadThread;

    public static void main(String[] args) {
        String command;
        Scanner sc = new Scanner(System.in);
        while (true) {
            command = sc.next().trim().toLowerCase();
            switch (command) {
                case "download":
                    if (isNotWork()) {
                        downloadThread = new Download(sc.nextLine().trim());
                        downloadThread.start();
                        System.out.println("Downloading started");
                    }
                    break;
                case "status":
                    if (isNotWork()) System.out.println("Nothing is downloading");
                    else {
                        float percent = downloadThread.getPercents();
                        if (percent < 0) System.out.println("Unable to calculate size");
                        else System.out.println("Downloaded " + percent + "%");
                    }
                    break;
                case "stop":
                    if (isNotWork()) System.out.println("Nothing is downloading");
                    else if (downloadThread != null) {
                        downloadThread.interrupt();
                        System.out.println("Download stopped");
                    }
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
    }

    public static boolean isNotWork() {
        return downloadThread == null || downloadThread.isInterrupted();
    }
}