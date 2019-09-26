package com.lambton;

public class ExceptionHandling
{
    public static void main(String[] args) {
        int a=100;
        int b=10;
        int c;

        int x[]={1,2,3};

        System.out.println("START");

        try {
            x[4]=1000;
            c = a / b;
            System.out.println("c:" +c);
        }

        catch(ArithmeticException ae)
        {
            System.out.println("Value of b=0, Divisible by zero error");
        }

        catch(ArrayIndexOutOfBoundsException aob)
        {
            System.out.println("Array x is trying to access index not available");
        }

        catch(Exception e)
        {
            System.out.println(e.toString());
        }


        System.out.println("END");
    }
}
