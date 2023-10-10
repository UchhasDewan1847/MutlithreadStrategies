import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        DownloadStatus status=new DownloadStatus();
        List<Thread> threads= new ArrayList<>();
        for (int i=0;i<10;i++){
            var thread=new Thread(new DownloadFileTask(status));
            thread.start();
            threads.add(thread);

        }
        for (var thread:threads){
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(status.getTotalBytes());

    }
}