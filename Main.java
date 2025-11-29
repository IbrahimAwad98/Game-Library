import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        System.out.println("**** Welcome to Game library 2025 ****");
        System.out.println("Made by me\n");

        System.out.println("Digital games: ");
    DigitalGame digitalGame1 = new DigitalGame(Platform.PC,
            35.0,
            "The Witcher",
            Genre.RPG,
            2015,
            9.5);

      DigitalGame digitalGame2 = new DigitalGame(Platform.PLAYSTATION,
              45.0,
              "EAFC25",
              Genre.SPORTS,
              2024,
              6.4);

        ArrayList<Game> games = new ArrayList<>();
        games.add(digitalGame1);
        games.add(digitalGame2);

       for (int i = 0; i < games.size();i++){
           System.out.println(games.get(i).getGameInfo());
       }

      PhysicalGame physicalGame = new PhysicalGame("Zelda:BOTW",
              Genre.ADVENTURE,
              2017,
              5.1,
              Platform.NINTENDO,
              true);








    }
}
