import Boats.*;

import java.util.Scanner;

public class Player {
    Scanner scanner = new Scanner(System.in);
    Board board = new Board();
    public static final String ANSI_RED = "\u001B[41m";
    public static final String ANSI_GREEN = "\u001B[42m";



    public void add(Ships ships, String[][] player, String[][] tactical) {
        int col;
        int line;
        String direction;
        while (true) {
            System.out.print("\t\t\t\t\tChoose column: ");
            col = board.letterToNumber(scanner.next());
            System.out.print("\t\t\t\t\tChoose line: ");
            line = scanner.nextInt() - 1;
            System.out.print("\t\t\t\t\tChoose direction(H|R): ");
            direction = scanner.next();
            if (direction.equals("V".toUpperCase())) {
                for (int j = 0; j < ships.getSize(); j++) {
                    player[line + j][col] = ships.getSymb();
                }
                Board.createMap(player,tactical);
                break;
            }
            if (direction.equals("R".toUpperCase())) {
                for (int i = 0; i < ships.getSize(); i++) {
                    player[line][col + i] = ships.getSymb();
                }
                Board.createMap(player, tactical);
                break;
            }
        }
    }

    public void setBoats(String [][]player, String[][]tactical){
        Ships battleShip = new BattleShip();
        Ships carrier = new Carrier();
        Ships cruiser = new Cruiser();
        Ships submarine = new Submarine();
        Ships destroyer = new Destroyer();

        add(destroyer,player,tactical);
        add(submarine,player,tactical);
        add(cruiser,player,tactical);
        add(battleShip,player,tactical);
        add(carrier,player,tactical);

        Board.createMap(player,tactical);
    }


    public void attack(String[][]player, String[][]tactical){
        int col;
        int line;
        System.out.print("\t\t\t\t\tChoose column: ");
        col = board.letterToNumber(scanner.next());
        System.out.print("\t\t\t\t\tChoose line: ");
        line = scanner.nextInt() - 1;
        while (true) {
            if (!player[line][col].equals(" ")) {
                tactical[line][col] = ANSI_GREEN + "X"+ "\033[39m" + "\033[49m";
                Board.createMap(player, tactical);
                break;
            }
            if (player[line][col].equals(" ")){
                tactical[line][col]= ANSI_RED +"X"+ "\033[39m" + "\033[49m";

            }


        }
    }
}
