package edu.dmacc.codedsm.practicalreview1;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Runner {
    public static void main(String[] args) {


            Fizzable fizzLogic = new FizzLogic();
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("fizz_results");
            PrintWriter printWriter = new PrintWriter(fileWriter);
            printWriter.println(((FizzLogic) fizzLogic).performLogic(321));
            printWriter.close();;
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally block executed");
        }
        System.out.println("Done");
    }

}
