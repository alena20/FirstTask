package epam.ninthTask.functionTg.service;

import epam.ninthTask.functionTg.entity.NineTaskFunc;

public class NinthTaskService {

    public StringBuilder func (NineTaskFunc task){
        StringBuilder result = new StringBuilder();
        double a = task.getSegmentA();
        while (a< task.getSegmentB()){
            result.append("Argument: "+a+"\t");
            result.append("F(x)= "+Math.tan(a)+"\r\n");
            a+= task.getStepH();
        }
        return result;
    }
}
