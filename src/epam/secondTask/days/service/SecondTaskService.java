package epam.secondTask.days.service;

import epam.secondTask.days.entity.SecondTaskYear;
import java.util.stream.IntStream;

public class SecondTaskService {
    public int CountDays(SecondTaskYear task){
        int days = 0;
        int month= task.getMonth();
        int [] ThirtyOneDay = {1, 3, 5, 7, 8, 10, 12};
        days = month!=0 ? (month!=2 ? (IntStream.of(ThirtyOneDay).anyMatch(x -> x == month) ? 31 : 30) : (IsLeapYear(task)?29:28)):0;
        return days;
    }

    public boolean IsLeapYear(SecondTaskYear task){
        return (task.getYear()%4==0)?true:false;
    }
}
