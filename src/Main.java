import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        List<Thread> threads= new ArrayList<>();
        List<DownloadFileTask> tasks= new ArrayList<>();
        for (int i=0;i<10;i++){
            DownloadFileTask task=new DownloadFileTask();
            tasks.add(task);
            var thread=new Thread(task);
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
        Optional<Integer> summation=tasks.stream()
                .map(t->t.getStatus().getTotalBytes())
                .reduce(Integer::sum);
        System.out.println(summation.get());

    }
}