package creatures;

public class MagicCow extends Creature{
    int milkAmount;
    public MagicCow(String name, String age, int hungerLevel, int milkAmount) {
        super(name, age, hungerLevel);
        this.milkAmount =   milkAmount;
    }
    public int getMilkAmount() {
        return milkAmount;
    }

    @Override
    public void feed() {
        hungerLevel -= 4;
        if (hungerLevel < 0) {
            hungerLevel = 0;
            System.out.println(name + " is not hungry:)");
        }
    }
    @Override
    public String toString() {
        return "MagicCow " +
                "Name:" + name +
                ", Age:" + age +
                ", Hunger Level:" + hungerLevel +
                ", Milk Amount:" + getMilkAmount() ;
    }
}
