package OOP_Sem.Units;

import OOP_Sem.Units.Unit;

import java.util.ArrayList;

public class Farmer extends Unit{
    private int heal, cartridges;

//    public Farmer(String name, Integer hp, Integer maxHp, Integer speed, Integer defence, Integer level, Integer minDamage, Integer maxDamage, Integer x, Integer y, Integer heal, Integer cartridges) {
//        super(name, hp, maxHp, speed, defence, level, minDamage, maxDamage, x, y);
//        this.heal = heal;
//        this.cartridges = cartridges;
//    }

    public Farmer(String name, int x, int y){
        super(x, y, name, 70, 70, 10, 3, 1, 1, 10);
        this.heal = 20;
        this.cartridges = 10;
    }

    @Override
    public String classInfo() {return "I'm a farmer! ";}

    @Override
    public String getInfo()
    {return String.format("x: %d, y: %d, %s, %d, %d |", coords.x, coords.y, name, hp, speed);}

    @Override
    public void step(ArrayList<Unit> team1, ArrayList<Unit> team2) {
        if (!state.equals("Die")) state = "Stand";
    }
}
