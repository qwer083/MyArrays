import java.util.Arrays;

public class WorkWeek {
    public static void main(String[] args) {
        int[] arrayDayHours = {8, 8, 8, 8, 7, 1, 0, 9, 7, 8, 2, 8, 0, 3};
        int[] sumHours = weekHours(arrayDayHours);
        Arrays.stream(sumHours).forEach(value -> System.out.println(value));

    }
    public static int[] weekHours(int[] arrayDay) {
        int arrayWeek[] = new int[arrayDay.length / 7];
        int sum = 0;
        int count = 1;
        int count2 = 0;
        for (int i = 0; i < arrayDay.length; i++) {
            if (count % 7 != 0) {
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