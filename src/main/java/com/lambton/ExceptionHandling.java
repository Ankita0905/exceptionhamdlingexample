package com.lambton;

public class ExceptionHandling
{
    public static void main(String[] args) {
        int a=100;
        int b=10;
        int c;
        String name="hello";

        int x[]={1,2,3};

        Student s1=new Student(1,"ankita jain");

        System.out.println("START");

        try {
            System.out.println(s1.toString());

            x[2]=1000;
            c = a / b;
            System.out.println("c:" +c);

            if (b!=10)
            {
                throw new ArithmeticException("do not divide by 5");
            }

            if(name.length()<10)
            {
                throw new NameLengthException("name should be of length 10");
            }
        }

        catch(ArithmeticException ae)
        {
            System.out.println(ae.toString());
           // System.out.println("Value of b=0, Divisible by zero error");
        }

        catch(ArrayIndexOutOfBoundsException aob)
        {
            System.out.println("Array x is trying to access index not available");
        }
        catch(NameLengthException nae)
        {
            System.out.println(nae.toString());
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
