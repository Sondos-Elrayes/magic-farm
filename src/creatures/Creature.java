package creatures;

abstract public class Creature {
    String name;
    String age;
    int hungerLevel;

    public Creature(String name, String age, int hungerLevel) {
        this.name = name;
        this.age = age;
        this.hungerLevel = hungerLevel;
    }

    public String getName() {
        return name;
    }


    public String getAge() {
        return age;
    }


    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }
    public abstract void feed();
    @Override
    public String toString() {
        return "Creature{" + "Name:'" + name + '\'' + ", Age:" + age + ", HungerLevel:" + hungerLevel + '}';
    }
}
