package com.hku.design.principle.demeter;

public class Boss {
    public void commandCheckNumber(TeamLeader teamLeader){
        teamLeader.checkNumberOfCourses();
    }
}
