package DZ.DZ1.DZ5;

public class DZ04 {


    private static final int BOARD_SIZE = 8;
    private static int[] queensPositions = new int[BOARD_SIZE];
    private static int solutionCount = 0;

    public static void main(String[] args) {
        solve(0);
        System.out.println("Found " + solutionCount + " solution(s).");
    }

    private static void solve(int row) {
        
        if (row == BOARD_SIZE) {
            solutionCount++;
            printBoard();
            return;
        }

        for (int col = 0; col < BOARD_SIZE; col++) {
            
            if (isSafe(row, col)) {
                queensPositions[row] = col;
                
                solve(row+1);
            }
        }
    }

    private static boolean isSafe(int row, int col) {
        
        for (int i = 0; i < row; i++) {
            if (queensPositions[i] == col) {
                return false;
            }
            
            if (Math.abs(queensPositions[i] - col) == Math.abs(i - row)) {
                return false;
            }
        }
        return true;
    }

    private static void printBoard() {
        System.out.println("Solution " + solutionCount + ":\n");
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                if (queensPositions[row] == col) {
                    System.out.print("Q ");
                } else {
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
        System.out.println();
    }
}
