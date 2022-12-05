package Boats;

public class Cruiser extends Ships{
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";

    private String symb = ANSI_YELLOW_BACKGROUND + "X"+ "\033[39m" + "\033[49m";
    private int size = 3;

    public Cruiser() {
    }

    public Cruiser(String symb, int size) {
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
