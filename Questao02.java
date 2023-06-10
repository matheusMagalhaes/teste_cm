import java.util.Scanner;

public class Questao02 {

  private static Matriz matriz = new Matriz();

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Digite o número de linhas da matriz A: ");
    int rowsA = scanner.nextInt();
    System.out.print("Digite o número de colunas da matriz A: ");
    int colsA = scanner.nextInt();

    int[][] A = new int[rowsA][colsA];

    System.out.println("Digite os elementos da matriz A:");

    for (int i = 0; i < rowsA; i++) {
        for (int j = 0; j < colsA; j++) {
            A[i][j] = scanner.nextInt();
        }
    }

    System.out.print("Digite o número de linhas da matriz B: ");
    int rowsB = scanner.nextInt();
    System.out.print("Digite o número de colunas da matriz B: ");
    int colsB = scanner.nextInt();

    int[][] B = new int[rowsB][colsB];

    System.out.println("Digite os elementos da matriz B:");

    for (int i = 0; i < rowsB; i++) {
        for (int j = 0; j < colsB; j++) {
            B[i][j] = scanner.nextInt();
        }
    }

    scanner.close();

    int occurrences = matriz.countSubmatrixOccurrences(A, B);
    System.out.println("Número de ocorrências: " + occurrences);
  }
}
