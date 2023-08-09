package iktlab.Readme1;


import java.util.Arrays;
import java.util.Objects;

public class Family {
    private Pet pet;

    private Human mother;

    private Human father;

    private Human[] children;



    static {
        System.out.println("family = " );

    }
    {

    }


    public Family(Human mother, Human father) {
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

    public void greetpet() {
        System.out.println("Hello" + pet);

    }
    public int countFamily(){

        return 2+children.length;

    }

    public void addChild(Human X) {
        int size;
        if (this.children == null) {
            size = 0;
        } else {
            size = this.children.length;
        }
        Human[] newArr = new Human[size + 1];
        for (int i = 0; i < size; i++) {
            newArr[i] = this.children[i];
        }
        newArr[size] = X;
        this.children = newArr;
    }

    public void deleteChild(int Y) {


        Human[] newArr = new Human[this.children.length - 1];
        int d = 0;
        for (int i = 0; i < this.children.length; i++) {
            if (i != Y) {
                newArr[d] = this.children[i];
                d++;
            }
        }
        this.children = newArr;
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Family)) return false;
        Family family = (Family) o;
        return Objects.equals(getPet(), family.getPet()) && Objects.equals(getMother(), family.getMother()) && Objects.equals(getFather(), family.getFather()) && Arrays.equals(getChildren(), family.getChildren());
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(getPet(), getMother(), getFather());
        result = 31 * result + Arrays.hashCode(getChildren());
        return result;
    }

    @Override
    public String toString() {
        return "Family{" +
                "pet=" + pet +
                ", mother=" + mother +
                ", father=" + father +
                ", children=" + Arrays.toString(children) +
                '}';

    }
}
