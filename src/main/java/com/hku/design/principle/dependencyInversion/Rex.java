package com.hku.design.principle.dependencyInversion;

public class Rex {
//    public void studyJava(){
//        System.out.println("study java");
//    }
//    public void studyPython(){
//        System.out.println("study python");
//    }
//    public void studyJs(){
//        System.out.println("study js");
//    }
//    public void studyCourse(ICourse iCourse){
//        iCourse.studyCourse();
//    }
    private ICourse iCourse;
//    public Rex(ICourse iCourse) {
//        this.iCourse = iCourse;
//    }
    public void setiCourse(ICourse iCourse){
        this.iCourse = iCourse;
    }
    public void studyImoocCourse(){
        iCourse.studyCourse();
    }
}
