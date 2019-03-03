package string;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println(identifier("Hi my name is Nitisha"));
    }
    public static boolean identifier(String text) {
        Pattern pattern = Pattern.compile("^[a-zA-Z_]\\w+");
        Matcher matcher = pattern.matcher(text);

        if(matcher.matches()) {
            return true;
        }
        else
        {
            return false;
        }


    }


    /*public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое слово или фразу: ");
        String text = sc.nextLine();
        Pattern pattern = Pattern.compile("^[a-zA-Z_]\w*+");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find()){
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }*/

}