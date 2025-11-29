import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        System.out.println("**** Welcome to Game library 2025 ****");
        System.out.println("Made by me\n");

        GameLibrary myLibrary = new GameLibrary("Ibrahims Gaming Collection");

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

        DigitalGame digitalGame3 = new DigitalGame(Platform.PC,
                50.0,
                "Cyberpunk 2077",
                Genre.ACTION,
                2020,
                8.5);

        DigitalGame digitalGame4 = new DigitalGame(Platform.XBOX,
                60.0,
                "Call of Duty: Modern Warfare",
                Genre.ACTION,
                2023,
                8.8);


        DigitalGame digitalGame5 = new DigitalGame(Platform.PLAYSTATION,
                55.0,
                "Elden Ring",
                Genre.RPG,
                2022,
                9.7);

        DigitalGame digitalGame6 = new DigitalGame(Platform.PC,
                40.0,
                "Skyrim",
                Genre.RPG,
                2011,
                9.3);

        DigitalGame digitalGame7 = new DigitalGame(Platform.PC,
                8.5,
                "Portal 2",
                Genre.PUZZLE,
                2011,
                9.8);

        DigitalGame digitalGame8 = new DigitalGame(Platform.NINTENDO,
                5.0,
                "Tetris Effect",
                Genre.PUZZLE,
                2018,
                8.9);

      PhysicalGame physicalGame = new PhysicalGame("Zelda:BOTW",
              Genre.ADVENTURE,
              2017,
              5.1,
              Platform.NINTENDO,
              true);

        PhysicalGame physicalGame1 = new PhysicalGame("Super Mario Odyssey",
                Genre.ADVENTURE,
                2017,
                9.5,
                Platform.NINTENDO,
                true);

        PhysicalGame physicalGame2 = new PhysicalGame("Mario Kart 8 Deluxe",
                Genre.SPORTS,
                2017,
                9.3,
                Platform.NINTENDO,
                true);

        PhysicalGame physicalGame3 = new PhysicalGame("Animal Crossing: New Horizons",
                Genre.ADVENTURE,
                2020,
                9.0,
                Platform.NINTENDO,
                true);


        myLibrary.addGame(digitalGame1);
        myLibrary.addGame(digitalGame2);
        myLibrary.addGame(digitalGame3);
        myLibrary.addGame(digitalGame4);
        myLibrary.addGame(digitalGame5);
        myLibrary.addGame(physicalGame1);
        myLibrary.addGame(physicalGame2);
        myLibrary.addGame(physicalGame3);

        System.out.println("=== All my Games ===");
        myLibrary.displayAllGames();

        System.out.println("\n=== SORT AfTER RATING ===");
        myLibrary.sortByRating();
        myLibrary.displayAllGames();

        System.out.println("\n=== Download Some Games ===");
        digitalGame1.download();
        digitalGame5.download();
        digitalGame6.download();



        System.out.println("\n=== RPG Games ===");
        ArrayList<Game> rpg = myLibrary.findGames(new GenreFilter(Genre.RPG));
        for (Game g : rpg) {
            System.out.println(g.getGameInfo());
        }

        System.out.println("\n== STATS ===");
        System.out.println("Total: " + myLibrary.getAllGames().size());
        System.out.println("Digitals: " + myLibrary.getDigitalGame().size());
        System.out.println("Total size (Gigabyte): " + myLibrary.getTotalDownloadSize());




    }
}
