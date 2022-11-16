import java.util.concurrent.ThreadLocalRandom;

public class SumElements {
    public static void main(String[] args) {
        int randomArrayLength = ThreadLocalRandom.current().nextInt(1, 60);
        int[] newArray = new int[randomArrayLength];
        int sum = 0;

        for (int i = 0; i < newArray.length; i++) {
            int randomNumber = ThreadLocalRandom.current().nextInt(1, 55);
            newArray[i] = randomNumber;
            sum = sum + newArray[i];
        }
        System.out.println(sum);
    }
}
