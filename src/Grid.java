public class Grid {
    String playerBoard[][] = new String[10][10];
    String tacticalBoard[][] = new String[10][10];
    String playerBoard2[][] = new String[10][10];
    String tacticalBoard2[][] = new String[10][10];

    public void check() {
        for (int i = 0; i < playerBoard.length; i++) {
            for (int j = 0; j < playerBoard[i].length; j++) {
                playerBoard[i][j] = " ";
            }
        }
        for (int i = 0; i < tacticalBoard.length; i++) {
            for (int j = 0; j < tacticalBoard[i].length; j++) {
                tacticalBoard[i][j] = " ";
            }
        }
        for (int i = 0; i < playerBoard2.length; i++) {
            for (int j = 0; j < playerBoard2[i].length; j++) {
                playerBoard2[i][j] = " ";
            }
        }
        for (int i = 0; i < tacticalBoard2.length; i++) {
            for (int j = 0; j < tacticalBoard2[i].length; j++) {
                tacticalBoard2[i][j] = " ";
            }
        }
    }
}
