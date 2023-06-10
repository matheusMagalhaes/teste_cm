import java.util.Scanner;

public class Questao01 {

  private static Matriz matriz = new Matriz();

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.print("quantas linhas? ");
    int rows = scan.nextInt();
    System.out.print("Quantas colunas? ");
    int columns = scan.nextInt();
    int[][] matrix = new int[rows][columns];

    matrix = matriz.readMatrix(rows, columns, matrix);
    System.out.println("Matriz normal:");
    for (int x = 0; x < rows; x++) {
      for (int y = 0; y < columns; y++) {
        System.out.print(matrix[x][y] + " ");
      }
      System.out.println();
    }
    int invertido[][] = matriz.inverterDiagonal(matrix);
    System.out.println("Matriz invertida:");
    for (int x = 0; x < rows; x++) {
      for (int y = 0; y < columns; y++) {
        System.out.print(invertido[x][y] + " ");
      }
      System.out.println();
    }
  }
}
