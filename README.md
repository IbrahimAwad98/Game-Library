# Game Library

A small Java console program that manages a game collection. Made as an object-oriented programming exercise.

## What it does

- Add and remove games
- Digital games and physical games share a common `Game` base class
- Interfaces `Downloadable` and `Playable` for what a game can do
- Filter games by genre or rating with the `IGameFilter` interface
- Sort games by rating and print the whole library

## Files

- `Main.java` - creates a library and fills it with example games
- `GameLibrary.java` - the collection with add, remove, sort, and find
- `Game.java`, `DigitalGame.java`, `PhysicalGame.java` - the game classes
- `Genre.java`, `Platform.java` - enums
- `IGameFilter.java`, `GenreFilter.java`, `RatingFilter.java` - filters

## Run

```bash
javac *.java
java Main
```
