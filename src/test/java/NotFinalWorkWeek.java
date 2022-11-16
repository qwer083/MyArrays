import java.util.Arrays;

public class NotFinalWorkWeek {
    public static void main(String[] args) {
        int[] arrayDay = {8, 7, 6, 8, 7, 1, 0, 9, 6, 4, 9};
        int[] arrayHoursSum = weekHoursNotFinal(arrayDay);
        Arrays.stream(arrayHoursSum).forEach(value -> System.out.println(value));
    }


    public static int[] weekHoursNotFinal(int[] arrayDay) {
        int arrayWeek[] = new int[arrayDay.length / 5];
        int sum = 0;
        int count = 1;
        int count2 = 0;
        for (int i = 0; i < arrayDay.length; i++) {
            if (count % 5 != 0) {
                sum = sum + arrayDay[i];
            } else {
                arrayWeek[count2] = sum;
                sum = 0;
                count2++;
            }
            count++;
        }
        return arrayWeek;

    }
}
