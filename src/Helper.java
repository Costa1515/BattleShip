public class Helper {
    public static final String ANSI_BLUE = "\u001B[34m";
    public Helper(String Help) {
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   +~~~~~~~~~~+");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   |   HELP   |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   +~~~~~~~~~~+\n");
        System.out.println("\t\t\t\t\t\t\t\t\t\t+"+ANSI_BLUE+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+ "\033[39m" + "\033[49m"+"+");
        System.out.println("\t\t\t\t\t\t\t\t\t\t|  Players take turns firing shots (by calling out a grid coordinate)          |\n" +
                "\t\t\t\t\t\t\t\t\t\t| On your turn, call out a letter and a number that identifies a row and       |\n" +
                "\t\t\t\t\t\t\t\t\t\t| column on your target grid.Your opponent checks that coordinate on their     |\n" +
                "\t\t\t\t\t\t\t\t\t\t| ocean grid and verbally responds miss if there is no ship there, or hit      |\n" +
                "\t\t\t\t\t\t\t\t\t\t| if you have correctly guessed a space that is occupied by a ship.Mark each   |\n" +
                "\t\t\t\t\t\t\t\t\t\t| of your shots or attempts to fire on the enemy using your target             |\n" +
                "\t\t\t\t\t\t\t\t\t\t| grid (upper part of the board) by using white pegs to document your misses   |\n" +
                "\t\t\t\t\t\t\t\t\t\t| and red pegs to register your hits. As the game proceeds, the red pegs will  |\n" +
                "\t\t\t\t\t\t\t\t\t\t| gradually identify the size and location of your opponent's ships.When it is |\n" +
                "\t\t\t\t\t\t\t\t\t\t| your opponent's turn to fire shots at you, each time one of your ships       |\n" +
                "\t\t\t\t\t\t\t\t\t\t| receives a hit,put a red peg into the hole on the ship corresponding to the  |\n" +
                "\t\t\t\t\t\t\t\t\t\t| grid space.When one of your ships has every slot filled with red pegs, you   |\n" +
                "\t\t\t\t\t\t\t\t\t\t| must announce to your opponent when your ship is sunk. In classic play,      |\n" +
                "\t\t\t\t\t\t\t\t\t\t| the phrase is You sunk my battleship!                                        |\n" +
                "\t\t\t\t\t\t\t\t\t\t|  The first player to sink all five of their opponent's ships wins the game.  |");
        System.out.println("\t\t\t\t\t\t\t\t\t\t+"+ANSI_BLUE+"~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~"+ "\033[39m" + "\033[49m"+"+");
        System.out.println();
        System.out.println();

    }
}
