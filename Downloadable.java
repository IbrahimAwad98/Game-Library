public interface Downloadable {
    double getFileSize();
    boolean isDownloaded();
    void download();
}
