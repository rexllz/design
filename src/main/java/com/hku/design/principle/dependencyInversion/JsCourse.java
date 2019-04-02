package com.hku.design.principle.dependencyInversion;

public class JsCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("study js");
    }
}
