package OOP_Sem.Units;

import java.util.ArrayList;

public class Mag extends Unit {
    protected Integer max_manna, current_manna;

//    public Mag(String name, Integer hp, Integer maxHp, Integer speed, Integer defence, Integer level, Integer minDamage, Integer maxDamage, Integer x, Integer y, Integer max_manna, Integer current_manna) {
//        super(name, hp, maxHp, speed, defence, level, minDamage, maxDamage, x, y);
//        this.max_manna = max_manna;
//        this.current_manna = current_manna;
//    }

    public Mag(String name, int x, int y){
        super(x, y, name, 100, 100, 7, 2, 1, -30, -60);
        super.name = name;
        this.max_manna = 50;
        this.current_manna = 50;
    }

    @Override
    public String classInfo() {return "I'm a mag! ";}

    @Override
    public String getInfo()
    {return String.format("x: %d, y: %d, %s, %d, %d |", coords.x, coords.y, name, hp, speed);}

    @Override
    public void step(ArrayList<Unit> team1, ArrayList<Unit> team2) {
        if (state.equals("Die") || current_manna <= 0) return;
        int target = findHPTarget(team1);
        team1.get(target).getDamage(maxDamage);
    }
}
