package com.lambton;

public class Student {
    int StudentId;
    String name;

    public Student()
    {
        this.StudentId=-1;
        this.name="NO NAME";
            }

    public Student(int studentId, String name) {
        StudentId = studentId;
        this.name = name;
    }
    @Override
    public void finalize()
    {
        System.out.println("i am in finalize() method");
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public void display() throws NameLengthException
    {
        if(this.name.length()<10)
        {
            throw new NameLengthException("name of small length");
        }
        else
        {
            System.out.println(StudentId);
            System.out.println(name);
        }
    }
}


