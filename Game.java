public abstract class Game implements Comparable<Game>{
    private String title;
    private Genre genre;
    private int releaseYear;
    private double rating;


    public Game(String title, Genre genre, int releaseYear, double rating){
        this.title = title;
        this.genre = genre;
        this.releaseYear = releaseYear;
        this.rating = rating;
    }

    public String getTitle(){
        return title;
    }

    public Genre getGenre(){
        return genre;
    }

    public int getReleaseYear(){
        return releaseYear;
    }

    public double getRating(){
        return rating;
    }

    public void setRating(double newRating){
        this.rating = newRating;
    }

    public abstract String getGameInfo();

    public void displayInfo(){
        System.out.println(" " + title + ", " + genre + ".");
    }

    public int compareTo(Game other){
        return Double.compare(this.rating,other.rating);
    }

    public String toString(){
        return "[" + title + ", "
                + genre + ", "
                + releaseYear +
                ", " + rating + "].";
    }

}
