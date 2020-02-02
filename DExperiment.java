/**
 * 2DExperiment
 */
public class DExperiment {
    public static void main(String[] args) {
        int col = 5;
        int row = 5;
        int[][] exp = new int[col][row];
        exp[1][2] = 3;
        exp[2][3] = 4;
        exp[3][4] = 1;
        exp[4][4] = 3;
        exp[1][3] = 5;
        // System.out.println();
        for (int i = 0; i < col; i++) {
            for (int j = 0; j < row; j++) {
                System.out.print(exp[i][j] + " ");
            }
            System.out.print("\n");
        }


    }
}
