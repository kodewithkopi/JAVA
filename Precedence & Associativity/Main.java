public class Main
{
    public static void main(String[] args)
    {
        System.out.println("\nEPISODE 05B\n");
        int a = 13 + 2 * 9 - 8 / 4 ;
        /*
         EVALUATION:
          a = 13 + 2 * 9 - 8 / 4 
          a = 13 + 18 - 8 / 4 
          a = 13 + 18 - 2
          a = 31 - 2
          a = 29
         */
        System.out.println("Q1] 13 + 2 * 9 - 8 / 4 =\t" + a);


        int b = (13 + 2) * (9 - 8) / 4 ;
        /*
         EVALUATION:
          b = (13 + 2) * (9 - 8) / 4
          b = 15 * (9 - 8) / 4
          b = 15 * 1 / 4
          b = 15 / 4
          b = 3
         */
        System.out.println("Q2] (13 + 2) * (9 - 8) / 4  =\t" + b);

        boolean c = ! ((3 >= 1) || 4 + 9 != 8 - 3) ;
        /*
         EVALUATION:
          c = ! ((3 >= 1) || 4 + 9 != 8 - 3)
          c = ! (true || 4 + 9 != 8 - 3)
          c = ! (true || 13 != 8 - 3)
          c = ! (true || 13 != 5)
          c = ! (true || true)
          c = ! (true)
          c = false
         */
        System.out.println("Q3] ! ((3 >= 1) || 4 + 9 != 8 - 3) =\t"  + c);

    }
}