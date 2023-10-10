public class DownloadFileTask implements Runnable{
    DownloadStatus status;
    public DownloadFileTask(DownloadStatus status) {
        this.status=status;

    }

    @Override
    public void run() {
        System.out.println("downloading file"+Thread.currentThread().getName());
        for(int i=0;i<10_000;i++)
        {
            if(Thread.currentThread().isInterrupted()) break;
            status.incrementByte();
        }
        System.out.println("download complete"+Thread.currentThread().getName());
    }

    public DownloadStatus getStatus() {
        return status;
    }
}
