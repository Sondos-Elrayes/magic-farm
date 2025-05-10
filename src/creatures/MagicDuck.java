package creatures;

public class MagicDuck extends Creature{
     int eggQuantity;

    public MagicDuck(String name, String age, int hungerLevel , int eggQuantity){
        super(name, age, hungerLevel);
        this.eggQuantity = eggQuantity;
    }
    public int getEggQuantity() {
        return eggQuantity;
    }

    @Override
    public void feed() {

            hungerLevel -= 3;
        if (hungerLevel < 0) {
            hungerLevel = 0;
            System.out.println(name + " is not hungry:)");
        }
    }


    @Override
    public String toString() {
        return "MagicDuck " +
                "Name:" + name +
                ", Age:" + age +
                ", Hunger Level:" + hungerLevel +
                ", Egg Quantity:" + getEggQuantity() ;
    }
}
