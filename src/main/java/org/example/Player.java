package org.example;

public class Player {
    private final boolean changeDoor;


    public Player(boolean changeDoor) {
        this.changeDoor = changeDoor;
    }

    public boolean isChangeDoor() {
        return changeDoor;
    }
}
