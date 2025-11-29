public class RatingFilter implements IGameFilter{

    private double minRating;

    public RatingFilter(double minRating){
        this.minRating = minRating;
    }

    public boolean matches(Game game){
        if (game.getRating() >= minRating){
            return true;
        }
        return false;
    }
}
