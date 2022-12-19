package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public static void printPrimeNumbers(int printToInclusive) {
        int counter = 2;
        while (counter < printToInclusive) {
            int count = 0;
            for (int j = 2; j <= counter && count < 2; ++j) {
                if (counter % j == 0) {
                    ++count;
                }
            }
            if (count < 2) {
                System.out.println(counter);
            }
            counter++;
        }
    }
}
