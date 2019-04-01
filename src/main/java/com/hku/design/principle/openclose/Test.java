package com.hku.design.principle.openclose;

public class Test {
    public static void main(String[] args) {
        ICourse mycourse = new JavaDiscountCourse(1,"java",100d);
        ((JavaDiscountCourse) mycourse).getOriginPrice();
        ((JavaDiscountCourse) mycourse).getDiscountPrice();
        mycourse.getPrice();
    }
}
