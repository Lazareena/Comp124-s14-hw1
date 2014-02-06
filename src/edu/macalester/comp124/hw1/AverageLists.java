package edu.macalester.comp124.hw1;

import acm.program.ConsoleProgram;

/**
 * Created by Reena on 2/6/14.
 * Completed program with the aid of "The Art and Science of Java" and this
 * forum:http://stackoverflow.com/questions/8715846/simple-java-app-to-calculate-the-average-of-an-indefinite-amount-of-entered-numb
 */
public class AverageLists extends ConsoleProgram {
    public void run(){

        println("This programs averages the sum of a lists of integers");
        println("Enter values, one per line, using" + SENTINEL);
        println("to signal the end of the list.");

        int total = 0;
        int i = 0;

        while (true){
            int value = readInt("");
            if (value == SENTINEL) break;
            i++;
            total += value;

    }
        double average = total/i;
        println("The average is" + average + ".");


    }
    private static final int SENTINEL = -1;

}
