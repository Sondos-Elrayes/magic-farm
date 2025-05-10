package creatures;

public class MagicShark extends Creature{

    public MagicShark(String name, String age, int hungerLevel) {
        super(name, age, hungerLevel);
    }

    @Override
    public void feed() {
        hungerLevel -= 2;
        if (hungerLevel < 0) {
            hungerLevel = 0;
            System.out.println(name + " is not hungry:)");
        }
    }
    @Override
    public String toString() {
        return "MagicShark " +
                "Name:" + name +
                ", age:" + age +
                ", hungerLevel:" + hungerLevel ;
    }
}
