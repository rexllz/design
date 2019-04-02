package com.hku.design.principle.dependencyInversion;


public class PythonCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("study py");
    }
}
