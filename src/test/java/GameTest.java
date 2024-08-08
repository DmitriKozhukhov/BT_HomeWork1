import org.example.Door;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
public class GameTest {
    static List<Door> doors;

    @BeforeEach
    void initDoors () {
        doors = new ArrayList<>();
        Door door1 = new Door(true);
        Door door2 = new Door(false);
        Door door3 = new Door(false);
        doors.add(door1);
        doors.add(door2);
        doors.add(door3);
    }
}
