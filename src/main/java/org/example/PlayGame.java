package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PlayGame {
    public static void main(String[] args) {
    List<Door> doors = new ArrayList<>();
    Door door1 = new Door(true);
    Door door2 = new Door(false);
    Door door3 = new Door(false);
    doors.add(door1);
    doors.add(door2);
    doors.add(door3);

    Player player = new Player(false);
    Random rand = new Random();
    int N = 1000;
    int countWins = 0;
    int selectDoor;
    for (int i = 0; i < N; i++) {
        if (player.isChangeDoor()){
            selectDoor =rand.nextInt(2);
        }
        else{
            selectDoor =rand.nextInt(3);
        }

        System.out.println(doors.get(selectDoor).doorHasPrise() ? "Игрок победил" : "Игрок проиграл");
        if (doors.get(selectDoor).doorHasPrise()) countWins++;
    }
    System.out.println();
        if (player.isChangeDoor()){
            System.out.println("Игрок менял дверь ");
        }
        else{
            System.out.println("Игрок НЕ менял дверь");
        }
    System.out.println("Процент побед игрока: " + countWins*100/N);
    }



}