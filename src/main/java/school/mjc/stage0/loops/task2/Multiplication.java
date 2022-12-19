package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int counter = 0;
        boolean negative = false;
        if (multiplyByAndToInclusive == 0) {
            System.out.print("");
        } else if (multiplyByAndToInclusive < 0) {
            negative = true;
            multiplyByAndToInclusive = multiplyByAndToInclusive * -1;
        }
        while (counter <= multiplyByAndToInclusive &&  multiplyByAndToInclusive != 0) {
            System.out.println(negative ? -1 * counter * multiplyByAndToInclusive : counter * multiplyByAndToInclusive);
            counter++;
        }

    }
}
