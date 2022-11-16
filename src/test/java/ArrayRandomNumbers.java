import java.util.concurrent.ThreadLocalRandom;

public class ArrayRandomNumbers {
    public static void main(String[] args) {

        int randomArrayLength = ThreadLocalRandom.current().nextInt(1, 567);
        int[] fourArray = new int[randomArrayLength];
        for (int i = 0; i < fourArray.length; i++) {
            int randomValue = ThreadLocalRandom.current().nextInt(1, 100);
            fourArray[i] = randomValue;
            System.out.println(fourArray[i]);
        }
    }
}
