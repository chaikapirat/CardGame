#  Java Card Game (Swing)

This is a small card game project I made using Java and Swing. It's a simple two-player game where each player gets 5 cards, can change some of them, and then scores are calculated based on different rules.

I built this mainly to practice working with Java GUI and some basic game logic.

## What I Learned

This project was created to practice:

- **GUI development with Java Swing**: I built a simple yet functional graphical user interface for the card game.
- **Game logic implementation in Java**: Designing and coding the logic for the game's rules, score calculation, and the flow of each round.
- **Clean and modular code structure**: I focused on keeping the code organized and readable by following object-oriented programming principles.
- **Applying object-oriented principles**: The project provided an opportunity to implement core OOP concepts such as classes, inheritance, and encapsulation in a practical context.



##  How the Game Works

- 2 players take turns playing.
- Each player starts with 5 cards.
- You can select cards to change once.
- After both players are done, 3 shared cards are revealed.
- These shared cards are added to both players' hands.
- The score is calculated for each player, and the one with the higher score wins the round.
- First to win 3 rounds wins the whole game.

##  Scoring

The game gives points for:

- **Pairs** (like two 7s)
- **Straight** (5 cards in a row, like 2-3-4-5-6)
- **Flush** (5 cards of the same suit)

One tricky part I had to figure out was how to count scores when a card could belong to more than one combination. For example, the hand `[2, 3, 4, 5, 6, 7, 7]` has both:
- a straight (2 to 6)
- a pair (7s)

So I decided to count both for scoring, to make the game more fun.

##  What I Used

- Java 8+
- Swing (for GUI)
- Random for shuffling cards
- Basic OOP structure

##  Card Images

The game uses card images stored in the `Cards/` folder. Make sure this folder is in the same place as the `.java` file and includes files like `acec.jpg`, `2c.jpg`, ..., `back.jpg`.

##  How to Run

1. Make sure you have Java installed.
2. Compile the file:
   ```bash
   javac CardGames.java
