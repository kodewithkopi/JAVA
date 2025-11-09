public class Main
{
    public static void main(String[] args)
    {
        // PRACTICE SET OF EPISODE 05 PART 02 : JAVA OPERATOR'S PRECEDENCE & ASSOCIATIVITY.
        System.out.println("\nEPISODE 06B: SOLUTION OF EPO5B'S PRACTICE SET\n");

// Below are 10 One Word-Sentence Quick Questions to revise your learning about java operator's precedence & associativity:

        // Q1] operation
        int a = 5;
        int b = 10;
        int c = 2;
        int result1 = a + b / c * a; // 30
/* 
Q1] Predict the Output of the following Java Code Snippet
// Snippet - a small token code 
        int a = 5;
        int b = 10;
        int c = 2;
        int result1 = a + b / c * a;
        System.out.println(result1);

        Precedence & Associativity: 
            * / -> 4 l-r
            +   -> 5 l-r
            =   -> 10 r-l

            Evaluation:
             STEP01] int result1 = a + b / c * a; 
            operators left:  * / + =

             STEP02] int result1 = 5 + 10 / 2 * 5;
             plugged-in all the values
            operators left:  * / + =

             STEP03] int result1 = 5 + 5 * 5;
             / operator evaluated
              operators left:  *  + =

              STEP04] int result1 = 5 + 25;
              * operator evaluated
              operators left:    + =
             
              STEP05] int result1 = 30;
              + operator evaluated
              operators left:  =

              STEP06] int result1 = 30;
              = operator assigned the value
              operators left : none
       */
      // Q1] print statement
      System.out.println("Q1] a + b / c * a -> "+"5 + 10 / 2 * 5 -> "+result1+"\n");

        // Q2] operation
        int x = 4;
        x += 3 * 2 + 1; // 11
/* 
Q2] Predict the Output of the following Java Code Snippet
            int x = 4;
            x += 3 * 2 + 1;
            System.out.println(x);

        Precedence & Associativity: 
            * / -> 4 l-r
            +   -> 5 l-r
            +=   -> 10 r-l

            Evaluation:
             STEP01]  x += 3 * 2 + 1 ;
            operators left:  * + +=

             STEP02]  x += 6 + 1 ;
            * operator evaluated
            operators left: + +=

              STEP03]  x += 7 ;
              + operator evaluated
            operators left: +=

              STEP04] x = 11
              += operator evaluated and assigned the value(11) to x
              operators left: none
      
       */
      // Q2] print statement
      System.out.println("Q2] x(4) += 3 * 2 + 1 -> "+x+"\n");

        // Q3] operation
        boolean result2 = !(true && false) || !false; // dead code , it's true
/* 
Q3] Predict the Output of the following Java Code Snippet
            boolean result2 = !(true && false) || !false;
            System.out.println(result2);

        Precedence & Associativity: 
            ()  -> 1 l-r
            !   -> 3  r-l
            &&  -> 8 l-r
            ||  -> 9 l-r
            =   -> 10 l-r

            Evaluation:
             STEP01] result2 = !(true && false) || !false;
            operators left:  () !(right-most) !(left-most) && || =

             STEP02]  result2 = !(true && false) || true;
            right most ! evaluated

            ALWAYS REMEMBER !!
            reason: the expression has Logical Not Operator which is nothing but an unary operator and as the rule java compiler always solve unary operators first and alongwith that plugging-in the value to the variables used in the expression. these two are the first priority of every java expression before beginning the evaluation.
            we learnt about two unary kinds of operators , right? 1. Logical NOT while 2. Arithmetic Unarys (increments & decrements)
            when there are logical not operator then the flow of plug-in (solving of NOTs) is always right to left as per the associativity. but when it's arithmetic unary's then the plug-in (solving of k++ k-- ++k --k) is always left to right.
            
            operators left:  () !(left-most) && ||  =
            
            STEP03]  result2 = !false || true;
            () alongwith && evaluated for solving !(LEFT-MOST)
            operators left : !(left-most)  || =

            STEP04]  result2 = true || true;
            !(LEFT-MOST) evaluated
            operators left :  || = 
            
            STEP05]  result2 = true;
            || evaluated
            operators left :  =

            STEP06]  result2 = true;
            = assigned true in result2
      
       */
      // Q3] print statement
      System.out.println("Q3] !(true && false) || !false -> "+result2+"\n");

      // Q4] print statement
        int u = 7 ;
        int v = u++ + ++u ; //16
  /*
      Q4] Predict the Output of the following Java Code Snippet
        int u = 7;
        int v = u++ + ++u;
         System.out.println("u is " + u + " and v is " + v);

         PRECEDENCE & ASSOCIATIVITY:
         here are unary arithmetic operators so first of all the plugin of values occur and associativity would be left to right

         EVALUATION:
         STEP01] v = u++ + ++u ;
         operators left : + =

         STEP02] v = 7 + ++u ;
         u becomes 8 and plug-in initiated
         operators left : + =

         STEP03] v = 7 + 9 ;
         u becomes 9 and plug-in ended
         operators left : + =

         STEP04] v = 16 ;
         + operator evaluated
         operators left :  =

         STEP05] v = 16 ;
         = operator assigned the value(16) to the variable v
   */
      // Q4] print statement
        System.out.println("Q4] v = u++ + ++u -> u = " + u + " v = "+ v + "\n");

        // Q5] operation
        int a1 = 2, b1 = 3, c1 = 4;
        int result3 = a1 + b1 * c1 - b1 / a1; // 13
        /*
         Q5] Predict the Output of the following Java Code Snippet
          int a1 = 2, b1 = 3, c1 = 4;
          int result3 = a1 + b1 * c1 - b1 / a1;
          System.out.println("Result: " + result3);

          OPERATORS: = + * - /
          PRECEDENCE: /*  +- =
          EVALUATION:
          1] result3 = a1 + b1 * c1 - b1 / a1 ;
          2] result3 = 2 + 3 * 4 - 3 / 2 ;
          3] result3 = 2 + 12 - b1 / a1 ;
          4] result3 = 2 + 12 - 1 ;
          5] result3 = 14 - 1 ;
          6] result3 = 13 ;
         */
      // Q5] print statement
      System.out.println("Q5] a1 + b1 * c1 - b1 / a1 -> 2 + 3 * 4 - 3 / 2 -> " + result3 + "\n");

      // Q6] operation
         int x1, y1, z1;
        x1 = y1 = z1 = 10; // x1 = 10 y1 = 10 z1 = 10
        x1 += y1 -= z1; // (x1 = 10 y1 = 0 z1 = 10)
        /*
         Q6] Predict the Output of the following Java Code Snippet
        int x1, y1, z1;
        x1= y1 = z1 = 10;
        x1 += y1 -= z1;
        System.out.println(x1 + " " + y1 + " " + z1);

          OPERATORS 1: =(3)
          PRECEDENCE: same & right to left associativity
          EVALUATION:
          1] x1= y1 = z1 = 10 
          2] x1 = y1 = z1  (z1 becomes 10)
          3] x1 = y1  (y1 becomes 10)
          4] (x1 becomes 10)

          OPERATORS 2: += -=
          PRECEDENCE: same & right to left associativity
          EVALUATION:
          1] x1 += y1 -= z1 (x1 = 10 y1 = 10 z1 = 10 )
          2] x1 += y1 (x1 = 10 y1 = 0 z1 = 10 )
          3] (x1 = 10 y1 = 0 z1 = 10)
         */
      // Q6] print statement
      System.out.println("Q6] x1 = y1 = z1 = 10 -> (x1 = 10 y1 = 10 z1 = 10 )\n\tx1 += y1 -= z1 -> " + result3 + "\n");

       // Q7] operation
         boolean a2 = true, b2 = false, c2 = true; 
         boolean result4 = a2 && b2 || c2 && !b2; // true
        /*
         Q7] Predict the Output of the following Java Code Snippet
          boolean a2 = true, b2 = false, c2 = true; 
         boolean result4 = a2 && b2 || c2 && !b2;
         System.out.println("Result: " + result4);

          OPERATORS : = && || && !
          PRECEDENCE: !(plug in) &&(2 -> l-r) || =
          EVALUATION:
          1] result4 = a2 && b2 || c2 && !b2
          2] result4 = true && false || true && !fasle
          3] result4 = true && false || true && true
          4] result4 = false || true && true
          5] result4 = false || true
          6] result4 = true
         */
      // Q7] print statement
      System.out.println("Q7] a2 && b2 || c2 && !b2 -> true && false || true && !fasle -> " + result4 + "\n");

      // Q8] operation
         int a3 = 5; 
        int b3 = ++a3 + a3++ + --a3; //a3 = 6 b3 = 18 
        /*
         Q8] Predict the Output of the following Java Code Snippet
          int a3 = 5; 5
        int b3 = ++a3 + a3++ + --a3;
         System.out.println("a = " + a3 + ", b3 = " + b);;

          OPERATORS : = Unary's + =
          PRECEDENCE: Unary's(plug-in) + =
          EVALUATION:
          1] b3 = ++a3 + a3++ + --a3;
          2] b3 = 6 + a3++ + --a3;
          3] b3 = 6 + 6 + --a3;
          4] b3 = 6 + 6 + 6;
          5] b3 = 12 + 6;
          6] b3 = 18;
          a3 becomes 6 b3 becomes 18
         */
      // Q8] print statement
      System.out.println("Q8] b3 = ++a3 + a3++ + --a3 ->  a3 = " + a3 +" b3 = "+ b3 + "\n");

      // Q9] operation
         int a4, b4, c4;
        a4 = b4 = c4 = 6;
        a4 += b4 *= c4;
        /*
         Q9] Predict the Output of the following Java Code Snippet
          int a4, b4, c4;
        a4 = b4 = c4 = 6;
        a4 += b4 *= c4;
        System.out.println(a4 + " " + b4 + " " + c4);
          
        OPERATORS 1: = (3) 
          PRECEDENCE: same & associativity l-r
          EVALUATION:
          1]a4 = b4 = c4 = 6; 
          2]a4 = b4 = c4 (c4 becomes 6)
          3]a4 = b4(c4 becomes 6 b4 becomes 6)
          4](c4 becomes 6 b4 becomes 6 a4 becomes 6)

          OPERATORS 2 : += *=
          PRECEDENCE: same & associativity right to left
          EVALUATION
          1] a4 += b4 *= c4; (a4 = 6 b4 = 6 c4 = 6)
          2] a4 += b4 ; (a4 = 6 b4 = 36 c4 = 6)
          3] (a4 = 42 b4 = 36 c4 = 6)
         */
      // Q9] print statement
      System.out.println("Q9] a4 = b4 = c4 = 6 -> (a4 = 6 b4 = 6 c4 = 6 )\n\ta4 += b4 -= c4 -> a4 = " + a4 +" b4 = "+ b4+" c4 = "+ c4 + "\n");

      // Q10] operation
      double modulo1 = 32 % 7 ; // 4.0
        double modulo2 = 32.0 % 7 ; // 4.0
        double regulo1 = 67 / 4 ; // 16.0
        double regulo2 = 67.0 / 4 ; // 16.75
      /*
       Q10] Predict the Output of the following Java Code Snippet
        double modulo1 = 32 % 7 ; 
        double modulo2 = 32.0 % 7 ;
        double regulo1 = 67 / 4 ;
        double regulo2 = 67.0 / 4 ;
        System.out.println( "the modulo1 = " + modulo1);
        System.out.println( "the modulo2 = " + modulo2);
        System.out.println( "the regulo1 = " + regulo1);
        System.out.println( "the regulo2 = " + regulo2);

        there's no need to bother with associaitivity here.
        modulo 1 = 4.0
        modulo 2 = 4.0
        regulo 1 = 16.0
        regulo 2 = 16.75
       */

       // Q10] print statement
       System.out.println("Q10] 32 % 7 = "+ modulo1 + " 32.0 % 7 = "+modulo2 + " 67 / 4 = "+ regulo1 + " 67.0 / 4 = "+ regulo2);

       
// Q11] Predict the output of the following Java code snippet:
//         int x = 4, y = 2;
//         int result = x * y + x / y - y;
//         System.out.println(result);
        int x3 = 4, y3 = 2;
        int result5 = x3 * y3 + x3 / y3 - y3;
        // result5 = 4 * 2 + 4 / 2 - 2
        // result5 = 8 + 4 / 2 - 2
        // result5 = 8 + 2 - 2
        // result5 = 10 - 2
        // result5 = 8
        System.out.println("\nQ11] 4 * 2 + 4 / 2 - 2 = "+ result5);

        // Q12] Predict the output of the following Java code snippet:
        // int a5 = 8;
        // int b5 = a5++ + ++a5 + a5;
        // System.out.println("a5 = " + a5 + ", b5 = " + b5);
       int a5 = 8;
       System.out.print("\nQ12] a5 = "+ a5);
      int b5 = a5++ + ++a5 + a5;
        // b5 = a5++ + ++a5 + a5
        // b5 = 8 + ++a5 + a5
        // b5 = 8 + 10 + a5
        // b5 = 8 + 10 + 10
        // b5 = 18 + 10
        // b5 = 28
        System.out.println(" b5 = a5++ + ++a5 + a5 = "+ b5);

      // Q13] Predict the output of the following Java code snippet:
      // boolean x5 = true, y5 = false;
      //   boolean result = !(x5 || y5) && (x5 && !y5);
//         System.out.println(result);
         boolean x5 = true, y5 = false;
        boolean result6 = !(x5 || y5) && (x5 && !y5);
        // result6 = !(x5 || y5) && (x5 && !y5)
        // result6 = !(x5 || y5) && (x5 && !false)
        // result6 = !(x5 || y5) && (true && !false)
        // result6 = !(x5 || false) && (true && !false)
        // result6 = !(true || false) && (true && !false)
        // result6 = !(true || false) && (true && true)
        // result6 = !(true) && (true && true)
        // result6 = false && (true && true)
        // result6 = false && true
        // result6 = false
        System.out.println("\nQ13] !(true || false) && (true && !false) = "+ result6);

        // Q14
         int num = 5;
        int output = num++ * 2 + --num;
        System.out.println("\nQ14] num = " + num + ", output = " + output);
        
        // Q15
        int a6 = 1, b6 = 2, c6 = 3;
        int res = a6 + b6 * c6 / a6 % b6;
        System.out.println("\nQ15] res = " + res);

        // Q16
        int p = 4;
        p *= 3 + 2;// p = p * 3 + 2
        System.out.println("\nQ16] p = " + p);
        
        // Q17
        double d = 5.0 % 2; // 1.0
        int i = 5 % 2; // 1
        System.out.println("\nQ17] d: " + d + ", i: " + i);
        
        // Q18
        int x8 = 5;
        boolean check = x++ == 5 && ++x8 == 7;
        System.out.println("\nQ18] x8 = " + x8 + ", check = " + check);

        // Q19
        int a7 = 10, b7 = 3;
        System.out.println("\nQ19] "+a7 / b7 * b7 + a7 % b7);

        // Q20
        int a8 = 2, b8 = 4;
        a8 += b8 -= a8;
        System.out.println("\nQ20] "+ a8 + " " + b8);

        // Q21
        int a9 = 3, b9 = 4, c9 = 5;
        int result = a9++ + --b9 * c9-- / ++a9 % b9;
        System.out.println("\nQ21] a9 = " + a9 + ", b9 = " + b9 + ", c9 = " + c9 + ", result = " + result);

        // Q22
        boolean x9 = true, y9 = false, z9 = true;
        boolean result7 = x9 && y9 || !x9 && z9 || !(y9 || z9);
        System.out.println("\nQ22] Result7: " + result7);
        
        // Q23
        int x10 = 2, y10 = 3;
        x10 = x10++ + ++x10 * --y10 - y10--;
        System.out.println("\nQ23] x10 = " + x10 + ", y10 = " + y10);

        
        // Q24
        int a10 = 2;
        a10 += a10++ * a10 + ++a10;
        System.out.println("\nQ24] a10 = " + a10);

        // Q25
        int val = 5;
        double result8 = val++ + 3 * 2.5 - ++val % 2;
        System.out.println("\nQ25] val = " + val + ", result8 = " + result8);

        System.out.println();
    }
}