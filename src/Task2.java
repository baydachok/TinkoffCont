import java.util.Scanner;

public class Task2 {
    public static Long[][] rotate(Long[][] originalMatrix) {
        int rows = originalMatrix.length;
        int cols = originalMatrix[0].length;

        Long[][] rotatedMatrix = new Long[cols][rows];

        for (int i = 0; i < rows; ++i) {
            for (int j = 0; j < cols; ++j) {
                rotatedMatrix[j][rows - 1 - i] = originalMatrix[i][j];
            }
        }

        return rotatedMatrix;
    }

    public static void solve() {
        Scanner scan = new Scanner(System.in);
        int numRows = scan.nextInt();
        int numCols = scan.nextInt();

        Long[][] originalMatrix = new Long[numRows][numCols];

        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                originalMatrix[i][j] = scan.nextLong();
            }
        }

        Long[][] rotatedMatrix = rotate(originalMatrix);

        for (int j = 0; j < numCols; j++) {
            for (int i = 0; i < numRows; i++) {
                System.out.print(rotatedMatrix[j][i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solve();
    }
}
