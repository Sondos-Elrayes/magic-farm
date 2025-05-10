package farm;

import creatures.*;

import java.util.ArrayList;
import java.util.List;

public class MagicFarm {
    public static void printStatus(){
        System.out.println("************************** Welcome to the Magic Farm! **************************");
        System.out.println("Let's get started! ");
        System.out.println("**************************");
    }
    public List<Creature> creatures = new ArrayList<>();

    public void createCreatures() {
        creatures.add(new MagicCow("Moozy", "1 month 9 days", 10, 10));
        creatures.add(new MagicCow("Sparkle", "1 year 2 months 7 days", 10, 12));

        creatures.add(new MagicDuck("Donald", "10 days", 10, 3));
        creatures.add(new MagicDuck("Quackers", "6 months 20 days", 10, 3));

        creatures.add(new MagicShark("Finn", "5 days", 10));
        creatures.add(new MagicShark("Storm", "2 months", 10));
    }
   public void displayCreatures() {
        System.out.println("Creatures on the farm:");
        for(Creature creature: creatures) {
            System.out.println(creature.toString());
        }
    }
}
