public class PhysicalGame extends Game implements Playable{

    private Platform platform;
    private boolean inCollection;

    public PhysicalGame(String title, Genre genre,
                        int releaseYear,
                        double rating,
                        Platform platform,
                        boolean inCollection
                        ){
        super(title, genre, releaseYear, rating);
        this.platform = platform;
        this.inCollection = inCollection;
    }

    public Platform getPlatform(){
        return platform;
    }


    public void play(){
        if(inCollection){
            System.out.println("Playing [" + getTitle() + "] on [" + platform + "]");
        }
        else{
            System.out.println("Cannot play [" + getTitle() + "] - not in collection!");
        }
    }

    public void pause(){
        System.out.println("Paused [" + getTitle() + "]");
    }

    public void stop(){
        System.out.println("Stopped [" + getTitle() + "]");
    }

    public String getGameInfo(){
        String status = inCollection ? "In collection" : "Not in collection";
        return getTitle() + " (" + getGenre() + ", " + getReleaseYear() +
                ") - Rating: " + getRating() + " [" + platform +
                ", Physical, " + status + "]";
    }

}
