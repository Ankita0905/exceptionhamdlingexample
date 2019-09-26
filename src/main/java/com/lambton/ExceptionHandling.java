package com.lambton;

public class ExceptionHandling
{
    public static void main(String[] args) {
        int a=100;
        int b=0;
        int c;

        int x[]={1,2,3};

        Student s1=new Student(1,"ankita jain");

        System.out.println("START");

        try {
            System.out.println(s1.toString());

            x[2]=1000;
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

        finally {
            System.out.println("i am in finally block");
        }

       System.out.println("END");
        s1=null;
        System.gc();

    }

}
