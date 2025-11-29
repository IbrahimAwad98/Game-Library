import java.util.ArrayList;
import java.util.Collections;

public class GameLibrary {

    private ArrayList<Game> games;
    private String libraryName;


    public GameLibrary(String libraryName){
        this.libraryName = libraryName;
        games = new ArrayList<>();
    }

    public String getLibraryName(){
        return libraryName;
    }

    public ArrayList getAllGames(){
        return new ArrayList<>(games);
    }

    public void addGame(Game game){
        games.add(game);
    }

    public void removeGame(String title){
        for (int i = 0; i < games.size();i++){
            if(games.get(i).getTitle().equals(title)){
                games.remove(i);
                return;
            }
        }
    }

    public void sortByRating(){
        Collections.sort(games);
    }


    public ArrayList<Game> getDigitalGame(){
        ArrayList<Game> result = new ArrayList<>();
        for(Game g: games){
            if(g instanceof DigitalGame){
                result.add(g);
            }
        }
        return result;
    }

    public ArrayList<Game> getPhysicalGames(){
        ArrayList<Game> result = new ArrayList<>();
        for(Game g : games){
            if(g instanceof PhysicalGame){
                result.add(g);
            }
        }
        return result;
    }

    public void displayAllGames(){
        for(int i = 0; i < games.size();i++){
            System.out.println(games.get(i).getGameInfo());
        }
    }


    public ArrayList<Game> findGames(IGameFilter filter){
        ArrayList<Game> result  = new ArrayList<>();
        for(Game g: games){
            if (filter.matches(g)){
                result.add(g);
            }
        }
        return result ;
    }


}
