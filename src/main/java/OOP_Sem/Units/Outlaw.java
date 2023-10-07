package OOP_Sem.Units;

public class Outlaw extends Unit{
    boolean stole, hide;

//    public Outlaw(String name, Integer hp, Integer maxHp, Integer speed, Integer defence, Integer level, Integer minDamage, Integer maxDamage, Integer x, Integer y, boolean stole, boolean hide) {
//        super(name, hp, maxHp, speed, defence, level, minDamage, maxDamage, x, y);
//        this.stole = stole;
//        this.hide = hide;
//    }

    public Outlaw(String name, int x, int y){
        super(x, y, name, 70, 70, 85, 60, 1, 30, 50);
        this.stole = false;
        this.hide = false;
    }

    @Override
    public String classInfo() {return "I'm an outlaw! ";}

    @Override
    public String getInfo()
    {return String.format("x: %d, y: %d, %s, %d, %d |", coords.x, coords.y, name, hp, speed);}

//    @Override
//    public void step() {
//        super.step();
//    }
}
