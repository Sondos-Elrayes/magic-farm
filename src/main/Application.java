package main;

import actions.Action;
import actions.FeedAction;
import creatures.Creature;
import farm.MagicFarm;
import menu.Menu;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        MagicFarm.printStatus();

        MagicFarm farm = new MagicFarm();
        farm.createCreatures();


        List<Action> actions = new ArrayList<>();
        for (Creature creature : farm.creatures) {
            actions.add(new FeedAction(creature));
        }

        Menu.showMenu(actions);


    }
}