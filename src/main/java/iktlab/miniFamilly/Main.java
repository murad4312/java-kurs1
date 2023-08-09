package iktlab.miniFamilly;

public class Main {
    public static void main(String[] args) {
        Human man = new Human("Micheal", "Hoodman", 1980, 92, "Rock");
        Pet rock = new Pet("Dog", "Rock",3 , 4, null );

        Human mother = new Human("Jeniffer", "Hoodman", 1960, 70, "Rock");
        Human father = new Human ("Patrick" , "Hoodman", 1955, 85 ,"Rock");


        System.out.println("father = " + father);
        System.out.println("mother = " + mother);
        System.out.println("rock = " + rock);
    }


}
