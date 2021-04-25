import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);
    //System.out.println("Enter length of base: ");
    int base = in.nextInt();
    for (int i = base; i > 0; i--){
      String line = "";
      for (int x = i; x > 0; x--){
          line += "*";
      }
      System.out.println(line);
    }
  }
}

