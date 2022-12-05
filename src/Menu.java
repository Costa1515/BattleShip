import java.util.Scanner;


public class Menu {

    Scanner scanner = new Scanner(System.in);
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_YELLOW = "\u001B[33m";


    public Menu() throws InterruptedException {
        Grid grid = new Grid();
        Player game2 = new Player();
        Player game = new Player();
        int menuprin = 1;
        int statusMenu = 0;
        int player;
        int gameMode;

        switch (menuprin) {
            case 1:
                System.out.println();
                System.out.println("\n" +
                        "               ▀█████████▄     ▄████████     ███         ███      ▄█          ▄████████" + ANSI_BLUE + "   ▄████████    ▄█    █▄     ▄█     ▄███████▄" + "\033[39m" + "\033[49m" + "\n" +
                        "                 ███    ███   ███    ███ ▀█████████▄ ▀█████████▄ ███         ███    ███" + ANSI_BLUE + "  ███    ███   ███    ███   ███    ███    ███" + "\033[39m" + "\033[49m" + "\n" +
                        "                 ███    ███   ███    ███    ▀███▀▀██    ▀███▀▀██ ███         ███    █▀ " + ANSI_BLUE + "  ███    █▀    ███    ███   ███▌   ███    ███" + "\033[39m" + "\033[49m" + "\n" +
                        "                ▄███▄▄▄██▀    ███    ███     ███   ▀     ███   ▀ ███        ▄███▄▄▄    " + ANSI_BLUE + "  ███         ▄███▄▄▄▄███▄▄ ███▌   ███    ███" + "\033[39m" + "\033[49m" + "\n" +
                        "               ▀▀███▀▀▀██▄  ▀███████████     ███         ███     ███       ▀▀███▀▀▀    " + ANSI_BLUE + "▀███████████ ▀▀███▀▀▀▀███▀  ███▌ ▀█████████▀  " + "\033[39m" + "\033[49m" + "\n" +
                        "                 ███    ██▄   ███    ███     ███         ███     ███         ███    █▄ " + ANSI_BLUE + "         ███   ███    ███   ███    ███       " + "\033[39m" + "\033[49m" + "\n" +
                        "                 ███    ███   ███    ███     ███         ███     ███▌    ▄   ███    ███" + ANSI_BLUE + "   ▄█    ███   ███    ███   ███    ███       " + "\033[39m" + "\033[49m" + "\n" +
                        "               ▄█████████▀    ███    █▀     ▄████▀      ▄████▀   █████▄▄██   ██████████" + ANSI_BLUE + "  ▄████████▀   ███    █▀    █▀    ▄████▀     " + "\033[39m" + "\033[49m" + "\n" +
                        "                                                                 ▀                                                                    \n");

                for (int i = 0; i <= 50; i++) {
                    System.out.print("\t\t\t\t\t\t\t\t\t\t\t  [");
                    for (int k = 0; k < i; k++) {
                        System.out.print("#");
                    }
                    for (int j = 50; j > i; j--) {
                        System.out.print("-");
                    }
                    System.out.print("] " + (i + i) + "% ");
                    Thread.sleep(30);
                    System.out.print("\r");
                }

                Thread.sleep(500);
                System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  [PRESS ENTER] ");
                scanner.nextLine();
                break;

        }
        do {
            System.out.println("\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   ╔╗ ┌─┐┌┬┐┌┬┐┬  ┌─┐" + ANSI_BLUE + "╔═╗┬ ┬┬┌─┐" + "\033[39m" + "\033[49m" + "\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   ╠╩╗├─┤ │  │ │  ├┤ " + ANSI_BLUE + "╚═╗├─┤│├─┘" + "\033[39m" + "\033[49m" + "\n" +
                    "\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t   ╚═╝┴ ┴ ┴  ┴ ┴─┘└─┘" + ANSI_BLUE + "╚═╝┴ ┴┴┴  " + "\033[39m" + "\033[49m" + "\n");

            System.out.println("\t\t\t\t\t\t\t\t\t\t\t" + ANSI_BLUE + "  ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~" + "\033[39m" + "\033[49m");
            System.out.println("\n\t\t\t\t\t\t\t\t\t\t\t                         +~~~~~~~~~+~~~+                           ");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t                         | Play    | 1 |                           ");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t                         +~~~~~~~~~+~~~+                          ");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t                         | Help    | 2 |                          ");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t                         +~~~~~~~~~+~~~+                   ");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t                         | Quit    | 0 |                ");
            System.out.println("\t\t\t\t\t\t\t\t\t\t\t                         +~~~~~~~~~+~~~+              ");
            System.out.print("\n\t\t\t\t\t" +
                    "Choose: ");
            player = scanner.nextInt();
            System.out.println();

            while (player != 1 && player != 2 && player != 0) {
                System.out.println(ANSI_RED_BACKGROUND + "ERROR!!!!" + "\033[39m" + "\033[49m");
            }

            switch (player) {
                case 1:
                    if (player == 1) {
                        System.out.println("                           " + ANSI_BLUE + "---------------------------------------------->" + "\033[39m" + "\033[49m" + " Player1 " + ANSI_BLUE + "<----------------------------------------------" + "\033[39m" + "\033[49m");
                        grid.check();
                        Board.createMap(grid.playerBoard, grid.tacticalBoard);
                        game.setBoats(grid.playerBoard, grid.tacticalBoard);

                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();

                        System.out.println("                           " + ANSI_YELLOW + "---------------------------------------------->" + "\033[39m" + "\033[49m" + " Player2 " + ANSI_YELLOW + "<----------------------------------------------" + "\033[39m" + "\033[49m");
                        grid.check();
                        Board.createMap2(grid.playerBoard2, grid.tacticalBoard2);
                        game2.setBoats(grid.playerBoard2, grid.tacticalBoard2);

                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println();
                        System.out.println("\n" + ANSI_BLUE + "\n" +
                                "\t\t\t\t\t\t\t\t\t\t\t  ███████╗████████╗ █████╗ ██████╗ ████████╗    ██╗\n" +
                                "\t\t\t\t\t\t\t\t\t\t\t  ██╔════╝╚══██╔══╝██╔══██╗██╔══██╗╚══██╔══╝    ██║\n" +
                                "\t\t\t\t\t\t\t\t\t\t\t  ███████╗   ██║   ███████║██████╔╝   ██║       ██║\n" +
                                "\t\t\t\t\t\t\t\t\t\t\t  ╚════██║   ██║   ██╔══██║██╔══██╗   ██║       ╚═╝\n" +
                                "\t\t\t\t\t\t\t\t\t\t\t  ███████║   ██║   ██║  ██║██║  ██║   ██║       ██╗\n" +
                                "\t\t\t\t\t\t\t\t\t\t\t  ╚══════╝   ╚═╝   ╚═╝  ╚═╝╚═╝  ╚═╝   ╚═╝       ╚═╝\n" +
                                "\t\t\t\t\t\t\t\t\t\t\t                                                   \n" + "\033[39m" + "\033[49m");
                        while (true) {
                            System.out.println("Fɪʀsᴛ ᴘʟᴀʏᴇʀ ");
                            Board.createMap(grid.playerBoard, grid.tacticalBoard);
                            game.attack(grid.playerBoard2, grid.tacticalBoard);
                            System.out.println("Sᴇᴄᴏɴᴅ ᴘʟᴀʏᴇʀ ");
                            Board.createMap2(grid.playerBoard2, grid.tacticalBoard2);
                            game2.attack(grid.playerBoard, grid.tacticalBoard2);
                        }
                    }
                    break;

                case 2:
                    Helper helper = new Helper("help");
                    helper.toString();
                    statusMenu = 1;
                    System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t  [PRESS ENTER] ");
                    System.out.println("\n\n");
                    scanner.nextLine();
                    break;
                case 0:
                    System.exit(0);
                    statusMenu = 0;
                    break;


            }


        } while (statusMenu != 0);
    }
}
