public class DigitalGame extends Game implements Playable, Downloadable{

    private Platform platform;
    private double fileSize;
    private boolean downloaded;

    public DigitalGame(Platform platform,
                       double fileSize,
                       String title,
                       Genre genre,
                       int releaseYear,
                       double rating){
        super(title,genre,releaseYear,rating);
        this.platform = platform;
        this.fileSize = fileSize;
        this.downloaded = false;
    }

    public Platform getPlatform(){
        return platform;
    }

    public void play(){
        System.out.println("Playing[" + getTitle() +"] on [" + platform + "]");
    }

    public void pause(){
        System.out.println("Paused[" + getTitle() +"]");
    }

    public void stop(){
        System.out.println("Stopped[" + getTitle()+ "]");
    }

    public void download(){
        this.downloaded = true;
        System.out.println("Donwloaded " + getTitle() + " (" + fileSize + " GB)");
    }

    public double getFileSize(){
        return fileSize;
    }

    public boolean isDownloaded(){
        return downloaded;
    }


    public String getGameInfo(){
        String status;
        if(downloaded){
            status = "Downloaded";
        }
        else{
            status = "Not downloaded";
        }
        return getTitle() + " (" + getGenre() + ", " + getReleaseYear() + ") - Rating: " +
                getRating() + " [" + platform + ", " + fileSize + " GB, " + status + "]";

    }


}
