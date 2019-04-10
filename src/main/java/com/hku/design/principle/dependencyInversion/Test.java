package com.hku.design.principle.dependencyInversion;

import java.util.*;
public class Test {
//    //v1 面向实现编程
//    //高层依赖底层
//    //test 依赖 rex
//    public static void main(String[] args) {
//        Rex rex = new Rex();
//        rex.studyJava();
//        rex.studyJs();
//        rex.studyPython();
//    }

    //依赖倒置
//    public static void main(String[] args) {
//        rex.studyCourse(new JavaCourse());
//        rex.studyCourse(new JsCourse());
//        rex.studyCourse(new PythonCourse());
//    }

//    //v3 构造器注入
//    public static void main(String[] args) {
//        Rex rex = new Rex(new JavaCourse());
//        rex.studyImoocCourse();
//    }
    //v4 setter injection
    public static void main(String[] args) {
        Rex rex = new Rex();
        rex.setiCourse(new JavaCourse());
        rex.studyImoocCourse();

        rex.setiCourse(new PythonCourse());
        rex.studyImoocCourse();

        rex.setiCourse(new JsCourse());
        rex.studyImoocCourse();
    }
}
