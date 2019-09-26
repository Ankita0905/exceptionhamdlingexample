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
}


