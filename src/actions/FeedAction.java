package actions;

import creatures.Creature;

public class FeedAction extends  Action {
    Creature creature;

    public FeedAction(Creature creature) {
        this.creature = creature;
    }
    @Override
    public String execute() {
        creature.feed();
        return creature.toString() + " has been fed. \nHunger level is now: " + creature.getHungerLevel();
    }

    @Override
    public String menuDescription() {
        return "Feed this " + creature.toString();
    }
}
