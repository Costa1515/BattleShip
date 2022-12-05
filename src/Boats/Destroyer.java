package Boats;

public class Destroyer extends Ships {
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
    private String symb = ANSI_WHITE_BACKGROUND + "X" + "\033[39m" + "\033[49m";
    private int size = 2;

    public Destroyer() {
    }

    public Destroyer(String symb, int size) {
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
