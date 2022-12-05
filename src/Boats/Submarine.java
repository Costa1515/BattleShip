package Boats;

public class Submarine extends Ships {
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    private String symb = ANSI_PURPLE_BACKGROUND +  "X"+ "\033[39m" + "\033[49m";
    private int size = 3;

    public Submarine() {
    }

    public Submarine(String symb, int size) {
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

