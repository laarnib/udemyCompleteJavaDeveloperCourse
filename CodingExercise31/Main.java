package com.edulaarni;

public class Main {

    public static void main(String[] args) {
	    Wall wall = new Wall(1.125,-1.0);
        System.out.println("Area = " + wall.getArea());

        System.out.println("Width = " + wall.getWidth());
        System.out.println("Height = " + wall.getHeight());
        /*wall.setHeight(-1.5);
        System.out.println("Width = " + wall.getWidth());
        System.out.println("Height = " + wall.getHeight());
        System.out.println("Area = " + wall.getArea());

        Wall bathroomWall = new Wall();
        System.out.println("Bathroom : " + bathroomWall.getArea());*/
    }
}
