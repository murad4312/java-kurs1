package iktlab.Youtube;

public class Exercise {
    public static void main(String[] args) {
        int[] numbers = new int[]{60, 65, 80, 50, 70, 95, 45, 80, 75, 90};
        int sum = 0;
        double ortalama = 0;


        for (int i = 0; i < numbers.length; i++) {




            sum += numbers[i];

            ortalama =  ((ortalama+sum*1.0)/ numbers.length);


        }


        System.out.println("sum =" + sum);
        System.out.println("ortalama = " + ortalama);

    }
}
