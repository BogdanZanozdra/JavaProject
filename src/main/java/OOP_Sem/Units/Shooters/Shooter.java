package OOP_Sem.Units.Shooters;

import OOP_Sem.Units.Unit;

import java.util.ArrayList;

public abstract class Shooter extends Unit {
    protected Integer accuracy, maxArrows, currentArrows;

    public Shooter(int x, int y, String name, int hp, int maxHp, int speed, int defence, int level, int minDamage,
                   int maxDamage, Integer accuracy) {
        super(x, y, name, hp, maxHp, speed, defence, level, minDamage, maxDamage);
        this.accuracy = accuracy;
        this.currentArrows = currentArrows;
        this.maxArrows = maxArrows;
    }
    //    public Shooter(String name, Integer hp, Integer maxHp, Integer speed, Integer defence, Integer level, Integer minDamage, Integer maxDamage, Integer x, Integer y, Integer accuracy) {
//        super(x, y, name, hp, maxHp, speed, defence, level, minDamage, maxDamage);
//        this.accuracy = accuracy;
//    }


    @Override
    public void step(ArrayList<Unit> team1, ArrayList<Unit> team2) {

    }
}

