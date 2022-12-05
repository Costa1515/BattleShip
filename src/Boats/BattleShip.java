package Boats;

public class BattleShip extends Ships {
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    private String symb = ANSI_BLUE_BACKGROUND + "X"+ "\033[39m" + "\033[49m";
    private int size = 4;

    public BattleShip() {
    }

    public BattleShip(String symb, int size) {
        this.symb = symb;
        this.size = size;
    }

    public String getSymb() {
        return symb;
    }

    public void setSymb(String symb) {
        this.symb = symb;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
