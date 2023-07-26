package iktlab.Youtube;

public class Exercise2 {
    public static void main(String[] args) {
        int[] numb = new int[]{60, 65, 80, 50, 70, 95, 45, 80, 75, 90};
        int sum = 0;
        double avarege = 0;
        int basarOlanlar =0 ;
        for (int i = 0; i < numb.length; i++) {
            if (numb [i] > 49){

                sum+= numb[i];

                basarOlanlar++;
            }


        }

        System.out.println("basarOlanlar = " + basarOlanlar);
        System.out.println("sum = " + sum);

    }
}
