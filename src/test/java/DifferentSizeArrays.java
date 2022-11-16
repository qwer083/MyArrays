public class DifferentSizeArrays {
    public static void defineLengthArray(int[] array) {
        int sumArray = 0;
        for (int i = 0; i < array.length; i++) {
            sumArray = sumArray + array[i];
        }
        if (sumArray < 100) {
            System.out.println("это маленький массив");
        } else {
            System.out.println("это большой массив");
        }
    }

    public static void main(String[] args) {

        int[] arrayFirst = new int[10];
        arrayFirst[0] = 9;
        arrayFirst[1] = 20;
        arrayFirst[2] = 31;
        arrayFirst[3] = 2;
        arrayFirst[4] = 35;
        arrayFirst[5] = 34;
        arrayFirst[6] = 55;
        arrayFirst[7] = 66;
        arrayFirst[8] = 47;
        arrayFirst[9] = 8;


        int[] arraySecond = new int[10];
        arraySecond[0] = 50;
        arraySecond[1] = -9;
        arraySecond[2] = 1;
        arraySecond[3] = -2;
        arraySecond[4] = 30;
        arraySecond[5] = -4;
        arraySecond[6] = 2;
        arraySecond[7] = -6;
        arraySecond[8] = 14;
        arraySecond[9] = -8;

        defineLengthArray(arrayFirst);
        defineLengthArray(arraySecond);
    }
}
