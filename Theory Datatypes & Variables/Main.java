public class Main
{
    public static void main(String[] args)
    {   
        
        //Java Course: KodeWithKopi -> practice set of "Introduction to Java Datatypes & Variables +  Primitive"
        System.out.println("JAVA DATATYPES & VARIABLES\n");
        
        // Integer Primitives
        byte var1 = 125;
        short var2 = 32767;
        int var3 = 2128527343;
        long var4 = 99328112479289412L;

        System.out.println("var1(byte) value: " + var1);
        System.out.println("var2(short) value: " + var2);
        System.out.println("var3(int) value: " + var3);
        System.out.println("var4(long) value: " + var4);

        // Decimal-Point Primitives
        float var5 = 193.5678452f;
        double var6 = 193.5678452d;

        System.out.println("var5(float) value: " + var5);
        System.out.println("var6(double) value: " + var6);

        // Non-Numeric Primitive : boolean
        boolean var7 = true;
        boolean var8 = false;

        System.out.println("var7(boolean) value: " + var7);
        System.out.println("var8(boolean) value: " + var8);

        // Multiple Declaration
        boolean var9 = false , var10 = true , var11;
        
        System.out.println("var9(boolean) value: " + var9);
        System.out.println("var10(boolean) value: " + var10);

        // below print statement will give error since var11 is not initialized we cannot use it.
        // initialization : when a variable is assigned a value for first time during or after declaration.
        
        //System.out.println("var11(boolean) value: " + var11);
        
        
        
        
        // Non-Numeric Primitive: char aka Character
        
        // char assigned a character directly by typing it
        char var12 = 'k';
        System.out.println("var12(char) value: " + var12);
        
        // char assigned a character by using Unicode
        char var13 = '\u006B';
        System.out.println("var13(char) value: " + var13);

        
        
        System.out.println("\n");
    }
}