import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;


public class Main
{
    public static void main(String[] args)
    {
        // Just a Greeting print statement
        System.out.println("The Solution of The Practice Set of Operators");
        
        // Solution of P1
        System.out.println("\nTHIS IS A CALCULATOR\n");

        // Using the ready-to-bake code which takes user input via terminal
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader myReader = new BufferedReader(isr);

        // creating 2 double variables
        double num1 = 0.0d , num2 = 0.0d ;
        try
        {
            // taking input of first double variable via user
            System.out.print("Enter First Number: ");
            num1 = Double.parseDouble(myReader.readLine());

            // taking input of second double variable via user
            System.out.print("Enter Second Number: ");
            num2 = Double.parseDouble(myReader.readLine());
        }
        catch(Exception ex)
        {
            System.out.println("Error: "+ex.getMessage());
        }

        // printing the values of those 2 varibles
        System.out.println("\nFirst Number is "+ num1);
        System.out.println("Second Number is "+num2 +"\n");

        // creating more double variables for calculator
        double 
        addition = num1 + num2 , // addition variable
        subtraction = num1 - num2 , // subtraction variable
        product = num1 * num2 , // multiplication variable
        quotient = num1 / num2 , // Regular Division variable
        remainder = num1 % num2 , // Modulus division variable
        squareNum1 =  num1 * num1 , // square of num1 variable
        squareNum2 = num2*num2 , // square of num2 variable
        cubeNum1 = num1*num1*num1 , // cube of num1 variable
        cubeNum2 = num2*num2*num2 ; // cube of num2 variable

        // print statement for the calculator
        System.out.println("The Addition of "+ num1 + " and " + num2 + " is " + addition);
        System.out.println("The Subtraction of "+ num1 + " and " + num2 + " is " + subtraction);
        System.out.println("The Product of "+ num1 + " and " + num2 + " is " + product);
        System.out.println("The Quotient of "+ num1 + " and " + num2 + " is " + quotient);
        System.out.println("The Remainder of "+ num1 + " and " + num2 + " is " + remainder);

        System.out.println("\nSquare of "+num1+" is " + squareNum1);
        System.out.println("Square of "+num2+" is " + squareNum2);
        System.out.println("Cube of "+num1+" is " + cubeNum1);
        System.out.println("Cube of "+num2+" is " + cubeNum2);
        
        // Typecasting
        // char v = 'O' ;
        // int f = (int) v ; 
        // System.out.println(f);

        System.out.println("\nSOLUTION OF P2\n");
        
        // creating 2 char variables
        char char1 = 'K' , char2 = 'O' ;
        // creating boolean condition variables
        boolean cond1 = char1 == char2 ;
        boolean cond2 = char1 != char2 ;
        boolean cond3 = char1 >  char2;
        boolean cond4 = char1 >= char2 ;
        boolean cond5 = char1 <  char2;
        boolean cond6 = char1 <= char2 ;
        
        //printing the solution
        System.out.println("'"+char1+"' == '"+char2+"' is "+ cond1);
        System.out.println("'"+char1+"' != '"+char2+"' is "+ cond2);
        System.out.println("'"+char1+"'  > '"+char2+"' is "+ cond3);
        System.out.println("'"+char1+"' >= '"+char2+"' is "+ cond4);
        System.out.println("'"+char1+"'  < '"+char2+"' is "+ cond5);
        System.out.println("'"+char1+"' <= '"+char2+"' is "+ cond6);

        System.out.println("\nSOLUTION OF P3\n");

        // general true and false boolean variable
        boolean trueCond = true , falseCond = false;

        // printing the table of Logical AND Operator
        System.out.println("THE WORKING OF LOGICAL AND OPERATOR");
        System.out.println("cond1\tcond2\tAND(&&)");
        System.out.println("------------------------------");
        System.out.println(trueCond + "\t" + trueCond+ "\t" + (trueCond && trueCond));
        System.out.println(trueCond + "\t" + falseCond+ "\t" + (trueCond && falseCond));
        System.out.println(falseCond + "\t" + trueCond+ "\t" + (falseCond && trueCond));
        System.out.println(falseCond + "\t" + falseCond+ "\t" + (falseCond && falseCond));

        // printing the table of Logical OR Operator
        System.out.println("\nTHE WORKING OF LOGICAL OR OPERATOR");
        System.out.println("cond1\tcond2\tOR(||)");
        System.out.println("------------------------------");
        System.out.println(trueCond + "\t" + trueCond+ "\t" + (trueCond || trueCond));
        System.out.println(trueCond + "\t" + falseCond+ "\t" + (trueCond || falseCond));
        System.out.println(falseCond + "\t" + trueCond+ "\t" + (falseCond || trueCond));
        System.out.println(falseCond + "\t" + falseCond+ "\t" + (falseCond || falseCond));

        // printing the table of Logical NOT Operator
        System.out.println("\nThe Working of LOGICAL NOT OPERATOR");
        System.out.println("cond1\tNOT(!)");
        System.out.println("----------------------------------");
        System.out.println(trueCond + "\t" + !(trueCond));
        System.out.println(falseCond + "\t"  + !(falseCond));

        System.out.println();
    }
}