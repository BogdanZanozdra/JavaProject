package OOP_Sem;

import OOP_Sem.Units.Unit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class main {
    public static ArrayList<Unit> team1 = new ArrayList<>();
    public static ArrayList<Unit> team2 = new ArrayList<>();
    public static ArrayList<Unit> all = new ArrayList<>();

    static final int UNITS = 10;

    
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);

    //    team1.sort(new Comparator<Unit>() {
    //        @Override
    //        public int compare(Unit o1, Unit o2) {
    //            if (o1.getSpeed() == o2.getSpeed()) {
    //                return o1.getHp() - o2.getHp();
    //            }
    //            return o1.getSpeed() - o2.getSpeed();
    //        }
    //    });

        for (int i = 1; i < UNITS + 1; i++) {
            Unit.createTeam1Unit(team1, Unit.setClass(), 10, i);
        }

        System.out.println("Team 1:");;
        printTeam(team1);

        for (int i = 1; i < UNITS + 1; i++) {
            Unit.createTeam2Unit(team2, Unit.setClass(), 1, i);
        }
        System.out.println("\nTeam 2:");
        printTeam(team2);

        all.addAll(team1);
        all.addAll(team2);

//        for (int i = 0; i < team2.size(); i++) {
//            all.add(team2.get(i));
//        }

        all.sort(new Comparator<Unit>() {
            @Override
            public int compare(Unit o1, Unit o2) {
                if (o2.getSpeed() == o1.getSpeed()) return o2.getHp() - o1.getHp();
                else return o2.getSpeed() - o1.getSpeed();
            }
        });
        System.out.println();
        System.out.println(all);
//        for (Unit unit: all) {
//            if (team1.contains(unit)) System.out.println("team1");
//            else System.out.println("team2");
//        }
        while (true){
            View.view();
            userInput.nextLine();
            for (Unit unit : all) {
                if (team1.contains(unit)) unit.step(team1, team2);
                else unit.step(team2, team1);
                System.out.println(all);
            }

        }
    }

    public static void printTeam(ArrayList<Unit> team){
        for (int i = 0; i < team.size(); i++) {
            System.out.print(team.get(i).classInfo());
        }
    }
}





