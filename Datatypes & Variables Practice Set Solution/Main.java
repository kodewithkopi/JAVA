public class Main
{
    public static void main(String[] args)
    {
        System.out.println("THE SOLTUION OF THE PRACTICE SET OF JAVA DATATYPES & VARIABLES");
        /*
         Q1] Which primitive datatype would you use to store age of a person?
         ans: byte

        Q2] Phone Numbers can be stored in which primitive?
        ans: long

        Q3] to check whether a bulb is on or off , which primitive is preferred?
        ans: boolean
        
        Q4] to solve scientific numericals with high precision, which primitive would you prefer?
        ans: double

        Q5] char primitive datatype is used to store ?
        ans: a single character.

        Q6] long or double ? which one holds the hugest number?
        ans: double

        Q7] float or double? which one is more precised?
        ans: double

        Q8] What is the difference between float and double ? how are they different when assigning them a value?
        ans: float's precision < double's precision
             float var1 = 216.3218f;
             double var2 = 262.211282d;

        Q9] Are You Enjoying the Journey?
        ans: *it is your choice*

        Q10] Did you understand what we learned? and did you solved these questions?
        ans: *it depends on you*

         */

         /*
          P1] Write a Program with Four integer Variables which stores any number. print those Four value separately using * System.out.println(""); * . 

            Hint: use each integer primitive.
          */

          // Solution P1
          System.out.println("\nP1 Solution Starts here\n");
          byte var1 = 62;
          short var2 = 31989;
          int var3 = 731877122;
          long var4 = 12736687168812L;

          System.out.println("The Value of var1 is " + var1);
          System.out.println("The Value of var2 is " + var2);
          System.out.println("The Value of var3 is " + var3);
          System.out.println("The Value of var4 is " + var4);
          
          System.out.println("\nP1 Solution Ends here\n");

          /*
           P2] Write a program that declares both double and float variables, stores the value of π (pi) up to 15 digits after the decimal point and prints it. 

            Hint: store and print this -> 3.141592653589793
           */
          //Solution P2

          System.out.println("\nP2 Solution Starts here\n");

          double meraDoublekaVariable = 3.141592653589793d;
          float meraFloatkaVariable = 3.141592653589793f;
          System.out.print("Double ka Value: " + meraDoublekaVariable + "\t" + "Float ka value: "+meraFloatkaVariable);

          System.out.println("\n\nP2 Solution Ends here\n");
           /*
            P3] Write a Program which has all eight primitives used. so far, we’ve learned about various Java data types, but boolean might not seem very useful just yet. Still, to wrap up this section, let’s do a quick hands-on recap using all the primitive data types in one place!
        
            create a variable for each Java primitive data type, assign a legal value of your choice, and print the value. For the boolean data type, declare two variables: One to store true,One to store false.

            */
            // Solution P3

            System.out.println("\nP3 Solution Starts here");

            byte wrapup1 = 31;
            short wrapup2 = 13276;
            int wrapup3 = 7618293;
            long wrapup4 = 8612878663912738L;

            float wrapup5 = 132786.13287f;
            double wrapup6 = 1379812.21378687213d;

            boolean wrapup7A = true;
            boolean wrapup7B = false;

            char wrapup8 = 'k';
            System.out.println("\nwrapup1 value : "+ wrapup1);
            System.out.println("wrapup2 value : "+ wrapup2);
            System.out.println("wrapup3 value : "+ wrapup3);
            System.out.println("wrapup4 value : "+ wrapup4);
            System.out.println("wrapup5 value : "+ wrapup5);
            System.out.println("wrapup6 value : "+ wrapup6);
            System.out.println("wrapup7A value : "+ wrapup7A);
            System.out.println("wrapup7B value : "+ wrapup7B);
            System.out.println("wrapup8 value : "+ wrapup8);

            // why we used \n in 1st print statement?
            //ans:
           
            System.out.println("\nP3 Solution Ends here\n");
            /*
             this one is optional , you may try if you wish.

            P4] Write/Modify the Program which prints Hindi Letters & Words.

            We have seen how to store & print Hindi Letters. now just try to change '\u0905' to something else like '\u8272' or '\u1722'. Note that the Range of Unicodes for Hindi letters : U+0900 to U+097F that means you can print hindi characters by using '\u0900' to '\u097F'. Just modify/change last four digits. Unicode follows Hexadecimal Number System unlike Decimal number system which we use on daily basis HexaDecimal is 16 base and contain 0 to 9 then A -> 10 , B ->11 , C -> 12 , D -> 13 , E -> 14 , F -> 15.
    Decimal : 0 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 (base10) 
HexaDecimal : 0 1 2 3 4 5 6 7 8 9  A  B  C  D  E  F (base16)
              09 10 .... 19 20 .... 99  100 109 110 199 200
              0F 10 11 12 13 .. 19 1A 1b 1c 1d 1e 1f 20 .... 2f 30
              9 of hex = 9 0f dec ? yes
              20 of hex = 20 of dec? no

           Try to Print the Following:
            1. Different Hindi Letters by changing HexaDecimal Part.
            2. Your Name in Hindi & English. kopi 
            3. A Whole Sentence in Hindi & English.
            Mai kopi hoon. 

             */
            // Solution p4
            // it won't run on vs terminal that easily use cmd(command prompt) activated with chcp 65001

            System.out.println("\nP4 Solution Starts here\n");
            
            char hindiWord1 = '\u0915' ;
            char hindiWord2 = '\u094B' ;
            char hindiWord3 = '\u092A' ;
            char hindiWord4 = '\u0940' ;
            
            char engWord1 = '\u004B';
            char engWord2 = '\u006F';
            char engWord3 = '\u0070';
            char engWord4 = '\u0069';

            System.out.println("My Name in English: " +engWord1 +engWord2+ engWord3 +engWord4);

            System.out.println("My Name in Hindi: "+ hindiWord1 + hindiWord2 + hindiWord3 + hindiWord4);

            //Mai kopi hoon.
            char engletter1 = '\u004D';
            char engletter2 = '\u0061';
            char engletter3 = '\u0069';
            char engletter4 = '\u0020';
            char engletter5 = '\u004B';
            char engletter6 = '\u006F';
            char engletter7 = '\u0070';
            char engletter8 = '\u0069';
            char engletter9 = '\u0020';
            char engletter10 = '\u0068';
            char engletter11 = '\u006F';
            char engletter12 = '\u006F';
            char engletter13 = '\u006E';
            char engletter14 = '\u002E';

            System.out.print("My English Sentence:\t");
            System.out.println("" + engletter1 + engletter2 + engletter3 + engletter4 + engletter5 + engletter6 + engletter7 + engletter8+ engletter9 + engletter10 + engletter11 + engletter12 + engletter13 + engletter14);

            // मै कोपी हुँ।
            char hindiletter1 = '\u092E';
            char hindiletter2 = '\u0948';
            char hindiletter3 = '\u0020';
            char hindiletter4 = '\u0915';
            char hindiletter5 = '\u094B';
            char hindiletter6 = '\u092A';
            char hindiletter7 = '\u0940';
            char hindiletter8 = '\u0020';
            char hindiletter9 = '\u0939';
            char hindiletter10 = '\u0941';
            char hindiletter11 = '\u0901';
            char hindiletter12 = '\u0964';

            System.out.print("My Hindi Sentence:\t");
            System.out.println("" + hindiletter1 + hindiletter2 + hindiletter3 + hindiletter4 + hindiletter5 
            +hindiletter6 + hindiletter7 + hindiletter8 + hindiletter9 + hindiletter10 + hindiletter11 + hindiletter12);

            System.out.println("\nP4 Solution Ends here\n");
            //next session will be on JAVA OPERATORS and Their Precedence & Associativity

             
    }
}