package OOP_Sem.Units.Shooters;

import OOP_Sem.Units.Shooters.Shooter;
import OOP_Sem.Units.Unit;

import java.util.ArrayList;

public class Crossbowman extends Shooter {
    private Integer shot_range, maxArrows, currentArrows;

//    public Crossbowman(String name, Integer hp, Integer maxHp, Integer speed, Integer defence, Integer level, Integer minDamage, Integer maxDamage, Integer x, Integer y, Integer accuracy, Integer shot_range, Integer maxArrows, Integer currentArrows) {
//        super(name, hp, maxHp, speed, defence, level, minDamage, maxDamage, x, y, accuracy);
//        this.shot_range = shot_range;
//        this.maxArrows = maxArrows;
//        this.currentArrows = currentArrows;
//    }

    public Crossbowman(String name, int x, int y){
        super(x, y, name, 100, 100, 50, 60, 1, 50, 80,  80);
        this.shot_range = 70;
        this.maxArrows = 90;
        this.currentArrows = 90;
    }
    @Override
    public String classInfo() {return "I'm a crossbowman! ";}

    @Override
    public String getInfo()
    {return String.format("x: %d, y: %d, %s, %d, %d |", coords.x, coords.y, name, hp, speed);}

    @Override
    public void step(ArrayList<Unit> team1, ArrayList<Unit> team2) {
        if (state.equals("Die") || currentArrows == 0) return;
        int target = findNearest(team2);
        float damage = (team2.get(target).defence - maxDamage > 0) ?
                minDamage : (team2.get(target).defence - maxDamage < 0) ?
                maxDamage : (minDamage + maxDamage)/2;
        team2.get(target).getDamage(damage);

        for (int i = 0; i < team1.size(); i++) {
            if (team1.get(i).classInfo().equals("I'm a farmer! ") && team1.get(i).state.equals("Stand")){
                team1.get(i).state = "Busy";
                return;
            }
        }
        currentArrows --;
    }
}
