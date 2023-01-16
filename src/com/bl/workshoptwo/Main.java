package com.bl.workshoptwo;

public class Main {
    public static void main(String[] args) {
         Bag bag = new Bag();

         Balls balls = new Balls();
         balls.setColour("Green");
         bag.add(balls);

        Balls balls2 = new Balls();
        balls2.setColour("Green");
        bag.add(balls2);

        Balls balls3 = new Balls();
        balls3.setColour("Green");
        bag.add(balls3);

        Balls balls4= new Balls();
        balls4.setColour("Red");
        bag.add(balls4);

        Balls balls5 = new Balls();
        balls5.setColour("Red");
        bag.add(balls5);

        Balls balls6 = new Balls();
        balls6.setColour("Red");
        bag.add(balls6);

        Balls balls7 = new Balls();
        balls7.setColour("Red");
        bag.add(balls7);

        Balls balls8 = new Balls();
        balls8.setColour("Red");
        bag.add(balls8);

        Balls balls9 = new Balls();
        balls9.setColour("Blue");
        bag.add(balls9);

        Balls balls10 = new Balls();
        balls10.setColour("Yellow");
        bag.add(balls10);

        Balls balls11 = new Balls();
        balls11.setColour("Yellow");
        bag.add(balls11);

        Balls balls12 = new Balls();
        balls12.setColour("Yellow");
        bag.add(balls12);


        Main main = new Main();
        main.print(bag.getBag());

    }
    public void print(Balls []balls){

        for(int i = 0; i < 12; i++) {
            System.out.println(balls[i].getColour());
        }
    }
}
