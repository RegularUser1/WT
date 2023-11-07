package task11;

import java.util.ArrayList;
import java.util.List;

public class Basket {

    private List<Ball> balls;

    public Basket(){
        balls = new ArrayList<Ball>();
    }

    public void addBall(float weight, String color){
        balls.add(new Ball(weight,color));
    }

    public float calculateWeight(){
        float weightSum = 0;
        for (Ball ball : balls){
            weightSum += ball.getWeight();
        }
        return weightSum;
    }

    public int numberOfBlueBalls(){
        int count = 0;
        for (Ball ball : balls){
            if (ball.getColor() == "Blue"){
                count++;
            }
        }
        return count;
    }
}
