package task5;

/**
 * Created by kpkshke on 26.06.17.
 * Task5 in intro module.
 */
public class Main {
    public static void main(String[] args) {
        int n = 10; // size of matrix
        int[][] Matrix = new int[n][];

        // creating Matrix
        for (int i = 0; i < n; i++) {
            Matrix[i] = new int[n];
        }

        // filling matrix with ones
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++) {
                if (i == j || (n - i - 1) == j) {
                    Matrix[i][j] = 1;
                }
            }

        // printing result
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
