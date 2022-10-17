package com.example.SampleStaticWebpage;

public class Person {
    private String fname;
    private String lname;
    private String mname;
    private int age;

    public Person(String fname, String lname, String mname, int age) {
        this.fname = fname;
        this.lname = lname;
        this.mname = mname;
        this.age = age;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getMname() {
        return mname;
    }

    public int getAge() {
        return age;
    }
}
