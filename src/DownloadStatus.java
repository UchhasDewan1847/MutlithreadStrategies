import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DownloadStatus {
    private int totalBytes;
    Lock lock= new ReentrantLock();
    public void setTotalBytes(int totalBytes) {
        this.totalBytes = totalBytes;
    }
    public void incrementByte(){
        lock.lock();
        try {
            totalBytes++;
        }
        finally {
            lock.unlock();
        }
    }

    public int getTotalBytes() {
        return totalBytes;
    }
}
