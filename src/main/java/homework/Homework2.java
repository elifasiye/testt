package homework;

import java.util.Random;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);

        String[] words = {"Apple", "Home", "Garden", "Coolage", "School"};

        Random rnd = new Random();

        int wordsIndex = rnd.nextInt(words.length);
        int life =5;
        String word = words[wordsIndex];

        while(life>0);


        life++;

    }

    public static  String underscore(String word){

        return word.replaceAll("[a-zA-Z]","_");



    }

}
