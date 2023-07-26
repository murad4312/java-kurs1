package iktlab.miniFamilly;

public class Pet {
    private String species;
    private String nickName;
    private int age;
    private int trickLevel;
    private String habits;

    public Pet(String species, String nickName, int age, int trickLevel, String habits) {
        this.species = species;
        this.nickName = nickName;
        this.age = age;
        this.trickLevel = trickLevel;
        this.habits = habits;
    }

    public void eat() {
        System.out.println("I am eating");
    }

    public void respond() {
        System.out.println("Hello, owner. I " + this.nickName + "I miss you!");
    }

    public void foul() {
        System.out.println("method displays a message 'I need to cover it up");

    }

    @Override
    public String toString() {
        return "Pet{" +
                "species='" + species + '\'' +
                ", nickName='" + nickName + '\'' +
                ", age=" + age +
                ", trickLevel=" + trickLevel +
                ", habits='" + habits + '\'' +
                '}';
    }
}
