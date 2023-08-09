package iktlab.miniFamilly;

public class Human {

    private String name;
    private String surname;
    private int age;
    private int iq;
    private String pet;
    private String mother;
    private String father;
    private String [][]  schedule;



    public Human(String name, String surname, int age, int iq, String pet) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.iq = iq;
        this.pet = pet;

    }

    public void greetPet () {
        System.out.println("Hello, [the name of the pet]");
    }
    public void describePet () {
        System.out.println( "I have a [species], he is [age] years old, he is [very sly]>50/[almost not sly]<50");
    }

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.iq = iq;
        this.pet = pet;
        this.mother = mother;
        this.father = father;
    }
    public Human () {};


    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", iq=" + iq +
                ", pet=" + pet +
                ", mother='" + mother + '\'' +
                ", father='" + father + '\'' +
                '}';
    }
}
