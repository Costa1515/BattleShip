package Boats;

public class Carrier extends Ships {
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";

    private String symb = ANSI_CYAN_BACKGROUND + "X" + "\033[39m" + "\033[49m";
    private int size = 5;

    public Carrier() {
    }

    public Carrier(String symb, int size) {
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
