package edu.dmacc.codedsm.practicalreview1;

public class FizzLogic implements Fizzable {
    @Override
    public String determintFizz(Integer x) {
        return null;
    }

    public String performLogic(Integer x) {
        if (x % 3 == 0 && x % 5 == 0) {
            return "Fizzbuzz!";
        } else if (x % 3 == 0) {
            return "Fizz";
        } else if (x % 5 == 0) {
            return  "Buzz";
        } else {
            return "Not fizzy";
        }
    }

}
