package iktlab.miniFamilly;

public class Family {

    private  Pet pet;

    private  Human mother;

    private Human father;

    private Human [] children;

    public  Family(Human mother, Human father) {
        this.father = father;
        this.mother = mother;

    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    public void setMother(Human mother) {
        this.mother = mother;
    }

    public void setFather(Human father) {
        this.father = father;
    }

    public void setChildren(Human[] children) {
        this.children = children;
    }

    public Pet getPet() {
        return pet;
    }

    public Human getMother() {
        return mother;
    }

    public Human getFather() {
        return father;
    }

    public Human[] getChildren() {
        return children;
    }

    public void greetpet () {
        System.out.println("Hello"+ pet);


    }

}
