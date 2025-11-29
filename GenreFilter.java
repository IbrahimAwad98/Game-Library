public class GenreFilter implements IGameFilter{
    private Genre genre;

    public GenreFilter(Genre genre){
        this.genre = genre;
    }

    public boolean matches(Game game){
       return game.getGenre().equals(genre);
    }

}
