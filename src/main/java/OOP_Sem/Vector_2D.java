package OOP_Sem;

public class Vector_2D {
    public int x, y;

    public Vector_2D(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public double getDistance(Vector_2D oponent){
        return Math.sqrt(Math.pow(x - oponent.x, 2) + Math.pow(y - oponent.y, 2));
    }




}
