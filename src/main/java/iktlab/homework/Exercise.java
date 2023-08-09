package iktlab.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class Exercise {
    public static void main(String[] args) {

        List<String>list= new ArrayList<>();
        List<String>list1= new ArrayList<>();
        String colour = "red";
        list.add("red");
        list.add("green");
        list.add("Orange");
        list.add("White");
        list.add("Black");
        list1.add("Red");
        list1.add("Green");
        list1.add("Black");
        list1.add("Pink");

        

        System.out.println(list.stream().filter(it -> Objects.equals(it , colour)).collect(Collectors.toList()));
    }
}
