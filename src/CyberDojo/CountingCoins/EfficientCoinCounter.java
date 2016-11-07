package CyberDojo.CountingCoins;

import java.util.Scanner; // initialize scanner


public class EfficientCoinCounter
{

/*
Efficiency:
1) no need for counting pennies 1-4
2) should exit loop if total > 100
*/

  public static void main( String[] args )
  {
    int combinations = 0;
    int q = 0, d = 0, n = 0, p = 0;
    
    for (q = 0; (q * 25) <= 100; q++)
    {
      for (d = 0; (q * 25) + (d * 10) <= 100; d++)
      {
        for (n = 0; (q * 25) + (d * 10) + (n * 5) <= 100; n++)
        {
           p = 100 - ((q * 25) + (d * 10) + (n * 5));

            System.out.printf("%d Quarters, %d Dimes, %d Nickels, %d Pennies", q, d, n, p);
            System.out.println();
            combinations++;
          
        } // end end nickel
      } // end dime
    } // end quarter
    System.out.println();
    System.out.printf("There were %d combinations. ", combinations);
  } // end method main

} // end class PythagoreanTriple