package epam.thirdTask.inscribedCircle.service;

import epam.thirdTask.inscribedCircle.entity.ThirdTaskSquares;

public class ThirdTaskService {

    public int squareSmall(int squareS){
        return (int) (Math.pow( (int)Math.sqrt(squareS),2)/2 );
    }

    //small square S in ... times smaller than big square S
    public double smallerSquareSmall(ThirdTaskSquares squareS){
        return (double)((int) Math.round(squareS.getSquareS()/squareSmall(squareS.getSquareS())*10)/10);
    }
}
