package iktlab.Readme1;

import iktlab.miniFamilly.Human;
import iktlab.miniFamilly.Pet;

public class main {
    public static void main(String[] args) {
        iktlab.miniFamilly.Human man = new iktlab.miniFamilly.Human("Micheal", "Hoodman", 1980, 92, "Rock");
        Pet rock = new Pet("Dog", "Rock",3 , 4, null );

        iktlab.miniFamilly.Human mother = new iktlab.miniFamilly.Human("Jeniffer", "Hoodman", 1960, 70, "Rock");
        iktlab.miniFamilly.Human father = new Human("Patrick" , "Hoodman", 1955, 85 ,"Rock");


        System.out.println("father = " + father);
        System.out.println("mother = " + mother);
        System.out.println("rock = " + rock);
    }
}
