**Description** <br />
A game of chance with coins placed in a spinning wheel.


**Repo URL** <br />
https://github.com/Obelisk-CS4250/coin-wheel-game


**Game Process and Rules**
1. Coins have one of two possible values: heads (H) and tails (T)
1. The wheel is divided into 2 or more sections
1. The game begins with coins in each section having a value of H or T chosen randomly
1. Player turn
   1. If the value of all coins is the same, the player wins and the game finishes
   1. The player is shown the value of the coins in a subset of the wheel sections
   1. The player may elect to change the value of any coins the player is shown
   1. Coin values are again hidden from the player and the wheel is spun (in a physical game, the player might try to track the location of wheel sections. How to handle this in a virtual game with limited interface?)
1. The game concludes with the player winning the instant all values of the coins are the same
1. The game concludes with the player losing after some number of turns if the player has not won


**To Win**
- The player must arrange the coins to all have matching values before the player runs out of turns.


**Software Lifecycle Model** <br />
- Crystal Clear (for client discussion)


**Software License** <br />
- Discuss with client


**Acceptance Criteria For Discussion** <br />
1. Initial game state does not result in player winning without taking a turn
1. Game wheel has 2 or more sections
1. Generated game always has at least 1 of each coin value
1. The game is honest: alerts player when coin values all match and when no turns remain
1. Persist past data? (db or text file)
1. Interface requirements: Console vs GUI (nice to have) vs API
1. Automated simulation and/or run once with human interface
1. Game alerts when user has won or when user has used too many spins


**Development Tools**
1. Java 8
1. JUnit 4
1. IntelliJ development environment
1. Git with GitHub for version control
1. Checkstyle for code format standard

