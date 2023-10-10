import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        var downloadStatus= new DownloadStatus();
        var thread1= new Thread(new DownloadFileTask(downloadStatus));
        var thread2= new Thread(()->{
            while (!downloadStatus.isDone()){
            }
            System.out.println(downloadStatus.getTotalBytes());
        });
        thread1.start();
        thread2.start();

    }
}