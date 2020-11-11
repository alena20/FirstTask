package epam.fourthTask.perfectNumber.service;


import epam.fourthTask.perfectNumber.entity.FourthTaskNumber;

public class FourthTaskService {

    public boolean IsPerfectNum(FourthTaskNumber num){
        int sum = 0;
        int number = num.getNumber();
        for (int i=1;i< number;i++){
            if(number%i==0) sum+=i;
        }
        return sum==number ? true : false;
    }

}
