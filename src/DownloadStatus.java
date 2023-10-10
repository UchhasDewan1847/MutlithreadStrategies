public class DownloadStatus {
    private volatile boolean isDone;
    private int totalBytes;
    private int totalFiles;
    private Object totalByteLock =new Object();
    public void incrementByte(){
        synchronized (totalByteLock){
            totalBytes++;
        }
    }

    public int getTotalBytes() {
        return totalBytes;
    }

    public boolean isDone() {
        return isDone;
    }

    public void done() {
        isDone = true;
    }
}
