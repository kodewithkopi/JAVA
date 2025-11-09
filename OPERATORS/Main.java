public class Main
{
    public static void main(String[] args)
    {
        // System.out.println("Hello, World!");
        // EPISODE 05: Introduction to Java Operators
        System.out.println("\"INTRODUCTION TO JAVA OPERATORS\""); // just for better look of output
        
        // 1. ARITHMETIC BINARY OPERATORS
        System.out.println("\n1.ARITHMETIC BINARY OPERATORS\n");
        // creating 2 int variables(operands) for integer-based operation
        int num1 = 5 , num2 = 2 ;
        System.out.println("num1 is " + num1);
        System.out.println("num2 is " + num2 + "\n");

        // 1A. Addition Operator -> +
        int sum = num1 + num2 ; // 7
        System.out.println("The Sum ("+num1+" + "+num2+") is "+sum );


        // 1B. Subtraction Operator -> -
        int minus = num1 - num2 ; // 3
        System.out.println("The Minus ("+ num1+" - "+num2+") is "+minus);

        // 1C. Multiplication Operator -> *
        int multiplication = num1 * num2 ; // 10
        System.out.println("The Multiplication ("+ num1+" * "+num2+") is "+multiplication);

        // 1D. Regular Division Operator -> / 
        // it evaluates Quotient

        // this is integer based regular Division
        int regularDivisionInt = num1 / num2 ; // 2
        System.out.println("The Integer-Based Quotient ("+num1+" / "+num2+") is "+regularDivisionInt); 

        // creating 2 double variables (operands) for decimal-point based operations
        double num3 = 5.0d , num4 = 2.0d ;
        System.out.println("\nnum3 is " + num3);
        System.out.println("num4 is " + num4 + "\n");

        // this is decimal-point based regular Division
        double regularDivisionDouble = num3 / num4 ; // 2.5
        System.out.println("the Decimal-Point Based Quotient ("+num3+" / " + num4 +") is "+regularDivisionDouble);

        // 1E. Modulus Division Operator -> %
        // it evaluates Remainder but only for Integer-Based Operations

        // this is integer-based modulus division
        int modulusDivisionInt = num1 % num2 ; // 1
        System.out.println("The Integer-Based Remainder ("+num1 +" % "+num4+") is "+modulusDivisionInt);

        // this is decimal-point based modulus division
        // it does not evaluates the remainder which is always 0
        // instead when either one or both operands are decimal-point based
        // Modulus Division Evaluates on the base of this Formula
        // a % b = a - b * floor(a / b) ;
        // floor of 2.5 is 2.0
        double modulusDivisionDouble = num3 % num4 ; // it gives 1.0 not 0
        System.out.println("The Decimal-Based Modulus Division (" +num3+ " % "+num4+") is "+ modulusDivisionDouble);

        // 2. RELATIONAL OPERATORS
        // compares operands and after comparing returns a boolean value (true or false)
        System.out.println("\n2. RELATIONAL OPERATORS");

        // 2A. Equal-to Operator -> == 
        System.out.println("\n2A. Equal-To Operator -> ==");
        
        // it checks the equality on it's both sides
        // you can give either a variable or a value
        
        boolean equalTo1 = (num1 == num2) ; // false
        boolean equalTo2 = (num1 == 5) ; // true
        boolean equalTo3 = (8 == sum) ; // false
        boolean equalTo4 = (6*3 == 18) ; //true

        // if value on the both side are same , returns true
        // if value on the both side are different , returns false

        System.out.println("\nnum1 == num2 i.e 5 == 2 is " + equalTo1);
        System.out.println("num1 == 5 i.e 5 == 5 is " + equalTo2);
        System.out.println("8 == sum i.e 8 == 7 is " + equalTo3);
        System.out.println("6*3 == 18 i.e 18 == 18 is " + equalTo4);

        // 2B. Not Equal-to Operator -> != 
        System.out.println("\n2B. Not Equal-To Operator -> ==");

        // it checks the unequality on it's both sides
        // you can give either a variable or a value
        
        boolean notEqualTo1 = (num1 != num2) ; // true
        boolean notEqualTo2 = (num1 != 5) ; // false
        boolean notEqualTo3 = (8 != num1) ; // true
        boolean notEqualTo4 = (6*3 != 18) ; //false

        // if value on the both side are different , returns true
        // if value on the both side are same , returns false

        System.out.println("\nnum1 != num2 i.e 5 != 2 is " + notEqualTo1);
        System.out.println("num1 != 5 i.e 5 != 5 is " + notEqualTo2);
        System.out.println("8 != sum i.e 8 != 7 is " + notEqualTo3);
        System.out.println("6*3 != 18 i.e 18 != 18 is " + notEqualTo4);

        //2C. Greater Than Operator -> >
        System.out.println("\n2C. GREATER THAN OPERATOR -> >");

        // it checks whether the left side value is greater/larger than the right side value or not 
        // you can give either a variable or a value

        // if left value larger than right value , returns true
        boolean greaterThan1 = (7>5); // true
        System.out.println("7 > 5 is " + greaterThan1);

        // if right value larger than left value , returns false
        boolean greaterThan2 = (5>7); // false
        System.out.println("5 > 7 is " + greaterThan2);

        // if both side value are equal , returns false
        boolean greaterThan3 = (7>7); // false
        System.out.println("7 > 7 is " + greaterThan3);


        //2D. Greater Than or Equal To Operator -> >=
        System.out.println("\n2D. GREATER THAN or EQUAL TO OPERATOR -> >=");

        // it checks whether the left side value is greater/larger than or Equal to the right side value or not 
        // you can give either a variable or a value

        // if left value larger than or same as right value , returns true
        boolean greaterThanOrEqualTo1 = (7>=5); // true
        System.out.println("7 > 5 is " + greaterThanOrEqualTo1);

        // if right value larger than or same as left value , returns false
        boolean greaterThanOrEqualTo2 = (5>=7); // false
        System.out.println("5 > 7 is " + greaterThanOrEqualTo2);

        // if both side value are equal , returns true
        boolean greaterThanOrEqualTo3 = (7>=7); // true
        System.out.println("7 >= 7 is " + greaterThanOrEqualTo3);


         //2E. Less Than Operator -> <
        System.out.println("\n2E. LESS THAN OPERATOR -> <");

        // it checks whether the left side value is less than/smaller than the right side value or not 
        // you can give either a variable or a value

        // if left value less than right value , returns true
        boolean lessThan1 = (12<18); // true
        System.out.println("12 < 18 is " + lessThan1);

        // if right value less than left value , returns false
        boolean lessThan2 = (18 < 12); // false
        System.out.println("18 < 12 is " + lessThan2);

        // if both side value are equal , returns false
        boolean lessThan3 = (18<18); // false
        System.out.println("18 < 18 is " + lessThan3);


        //2F. Less Than or Equal To Operator -> <=
        System.out.println("\n2F. LESS THAN or EQUAL TO OPERATOR -> <=");

        // it checks whether the left side value is less/smaller than or Equal to the right side value or not 
        // you can give either a variable or a value

        // if left value smaller than or same as right value , returns true
        boolean lessThanOrEqualTo1 = (12<=18); // true
        System.out.println("12 <= 18 is " + lessThanOrEqualTo1);

        // if right value smaller than or same as left value , returns false
        boolean lessThanOrEqualTo2 = (18<=12); // false
        System.out.println("18 <= 12 is " + lessThanOrEqualTo2);

        // if both side value are equal , returns true
        boolean lessThanOrEqualTo3 = (18<=18); // true
        System.out.println("18 <= 18 is " +lessThanOrEqualTo3);

        // 3. LOGICAL OPERATORS
        // it takes boolean for evaluation and returns boolean as well
        System.out.println("\n3. LOGICAL OPERATORS ");

        //3A. LOGICAL AND OPERATOR -> &&
        System.out.println("\n3A. LOGICAL AND OPERATOR -> &&");

        // if both sides are true then only it returns true
        // if either one of the side is false then it returns false

        boolean logicalAND1 = ((true) && (51>6)) ; // true
        System.out.println("true && 51>6 -> true && true -> " +logicalAND1);

        boolean logicalAND2 = ((8<19) && (51>6)) ; // false
        System.out.println("8<19 && 51>6 -> false && true -> " +logicalAND2);

        // 3B. LOGICAL OR OPERATOR -> ||
        System.out.println("\n3B. LOGICAL OR OPERATOR -> ||");

        // if both sides are false then only it returns false
        // otherwise if either of the side is true it returns true

        boolean logicalOR1 = ((false) || ('K' < 67 )); // false
        System.out.println("false || 'K' < 67 -> false || false -> " +logicalOR1);
        boolean logicalOR2 = ((true) || ('K' < 67 )); // true
        System.out.println("true || 'K' < 67 -> true || false -> " +logicalOR2);

        // 3C. LOGICAL NOT OPERATOR -> !
        // also known as LOGICAL UNARY OPERATOR
        System.out.println("\n3C. LOGICAL NOT OPERATOR -> !");

        // it takes only one boolean value.
        // it inverts the given boolean.
        // if it's true , returns false 
        // if it's false, returns true

        boolean logicalNOT1 = !(38297>8) ; // false
        System.out.println("!(38297>8) -> !true -> "+logicalNOT1);

        boolean logicalNOT2 = !(6!=6) ;
        System.out.println("!(6!=6) -> !false -> "+ logicalNOT2);

        // 4. ASSIGNMENT OPERATORS
        System.out.println("\n4. ASSIGNMENT OPERATORS");

        // 4A. SIMPLE ASSIGNMENT OPERATOR -> =
        System.out.println("\n4A. SIMPLE ASSIGNMENT OPERATOR -> =");
        // it is used for assigning the value to a variable

        // NOTE: = and == are two different operators
        // = is simple assignment operator used for assigning the value to a variable
        // == is equalto relational operator used for checking the equality of two variables/values

        int A = 6 , B = 9 ;
        int C = A + B;
        System.out.print("\nC = A + B");
        System.out.println("\tit means take the value of A ("+ A+") and the value of B ("+B+") ADD them and assign it to C (assigned "+C+")");

        //4B. COMPOUND ASSIGNMENT OPERATORS -> += -= *= /= %=
        System.out.println("\n4B. COMPOUND ASSIGNMENT OPERATORS -> += -= *= /= %=\n");

        A += 2 ; // SAME AS A = A + 2
        A -= 2 ; // SAME AS A = A - 2
        A *= 2 ; // SAME AS A = A * 2
        A /= 2 ; // SAME AS A = A / 2
        A %= 2 ; // SAME AS A = A % 2

        System.out.println("A += 2 -> A = A + 2");
        System.out.println("A -= 2 -> A = A - 2");
        System.out.println("A *= 2 -> A = A * 2");
        System.out.println("A /= 2 -> A = A / 2");
        System.out.println("A %= 2 -> A = A % 2");

        //1E. ARITHMETIC UNARY OPERATORS
        System.out.println("\n1E. ARITHMETIC UNARY OPERATORS");

        // INCREMENT MEANS ADD 1 TO THE CURRENT VALUE
        // DECREMENT MEANS SUBTRACT 1 TO THE CURRENT VALUE

        int K = 5 ;
        System.out.println("\nK is " + K);
        
        //1E. i] POST INCREMENT OPERATOR -> K++
        System.out.println("\n1E. i] POST INCREMENT OPERATOR -> K++");
        System.out.println("K++ is " + K++ + " BUT K BECOMES " + K + "\n\nK is "+K);

        //1E. ii] POST DECREMENT OPERATOR -> K--
        System.out.println("\n1E. ii] POST DECREMENT OPERATOR -> K--");
        System.out.println("K-- is " + K-- + " BUT K BECOMES " + K + "\n\nK is "+K);

        //1E. iii] PRE INCREMENT OPERATOR -> ++K
        System.out.println("\n1E. iii] PRE INCREMENT OPERATOR -> ++K");
        System.out.println("++K is " + ++K + " BUT K BECOMES " + K + "\n\nK is "+K);

        //1E. iv] PRE DECREMENT OPERATOR -> --K
        System.out.println("\n1E. iv] PRE DECREMENT OPERATOR -> --K");
        System.out.println("--K is " + --K + " BUT K BECOMES " + K + "\n\nK is "+K);
        
        

    }
}