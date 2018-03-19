package com.epam.PlayRoom;

import com.epam.PlayRoom.Enum.ColorType;
import com.epam.PlayRoom.Enum.ToyType;
import com.epam.PlayRoom.Models.Ball;
import com.epam.PlayRoom.Models.Car;
import com.epam.PlayRoom.Models.Doll;
import com.epam.PlayRoom.Models.Toy;
import java.util.ArrayList;
import java.util.Scanner;

public class UI {

  public static void main(String[] args) {
    Scanner consoleInput = new Scanner(System.in);
    //Some test classes of toys
    Car car1 = new Car(50,true, ColorType.RED, ToyType.CAR_BIG);
    Car car2 = new Car(10,true, ColorType.RED, ToyType.CAR_BIG);
    Car car3 = new Car(100,true, ColorType.BLACK, ToyType.CAR_MEDIUM);
    Car car4 = new Car(120,false, ColorType.GREEN, ToyType.CAR_SMALL);
    Car car5 = new Car(140,false, ColorType.YELLOW, ToyType.CAR_SMALL);

    Doll doll1 = new Doll(20,ColorType.YELLOW,ToyType.DOLL_ANIMAL);
    Doll doll2 = new Doll(40,ColorType.RED,ToyType.DOLL_MOTHER);
    Doll doll3 = new Doll(60,ColorType.GREEN,ToyType.DOLL_FATHER);
    Doll doll4 = new Doll(80,ColorType.WHITE,ToyType.DOLL_DAUGHTER);
    Doll doll5 = new Doll(100,ColorType.BLACK,ToyType.DOLL_BIG);

    Ball ball1 = new Ball(20,ColorType.GREEN,ToyType.BALL_SMALL);
    Ball ball2 = new Ball(50,ColorType.WHITE,ToyType.BALL_SMALL);
    Ball ball3 = new Ball(70,ColorType.YELLOW,ToyType.BALL_BIG);
    Ball ball4 = new Ball(80,ColorType.GREEN,ToyType.BALL_SMALL);
    Ball ball5 = new Ball(100,ColorType.GREEN,ToyType.BALL_BIG);

    //Toy Arr:
    ArrayList<Toy> toyArrayList = new ArrayList<Toy>();
    toyArrayList.add(car1);
    toyArrayList.add(car2);
    toyArrayList.add(doll3);
    toyArrayList.add(doll5);
    toyArrayList.add(ball2);
    toyArrayList.add(ball4);
    toyArrayList.add(ball1);

    PlayRoom playRoomOne = new PlayRoom(500,true,toyArrayList);
    System.out.println(playRoomOne.getToysByColor(ColorType.GREEN).toString());
  }
}
