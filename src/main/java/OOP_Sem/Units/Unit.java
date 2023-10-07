package OOP_Sem.Units;

import OOP_Sem.Names;
import OOP_Sem.Units.Shooters.Archer;
import OOP_Sem.Units.Shooters.Crossbowman;
import OOP_Sem.Vector_2D;

import java.util.ArrayList;
import java.util.Random;

public abstract class Unit implements GameInterface {

    protected String name;
    protected int hp;
    protected int maxHp;
    protected int speed;
    public int defence;
    protected int level;
    protected int minDamage;
    protected int maxDamage;
    public Vector_2D coords;
    public String state;

    public void setHp(Integer hp) {
        this.hp = hp;
    }


        public Unit(int x, int y, String name, int hp, int maxHp, int speed, int defence, int level, int minDamage, int maxDamage) {
        coords = new Vector_2D(x, y);
        this.name = name;
        this.hp = hp;
        this.maxHp = maxHp;
        this.speed = speed;
        this.defence = defence;
        this.level = level;
        this.minDamage = minDamage;
        this.maxDamage = maxDamage;
        state = "Stand";
    }

    public static String getName(){
        return String.valueOf(Names.values()[new Random().nextInt(Names.values().length - 1)]);
    }

    public  static ClassesUnit setClass() {
        return ClassesUnit.values()[new Random().nextInt(ClassesUnit.values().length - 1)];

    }
    public static void createTeam1Unit(ArrayList<Unit> team, ClassesUnit classesUnit, int x, int y){
        switch (classesUnit){
            case Mag: team.add(new Mag(getName(), x, y));
                break;
            case Farmer: team.add(new Farmer(getName(), x, y));
                break;
            case Outlaw: team.add(new Outlaw(getName(), x, y));
                break;
            case Spearman: team.add(new Spearman(getName(), x, y));
                break;
            case Archer:
            case Crossbowman:
                team.add(new Archer(getName(), x, y));
                break;
        }
    }
    public static void createTeam2Unit(ArrayList<Unit> team, ClassesUnit classesUnit, int x, int y) {
        switch (classesUnit) {
            case Mag: team.add(new Mag(getName(), x, y));
                break;
            case Farmer:team.add(new Farmer(getName(), x, y));
                break;
            case Outlaw: team.add(new Outlaw(getName(), x ,y));
                break;
            case Spearman: team.add(new Spearman(getName(), x, y));
                break;
            case Archer:
            case Crossbowman:
                team.add(new Crossbowman(getName(), x, y));
                break;
        }
    }

    protected int findNearest(ArrayList<Unit> team){
        double min = 100;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if (coords.getDistance(team.get(i).coords) < min & !team.get(i).state.equals("Die")){
                index = i;
                min = coords.getDistance(team.get(i).coords);
            }
        }
        return index;
    }

    protected int findHPTarget(ArrayList<Unit> team){
//        double minHP = 100;
        int index = 0;
        for (int i = 0; i < team.size(); i++) {
            if (team.get(i).hp < maxHp & !team.get(i).state.equals("Die")){
                index = i;
            }
        }
        return index;
    }

    @Override
    public String toString()
    {return String.format("x: %d, y: %d, %s, %d, %d |\n", coords.x, coords.y, name, hp, speed);}


    public void getDamage(float damage){
        hp -= damage;
        if (hp > maxHp) hp = maxHp;
        if (hp < 0) state = "Die";

    }

//    @Override
    public void step(ArrayList<Unit> team1, ArrayList<Unit> team2) {}

    public int getSpeed() {return speed;}

    public int [] getCoords(){
        int [] getcoords = new int[2];
        getcoords[0] = coords.x;
        getcoords[1] = coords.y;
        return getcoords;
        }


    public int getHp() {return hp;}
}
