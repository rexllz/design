package com.hku.design.principle.dependencyInversion;

public class JavaCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("study java");
    }
}
