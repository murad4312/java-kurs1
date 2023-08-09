package iktlab.Readme1;


import java.util.Arrays;
import java.util.Objects;

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
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        Human human = (Human) o;
        return age == human.age && iq == human.iq && Objects.equals(name, human.name) && Objects.equals(surname, human.surname) && Objects.equals(pet, human.pet) && Objects.equals(mother, human.mother) && Objects.equals(father, human.father) && Arrays.equals(schedule, human.schedule);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, age, iq, pet, mother, father);
        result = 31 * result + Arrays.hashCode(schedule);
        return result;
    }

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


