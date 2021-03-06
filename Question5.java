import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    //System.out.println("Enter number of integers: ");
    int num = in.nextInt();
    ArrayList<Integer> numlist = new ArrayList<>();

    while (num > 0) {
      //System.out.println("Enter integer: ");
      int inte = in.nextInt();
      num -= 1;
      numlist.add(inte);
    }
    int h_occ_num = 0;
    int numocc = 0;
    for (int x : numlist){
      int count = 0;
      //int test = 0;
      for (int i : numlist){
        if (i == x){
          count += 1;
        }
      }
      if (count > numocc){
        h_occ_num = numlist.get(x);
        numocc = count;
      }
    }
    System.out.println(h_occ_num);
  }
}
