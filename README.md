Checkers Game – Java Console Edition

This is a simple console-based Checkers game built in Java as a university project. The game follows the basic rules of Checkers and can be played by two players on the same machine.

Features

- 8×8 game board with dark and light tiles
- Two players: Black (b) and Red (r)
- Standard moves (diagonal forward movement)
- Jump/Capture moves
- King promotion (when a piece reaches the opposite end)
- Turn switching
- Simple text-based interface

How to Run

1. Compile all Java files:
   javac Tile.java Board.java Player.java Game.java Main.java

2. Run the main class:
   java Main

How to Play

- Players take turns entering moves.
- Input format:
  Enter from row: 2
  Enter from col: 1
  Enter to row: 3
  Enter to col: 2
  Is this a jump? (yes/no): no

- Black pieces move down the board; Red pieces move up.
- A piece can jump over an opponent's piece if the landing square is empty.
- When a piece reaches the last row, it becomes a King (shown as B or R).

Classes

- Tile – represents a single square on the board
- Board – manages the game board and piece placement
- Player – stores player name and color
- Game – controls the game flow and turns
- Main – entry point for the game

Author

Emal Hasanzada
