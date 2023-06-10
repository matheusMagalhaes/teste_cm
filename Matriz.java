import java.util.Scanner;

public class Matriz {

  int[][] readMatrix(int rows, int columns, int matrix[][]) {
    Scanner scan = new Scanner(System.in);
    //se diferente de zero e matriz quadrada
    if (rows != 0 && columns != 0 && rows == columns) {
      for (int x = 0; x < rows; x++) {
        for (int y = 0; y < columns; y++) {
          System.out.println("Insira um valor: ");
          int values = scan.nextInt();

          matrix[x][y] = values;
        }
      }
    }
    return matrix;
  }

  int[][] inverterDiagonal(int[][] matrix) {
    int size = matrix.length;
    for (int i = 0; i < size; i++) {
      int temp = matrix[i][i];
      matrix[i][i] = matrix[i][size - i - 1];
      matrix[i][size - i - 1] = temp;
    }
    return matrix;
  }

  public static int countSubmatrixOccurrences(int[][] A, int[][] B) {
    int count = 0;
    int rowsA = A.length;
    int colsA = A[0].length;
    int rowsB = B.length;
    int colsB = B[0].length;

    for (int i = 0; i <= rowsA - rowsB; i++) {
      for (int j = 0; j <= colsA - colsB; j++) {
        if (isSubmatrixEqual(A, B, i, j)) {
          count++;
        }
      }
    }

    return count;
  }

  private static boolean isSubmatrixEqual(
    int[][] A,
    int[][] B,
    int startRow,
    int startCol
  ) {
    int rowsB = B.length;
    int colsB = B[0].length;

    for (int i = 0; i < rowsB; i++) {
      for (int j = 0; j < colsB; j++) {
        if (A[startRow + i][startCol + j] != B[i][j]) {
          return false;
        }
      }
    }

    return true;
  }
}
