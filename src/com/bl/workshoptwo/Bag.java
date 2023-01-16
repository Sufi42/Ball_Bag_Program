package com.bl.workshoptwo;


import javax.naming.CannotProceedException;

public class Bag {
    public Balls[] bag = new Balls[12];
    int count = 0;
    int redBalls = 0;
    int greenBalls = 0;
    int yellowBalls = 0;
    int blueBalls = 0;


    public void add(Balls ball) {

        if (ball.getColour().equals("Green") && greenBalls <= 3) {
            this.bag[count++] = ball;
            greenBalls++;
        }
        if (ball.getColour().equals("Red") && redBalls <= greenBalls * 2) {
            this.bag[count++] = ball;
            redBalls++;
        }
        if (ball.getColour().equals("Yellow") && yellowBalls <= (redBalls + greenBalls + blueBalls + yellowBalls) * 0.4) {
            this.bag[count++] = ball;
            yellowBalls++;
        }
        if (ball.getColour().equals("Blue")) {
            this.bag[count++] = ball;
            blueBalls++;
        }
    }
    public Balls[] getBag() {
        return bag;
    }
}


