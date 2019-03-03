package string;

import java.util.Random;

public class Task1 {
    public static void main(String[] args) {
        String[] array = wordMaker("N I T I S H A");
        for(int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static String[] wordMaker(String str) {
        Random rand = new Random();
        String[] result = new String[rand.nextInt(3) + 1];
        str = str.replaceAll(" ", "");
        for (int i = 0; i < result.length; i++) {
            int n = rand.nextInt(2) + 1;
            result[i] = "";
            for (int j = 0; j < n; j++) {
                result[i] = result[i] + str.charAt(rand.nextInt(str.length()));
            }
        }
        return result;
    }
}
