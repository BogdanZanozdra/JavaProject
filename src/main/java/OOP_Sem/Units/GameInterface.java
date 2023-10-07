package OOP_Sem.Units;

import java.util.ArrayList;

public interface GameInterface {
    void step(ArrayList<Unit> team1, ArrayList<Unit> team2);
    String getInfo();
    String classInfo();
}
