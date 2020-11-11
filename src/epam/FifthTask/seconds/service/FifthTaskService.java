package epam.FifthTask.seconds.service;

import epam.FifthTask.seconds.entity.FifthTaskSecond;

public class FifthTaskService {

    public String hoursMinutes(FifthTaskSecond sec){
        if(sec.getSeconds()>0){
            int hours = (int)sec.getSeconds()/3600;
            int minute = (int)(sec.getSeconds()-hours*3600)/60;
            int second = sec.getSeconds()%60;
            return "hour "+hours+ " minute " +minute+ " second " +second;
        }else return "illegal statement seconds<0";
    }
}
