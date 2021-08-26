package com.KahMvn.ui.models;

public class Student {

    private String name;
    private String family;
    private String college;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public Student(String name, String family, String college) {
        this.name = name;
        this.family = family;
        this.college = college;
    }

    public Student() {
    }
}
