import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    int[][] mat = {
      {1, 2, 3},
      {4, 5},
      {6, 7, 8, 9}
      {7, 2}
      {2, 4, 5, 6, 9}
    };
    sumOfDiag(mat);
    productTablePrint(productTable(3, 3));
  }


  public static int sumOfDiag(int[][] matrix)
  {
    int diagDex = 0; 
    int sum = 0;
    for (int arrNum = 0; arrNum < matrix.length; arrNum++)
    {
      if (diagDex < matrix[arrNum].length)
      {
        sum += matrix[arrNum][diagDex];
      }
      diagDex++;
    }
    return sum;
  }

  public static int[][] productTable(final int numRows, final int numCols)
  {
    int[][] table = new int[numRows][numCols];

    for (int i = 0; i < numRows; i++) 
    {
      for (int j = 0; j < numCols; j++) 
      {
          table[i][j] = (i) * (j);  
      }
    }
  }
}
public static void productTablePrint(int[][] table)
{
    for (int i = 0; i < table.length; i++) 
    {
      for (int j = 0; j < table[i].length; j++) 
      {
          System.out.print(table[i][j] + "\t");
      }
      System.out.println();
    }
}
