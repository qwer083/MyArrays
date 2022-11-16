import java.util.Arrays;

public class HelpForPiter {
    public static void main(String[] args) {
        int[] totalSum = {8, 10, 9, 10, 8, 12, 14, 9};
        int[] overtime = workOverTime(totalSum);
        Arrays.stream(overtime).forEach(value -> System.out.println(value));
    }

    public static int[] workOverTime(int[] totalSum) {
        int arrayHard[] = {totalSum.length - 8};
        int sum = 0;
        int count = 0;
        int count2 = 0;
        for (int i = 0; i < totalSum.length; i++) {
            if (count - 8 != 0) {
                sum = sum + totalSum[i];
            } else {
                arrayHard[count2] = sum;
                sum = 0;
                count2++;
            }
            count++;
        }
        return arrayHard;
    }
}
