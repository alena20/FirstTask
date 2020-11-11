package epam.firstTask.squere.service;

import epam.firstTask.squere.entity.FirstTaskNumber;

public class FirstTaskService {

    public int lastNumber(FirstTaskNumber num){
        int buf = num.getNum()%10;
        int lastNum=(buf*buf)%10;
        return lastNum;
    }
}
