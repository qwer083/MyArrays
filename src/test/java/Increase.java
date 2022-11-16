public class Increase {
    public boolean defineSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Increase increase = new Increase();
        int[] needArray = new int[10];
        needArray[0] = 9;
        needArray[1] = 20;
        needArray[2] = 31;
        needArray[3] = 2;
        needArray[4] = 35;
        needArray[5] = 34;
        needArray[6] = 55;
        needArray[7] = 66;
        needArray[8] = 47;
        needArray[9] = 8;

        if (increase.defineSort(needArray) == true) {
            System.out.println("массив отсортирован по возрастанию");
        } else {
            System.out.println("массив не отсортирован по возрастанию");
        }
    }
}
