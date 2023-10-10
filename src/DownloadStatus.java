public class DownloadStatus {
    private int totalBytes;
    public void setTotalBytes(int totalBytes) {
        this.totalBytes = totalBytes;
    }
    public void incrementByte(){
        totalBytes++;
    }

    public int getTotalBytes() {
        return totalBytes;
    }
}
