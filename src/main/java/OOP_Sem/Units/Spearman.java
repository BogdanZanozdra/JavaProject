package OOP_Sem.Units;

public class Spearman extends Unit{
    Integer armour;

//    public Spearman(String name, Integer hp, Integer maxHp, Integer speed, Integer defence, Integer level, Integer minDamage, Integer maxDamage, Integer x, Integer y, Integer armour) {
//        super(name, hp, maxHp, speed, defence, level, minDamage, maxDamage, x, y);
//        this.armour = armour;
//    }


    public Spearman(String name, int x, int y){
        super(x, y, name, 100, 100, 80, 90, 1, 60, 90);
        this.armour = 90;
    }

    @Override
    public String classInfo() {
        return "I'm a spearman! ";
    }

    @Override
    public String getInfo()
    {return String.format("x: %d, y: %d, %s, %d, %d |", coords.x, coords.y, name, hp, speed);}

//    @Override
//    public void step() {
//        super.step();
//    }
}
